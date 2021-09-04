import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainFrame extends JFrame implements ActionListener {

    private FormPanel formPanel;
    private FormTopping formTopping;
    private BurgerOffer burgerOffer,burgerOffer2;
    private StringListener nextListener;
    JFrame marco = new JFrame();
   MainFrame(){

        //marco.setSize(1100, 700);
        //marco.setLocation(100, 100);
        marco.setTitle("Burguer Shark");
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true);
        marco.setExtendedState(JFrame.MAXIMIZED_BOTH);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setLayout(new BorderLayout());
        /*marco.add(new JButton("1"), BorderLayout.EAST);
        marco.add(new JButton("2"), BorderLayout.SOUTH);
        marco.add(new JButton("3"), BorderLayout.WEST);
        marco.add(new JButton("4"), BorderLayout.NORTH);
        marco.add(new JButton("5"), BorderLayout.CENTER);*/
        //marco.getContentPane().add(BorderLayout.SOUTH, panel);
        //marco.getContentPane().add(BorderLayout.NORTH, mb);
        //marco.getContentPane().add(BorderLayout.CENTER, ta);

        burgerOffer= new BurgerOffer();
        marco.add(burgerOffer);

        formPanel = new FormPanel();
        marco.add( formPanel, BorderLayout.EAST );


        JPanel panel = new JPanel(); // el panel no está visible en la salida
        JLabel label = new JLabel("Step: ");
        label.setFont(new Font("Courier",Font.BOLD,18));
        JTextField tf = new JTextField(4); // acepta hasta 10 caracteres
        JButton next = new JButton("Next");
        next.setPreferredSize(new Dimension(140,40));
        next.setFont(new Font("Courier",Font.BOLD,18));
        JButton cancel = new JButton("Cancel");
        cancel.setPreferredSize(new Dimension(140,40));
        cancel.setFont(new Font("Courier",Font.BOLD,18));
        panel.add(label); // Componentes agregados usando Flow Layout
        panel.add(label); // Componentes agregados usando Flow Layout
        panel.add(tf);
        panel.add(next);
        next.addActionListener(this);
        panel.add(cancel);
        cancel.addActionListener(this);
        marco.getContentPane().add(BorderLayout.SOUTH, panel);

        marco.setVisible(true);

    }

    public void setStringListener(StringListener nextListener){
        this.nextListener=nextListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        String command = clicked.getText();
        System.out.println(clicked.getText());
        if (command == "Next") {
            System.out.println(clicked.getText());
            burgerOffer.setVisible(true);
            formTopping.setVisible(false);
            marco.repaint();
            //resultField.setText(evaluate(resultField.getText()));
        }else if (command == "Cancel"){
            System.out.println(clicked.getText());
            //burgerOffer.setVisible(true);
            burgerOffer.setVisible(false);
            formTopping= new FormTopping();
            marco.add(formTopping);
            marco.repaint();
           // resultField.setText(resultField.getText() + command);
        }
    }


}
