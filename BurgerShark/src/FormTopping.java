import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class FormTopping extends JPanel implements ActionListener {

    private JLabel tittle, name, price,  getPrice;
    private StringListener textListener;
    private JComboBox [] comboBoxes;
    private static ArrayList<Topping> allToppings;
    ArrayList<String> selectToppings = new ArrayList<String>();

    private JComboBox toppingBox;

    FormTopping(){
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);
        Border innerBorder = BorderFactory.createTitledBorder("Offer of Toppings");
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
            JComboBox comboBoxTopping = (JComboBox) e.getSource();
            comboBoxTopping.getSelectedItem();
            String nameComboBox=comboBoxTopping.getName();
            String itemSelected=(comboBoxTopping.getName()).toString();
            //System.out.println(comboBoxTopping.getSelectedItem()+" name combo box:"+comboBoxTopping.getName()+" select item:"+ comboBoxTopping.getSelectedItem());
            selectToppings.add(comboBoxTopping.getSelectedItem().toString());
    }
    public  void addTopping(int totalComboBoxes){
        comboBoxes= new JComboBox[totalComboBoxes];
        allToppings = Fridge.prepareToppings();
        for (int i=0;i<totalComboBoxes;i++) {
            comboBoxes[i] = new JComboBox();
            comboBoxes[i].setName(Integer.toString(i));
            comboBoxes[i].setActionCommand(Integer.toString(i));
            DefaultComboBoxModel toppingModel = new DefaultComboBoxModel();
            toppingModel.addElement("None");
            for (Topping topping: allToppings) {
                toppingModel.addElement(topping.getName());
            }
                comboBoxes[i].setModel(toppingModel);
                comboBoxes[i].setPreferredSize(new Dimension(200,40));
                comboBoxes[i].setFont(new Font("Courier",Font.BOLD,25));
                add(comboBoxes[i]);
                comboBoxes[i].addActionListener(this);
                System.out.println(comboBoxes[i].getName());
        }

    }
    void listTopping(String names, Double prices, String paths) {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));
        name = new JLabel("Name");
        price = new JLabel("Price: ");
        p1.add(price);
        price.setFont(new Font("Serif", Font.BOLD, 25));
        getPrice = new JLabel(String.valueOf(prices));
        p1.add(getPrice);
        getPrice.setFont(new Font("Serif", Font.PLAIN, 18));
        tittle = new JLabel(names);
        tittle.setFont(new Font("Serif", Font.BOLD, 30));
        tittle.setForeground(Color.BLUE);
        p1.add(tittle);
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(tittle, BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);
        JLabel picLabel = new JLabel(new ImageIcon(paths));
        p2.add(picLabel, BorderLayout.EAST);
        add(p2, BorderLayout.CENTER);
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        add(p3, BorderLayout.SOUTH);
    }

    public ArrayList<String> getSelectedToppings(){
        return  selectToppings;
    }

}
