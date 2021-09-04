import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;

public class BurgerOffer extends JPanel implements ActionListener{
    private JPanel contentPane;
    private JTextField txtCajaDeTexto;
    private JTextField resultField;
    private JLabel tittle,name,price,maxToppings,getName,getPrice,getMaxToppings;
    //static Principal frame;
    private JPasswordField passwordField;
    private StringListener textListener;
    BurgerOffer(){
        //setLayout(new BorderLayout());
        //setLayout(new GridLayout(5, 4));
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        Border innerBorder = BorderFactory.createTitledBorder("Offer of Burguers");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border fullBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(fullBorder);
        setBackground(Color.LIGHT_GRAY);
        listBurgers(1,"Basic with Chicken",3.56,4,"BurguerShark/images/BurgerBasic.jpg");
        listBurgers(2,"Healty with Bacon",5.67,6,"BurguerShark/images/BurgerHealthy.jpg");
        listBurgers(3,"Deluxe with Sousage ",14.54,2,"BurguerShark/images/BurgerDeluxe.jpg");
    }

    public void setStringListener(StringListener textListener){
        this.textListener=textListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        String command = clicked.getText();
        System.out.println(clicked.getText());
        if (command == "=") {
            System.out.println(clicked.getText());
            //resultField.setText(evaluate(resultField.getText()));
        }else {
            System.out.println(clicked.getText());
            resultField.setText(resultField.getText() + command);
        }
    }

    void listBurgers(int burgers, String names, Double prices, int maxToppics, String paths) {

        //Hamburger 1
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));

        name = new JLabel("Name");
        p1.add(name);
        name.setFont(new Font("Serif", Font.BOLD, 23));

        getName = new JLabel(names);
        p1.add(getName);
        getName.setFont(new Font("Serif", Font.PLAIN, 20));

        price = new JLabel("Price: ");
        p1.add(price);
        price.setFont(new Font("Serif", Font.BOLD, 23));

        getPrice = new JLabel(String.valueOf(prices));
        p1.add(getPrice);
        getPrice.setFont(new Font("Serif", Font.PLAIN, 20));

        maxToppings = new JLabel("Max Toppics: ");
        p1.add(maxToppings);
        maxToppings.setFont(new Font("Serif", Font.BOLD, 23));

        getMaxToppings = new JLabel(String.valueOf(maxToppics));
        p1.add(getMaxToppings);
        getMaxToppings.setFont(new Font("Serif", Font.PLAIN, 20));

        //Hamburger 2
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());

        tittle = new JLabel("Hamburger " + burgers);
        p1.add(tittle);
        tittle.setFont(new Font("Serif", Font.BOLD, 30));
        tittle.setForeground(Color.BLUE);
        p2.add(tittle, BorderLayout.NORTH);

        JLabel picLabel = new JLabel(new ImageIcon(paths));

        //Hamburger 3
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());

        JPanel panel = new JPanel(); //
        JLabel label = new JLabel("");
        JTextField tf = new JTextField(5);
        tf.setPreferredSize(new Dimension(40, 50));
        tf.setFont(new Font("Courier", Font.BOLD, 25));
        JButton send = new JButton("+");
        JButton reset = new JButton("-");

        p3.add(label);
        p3.add(label);
        p3.add(tf);
        send.setPreferredSize(new Dimension(60,60));
        send.setFont(new Font("Courier",Font.BOLD,35));
        p3.add(send);

        reset.setPreferredSize(new Dimension(60,60));
        reset.setFont(new Font("Courier",Font.BOLD,35));
        p3.add(reset);

        p2.add(p1, BorderLayout.CENTER);
        p2.add(picLabel, BorderLayout.EAST);
        add(p2, BorderLayout.CENTER);
        add(send,BorderLayout.SOUTH);
        add(tf,BorderLayout.SOUTH);
        add(reset,BorderLayout.SOUTH);
    }
}
