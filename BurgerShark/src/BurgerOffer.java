import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BurgerOffer extends JPanel implements ActionListener{
    private JPanel contentPane;
    private JTextField resultField;
    private JLabel tittle,price,maxToppings,getPrice,getMaxToppings;
    private JPasswordField passwordField;
    private StringListener textListener;
    private JRadioButton [] radioButtons = new JRadioButton[3];
    private ButtonGroup GroupRadios = new ButtonGroup();
    private String optionBurger;

    private String selectName;
    private Double selectprice;
    private int selectmaxToppings;
    BurgerOffer(){

        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        Border innerBorder = BorderFactory.createTitledBorder("Offer of Burgers");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border fullBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(fullBorder);
        setBackground(Color.LIGHT_GRAY);

    }

    public void setStringListener(StringListener textListener){
        this.textListener=textListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String optionBurger = "";
        try {
            optionBurger = GroupRadios.getSelection().getActionCommand();
            this.optionBurger=optionBurger;
        }catch (Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Please select a Burger!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    void listBurgers(int burgers, String names, Double prices, int maxTopping, String paths,String burgerRadio ) {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));

        price = new JLabel("Price: ");
        p1.add(price);
        price.setFont(new Font("Serif", Font.BOLD, 25));

        getPrice = new JLabel(String.valueOf(prices));
        p1.add(getPrice);
        getPrice.setFont(new Font("Serif", Font.PLAIN, 18));

        maxToppings = new JLabel("Max Toppings: ");
        p1.add(maxToppings);
        maxToppings.setFont(new Font("Serif", Font.BOLD, 25));

        getMaxToppings = new JLabel(String.valueOf(maxTopping));
        p1.add(getMaxToppings);
        getMaxToppings.setFont(new Font("Serif", Font.PLAIN, 18));

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());

        tittle = new JLabel("Hamburger " + names);
        p1.add(tittle);
        tittle.setFont(new Font("Serif", Font.BOLD, 25));
        tittle.setForeground(Color.BLUE);
        p2.add(tittle, BorderLayout.NORTH);


        JLabel picLabel = new JLabel(new ImageIcon(paths));

        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());

        JPanel panel = new JPanel(); //

        radioButtons[burgers-1] = new JRadioButton(burgerRadio);
        radioButtons[burgers-1].setName(Integer.toString(burgers));
        radioButtons[burgers-1].setActionCommand(Integer.toString(burgers));
        radioButtons[burgers-1].setPreferredSize(new Dimension(200,50));
        radioButtons[burgers-1].setFont(new Font("Courier",Font.BOLD,18));
        radioButtons[burgers-1].addActionListener(this);
        GroupRadios.add(radioButtons[burgers-1]);
        System.out.println(radioButtons[burgers-1].getName()+ "<-name     command->"+burgerRadio);
        p2.add(p1, BorderLayout.CENTER);
        p2.add(picLabel, BorderLayout.EAST);
        add(p2, BorderLayout.CENTER);
        add(radioButtons[burgers-1],BorderLayout.SOUTH);

    }
    public String getDataBurger(){
        return  "Name Burguer: "
                + this.selectName+ "\nPrice : "
                + selectprice + "\nMax Toppings: "
                + selectmaxToppings ;
    }

    public String getOptionBurger(){
        return  this.optionBurger ;
    }

}
