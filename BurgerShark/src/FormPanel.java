import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FormPanel extends JPanel   {

    private JLabel tittle,amountLabel,totalLabel;
    private StringListener textListener;
    private JTextArea textAreaBurguer,textAreaToppings;
    private JTextField amountField,totalField;
    private double amount,total;


    FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 350;
        setPreferredSize(dimension);

        Border innerBorder = BorderFactory.createTitledBorder("Orders");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border fullBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(fullBorder);
        setBackground(Color.LIGHT_GRAY);
        try {
            File img = new File("images/Burger1.jpg");
            BufferedImage image = ImageIO.read(img);
            System.out.println(image);
            BufferedImage myPicture = ImageIO.read(new File("images/Burger1.jpg"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            add(picLabel);
        } catch (IOException e) {
            System.out.println(("Error in the picture"));
            e.printStackTrace();
        }

        //Tittle ***********
        tittle = new JLabel("Fast Food Burger Shark");
        tittle.setPreferredSize(new Dimension(250,50));
        tittle.setFont(new Font("Courier",Font.BOLD,20));
        add(tittle);

        //Create textArea Burgers ***********
        textAreaBurguer = new JTextArea();
        textAreaBurguer.setPreferredSize(new Dimension(250,80));
        textAreaBurguer.setBackground(new Color(229,255,204));
        add(new JScrollPane(textAreaBurguer), BorderLayout.CENTER);
        textAreaBurguer.setEditable(false);

        //Create textArea Toppings ***********
        textAreaToppings = new JTextArea();
        textAreaToppings.setPreferredSize(new Dimension(250,80));
        textAreaToppings.setBackground(new Color(229,255,204));
        add(new JScrollPane(textAreaToppings), BorderLayout.CENTER);
        textAreaToppings.setEditable(false);

        //Create Footer
        amountLabel = new JLabel("Amount: ");
        amountLabel.setPreferredSize(new Dimension(250,50));
        amountLabel.setFont(new Font("Courier",Font.BOLD,20));
        add(amountLabel);

        String amountpay=Double.toString(this.amount);
        amountField = new JTextField(amountpay);
        amountField.setPreferredSize(new Dimension(250,35));
        amountField.setFont(new Font("Courier",Font.BOLD,15));
        amountField.setEditable(false);
        add(amountField);

        totalLabel = new JLabel("Total: ");
        totalLabel.setPreferredSize(new Dimension(250,50));
        totalLabel.setFont(new Font("Courier",Font.BOLD,20));
        add(totalLabel);

        String totalpay=Double.toString(this.total);
        totalField = new JTextField(totalpay);
        totalField.setPreferredSize(new Dimension(250,35));
        totalField.setFont(new Font("Courier",Font.BOLD,15));
        totalField.setEditable(false);
        add(totalField);


    }
    public void appendTextBurguer(String text){
        textAreaBurguer.append(text);
    }

    public void clearTextBurguer(){
        textAreaBurguer.setText("");
    }

    public void appendTextToppings(String text){
        textAreaToppings.append(text);
    }

    public void clearTextToppings(){
        textAreaToppings.setText("");
    }

    public void separatorData() {
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.HORIZONTAL);
        separator.setBounds(10, 50, 100, 297);
        add(separator);
    }

    public void setTotal(double total){
        this.total=total;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public void setFieldTotal(){
        totalField.setText(Double.toString(this.total));
    }

    public void setFieldAmount(){
        amountField.setText(Double.toString(this.amount));
    }
}
