import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener {

    private FormPanel formPanel;
    private FormTopping formTopping;
    private BurgerOffer burgerOffer;
    private StringListener nextListener;
    JFrame marco = new JFrame();
    private static ArrayList<Burger> allBurgers;
    private static ArrayList<Topping> allToppings;
    ArrayList<String> selectToppings = new ArrayList<String>();
    private JButton back,next;
    private int page=1;
   MainFrame(){

        marco.setTitle("Burger Shark");
        marco.setExtendedState(JFrame.MAXIMIZED_BOTH);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(new BorderLayout());

        burgerOffer= new BurgerOffer();
        marco.add(burgerOffer);

        formPanel = new FormPanel();
        marco.add( formPanel, BorderLayout.EAST );


        JPanel panel = new JPanel();
        back = new JButton("<-Back");
        back.setPreferredSize(new Dimension(140,40));
        back.setFont(new Font("Courier",Font.BOLD,18));
        back.setEnabled(false);
        next = new JButton("Next->");
        next.setPreferredSize(new Dimension(140,40));
        next.setFont(new Font("Courier",Font.BOLD,18));
        panel.add(back);
        back.addActionListener(this);
        panel.add(next);
        next.addActionListener(this);
        marco.getContentPane().add(BorderLayout.SOUTH, panel);
       allBurgers = Fridge.prepareBurgers();

       int i = 1;
       for (Burger burger: allBurgers) {
           burgerOffer.listBurgers(i,i+" "+burger.getName(),burger.getPrice(),burger.getMaxToppings(),
                   "images/Burger"+ i +".jpg",burger.getName());
           i++;
       }
       marco.repaint();
       marco.setVisible(true);
    }

    public void setStringListener(StringListener nextListener){
        this.nextListener=nextListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            JButton clicked = (JButton) e.getSource();
            String command = clicked.getText();
            if (command == "<-Back") {
                if (page == 2) {
                    burgerOffer.setVisible(true);
                    formTopping.setVisible(false);
                    marco.repaint();
                } else if (page == 3) {
                    formTopping.setVisible(true);
                    marco.repaint();
                }
            } else if (command == "Next->") {
                try {
                    if (Integer.parseInt(burgerOffer.getOptionBurger()) > 0) {
                        burgerOffer.setVisible(false);
                        next.setText("Print");
                        page++;
                        back.setEnabled(true);
                        formPanel.clearTextBurguer();
                        Burger selectedBurger = selectBurger(Integer.parseInt(burgerOffer.getOptionBurger()));
                        listToppings(selectedBurger.getMaxToppings());

                        Bill bill = new Bill(selectedBurger);
                        formPanel.appendTextBurguer("Name Burguer: "
                                + selectedBurger.getName() + "\nPrice : "
                                + selectedBurger.getPrice() + "\nMax Toppings: "
                                + selectedBurger.getMaxToppings());
                        formPanel.setTotal(bill.generateReciept());
                        formPanel.setAmount(selectedBurger.getPrice());
                        formPanel.setFieldAmount();
                        formPanel.setFieldTotal();
                        marco.add(formTopping);
                        marco.repaint();

                    }
                  } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please select a Burger!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );

                }
            } else if (command == "Print") {
                try {
                    page++;
                    back.setEnabled(false);
                    next.setEnabled(false);
                    formPanel.clearTextToppings();
                    formTopping.setVisible(false);
                    selectToppings = formTopping.getSelectedToppings();
                    for (int i = 0; i < selectToppings.size(); i++) {
                        formPanel.appendTextToppings("\n" + i + " -> " + selectToppings.get(i) + ",");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please select Toppings!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
    }

    public static Burger selectBurger(int choice) {
        Burger burger= null;
        try {
            // if user chooses the wrong burger.
            if (choice > 3 || choice < 1) {
                System.out.println("Please select the burger shown in the list.");
            } else {
                burger = allBurgers.get(choice - 1);

            }

        } catch (Exception e) {
            System.out.println("Please select the burger shown in the list. " + e);
        }
        return burger;
    }
    public void listToppings(int choice){
        formTopping= new FormTopping();
        marco.add(formTopping);
        allToppings = Fridge.prepareToppings();
        int i = 1;
        for (Topping topping: allToppings) {
           formTopping.listTopping(i + ". " + topping.getName(), topping.getPrice(),"images/Topping"+i+".jpg");
            i++;
        }
        formTopping.addTopping(choice);
        marco.repaint();
    }


}
