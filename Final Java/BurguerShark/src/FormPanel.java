import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FormPanel extends JPanel   {

    private JTextField resultField;

    FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 350;
        setPreferredSize(dimension);

        Border innerBorder = BorderFactory.createTitledBorder("Orders");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border fullBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(fullBorder);

        setBackground(Color.LIGHT_GRAY);

        resultField = new JTextField();
        resultField.setPreferredSize(new Dimension(350, 50));
        resultField.setFont(new Font("Courier", Font.BOLD, 25));
        //add( new TextField( "0" ) );
        add(resultField);

        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.HORIZONTAL);
        separator.setBounds(10, 50, 100, 297);
        add(separator);
        try {
            File img = new File("/images/burger1.jpg");
            //File img = new File("images/BurgerBasic.jpg");
            BufferedImage image = ImageIO.read(img);
            System.out.println(image);
            BufferedImage myPicture = ImageIO.read(new File("/images/burger1.jpg"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            add(picLabel);
        } catch (IOException e) {
            System.out.println(("Error in the imagen new"));
            e.printStackTrace();
        }

    }
}
