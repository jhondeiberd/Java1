import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private FormPanel formPanel;

    MainFrame(){
        JFrame marco = new JFrame();
        marco.setSize(350, 500);
        marco.setLocation(50, 50);
        marco.setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formPanel = new FormPanel();
        marco.add( formPanel );
        marco.setVisible(true);
    }

}
