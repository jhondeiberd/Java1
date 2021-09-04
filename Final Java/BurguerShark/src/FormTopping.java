import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTopping extends JPanel implements ActionListener {
    private JPanel contentPane;
    private JTextField txtCajaDeTexto;
    private JLabel tittle,name,price,maxToppings,getName,getPrice,getMaxToppings;
    private JComboBox toppingBox;
    private StringListener textListener;

    FormTopping(){
        Dimension dimension = getPreferredSize();
        dimension.width = 120;
        setPreferredSize(dimension);

        Border innerBorder = BorderFactory.createTitledBorder("Offer of Burguers");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border fullBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(fullBorder);
        setBackground(Color.LIGHT_GRAY);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));

        name = new JLabel("Name");
        p1.add(name);
        name.setFont(new Font("Serif", Font.BOLD, 25));

        getName = new JLabel("Annnnnn");
        p1.add(getName);
        getName.setFont(new Font("Serif", Font.PLAIN, 18));

        price = new JLabel("Price: ");
        p1.add(price);
        price.setFont(new Font("Serif", Font.BOLD, 25));

        getPrice = new JLabel(String.valueOf(5));
        p1.add(getPrice);
        getPrice.setFont(new Font("Serif", Font.PLAIN, 18));

        maxToppings = new JLabel("Max Toppics: ");
        p1.add(maxToppings);
        maxToppings.setFont(new Font("Serif", Font.BOLD, 25));

        getMaxToppings = new JLabel(String.valueOf(4));
        p1.add(getMaxToppings);
        getMaxToppings.setFont(new Font("Serif", Font.PLAIN, 18));

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());

        tittle = new JLabel("Hamburger " + 1);
        p1.add(tittle);
        tittle.setFont(new Font("Serif", Font.BOLD, 30));
        tittle.setForeground(Color.BLUE);
        p2.add(tittle, BorderLayout.NORTH);


        JLabel picLabel = new JLabel(new ImageIcon("images/BurgerHealthy.jpg"));

        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JLabel label = new JLabel("");

        p2.add(p1, BorderLayout.CENTER);
        p2.add(picLabel, BorderLayout.EAST);


        add(p2);
        //setLayout( new BoxLayout(this, BoxLayout.Y_AXIS) );
       //setLayout(new GridLayout(1, 1));

        addTopping();
        addTopping();
        addTopping();







    }
    public void setStringListener(StringListener textListener){
        this.textListener=textListener;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        String command = clicked.getText();
        String status = (String) toppingBox.getSelectedItem();
        System.out.println(clicked.getText());
        if(textListener != null){
            toppingBox.setSelectedIndex(0);
        }
        if (command == "=") {
            System.out.println(clicked.getText());
            //resultField.setText(evaluate(resultField.getText()));
        }else {
            System.out.println(clicked.getText());
            //resultField.setText(resultField.getText() + command);
        }
    }
    public  void addTopping(){
        toppingBox = new JComboBox();
        DefaultComboBoxModel toppingModel = new DefaultComboBoxModel();
        toppingModel.addElement("None");
        toppingModel.addElement("Tomato");
        toppingModel.addElement("Onion");
        toppingModel.addElement("Cheese");
        toppingModel.addElement("lettuce");
        toppingBox.setModel(toppingModel);

        toppingBox.setPreferredSize(new Dimension(200,40));
        toppingBox.setFont(new Font("Courier",Font.BOLD,25));
        add(toppingBox);
    }
}
