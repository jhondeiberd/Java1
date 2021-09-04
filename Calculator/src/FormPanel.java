import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel implements ActionListener {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton btn14;
    private JButton btn15;
    private JButton btn16;
    private JTextField result;
    private StringListener textListener;

    FormPanel(){
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        Border innerBorder = BorderFactory.createTitledBorder("");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        Border fullBorder = BorderFactory.createCompoundBorder(outerBorder,innerBorder);
        setBorder(fullBorder);

        setBackground( Color.BLACK );
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 4));
        result = new JTextField();
        result.setPreferredSize(new Dimension(350,50));
        result.setFont(new Font("Arial",Font.BOLD,36));

        add(result, BorderLayout.NORTH);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");
        btn11 = new JButton("+");
        btn12 = new JButton("-");
        btn13 = new JButton("*");
        btn14 = new JButton("/");
        btn15 = new JButton("=");
        btn16 = new JButton("C");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);

        p1.add(btn7);
        p1.add(btn8);
        p1.add(btn9);
        p1.add(btn16);

        p1.add(btn4);
        p1.add(btn5);
        p1.add(btn6);
        p1.add(btn14);

        p1.add(btn1);
        p1.add(btn2);
        p1.add(btn3);
        p1.add(btn13);

        p1.add(btn11);
        p1.add(btn10);
        p1.add(btn12);
        p1.add(btn15);

        add(p1, BorderLayout.CENTER);

    }

    public void setStringListener(StringListener textListener){
        this.textListener=textListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton action = (JButton) e.getSource();

        if (action.getText() == "=") {
            result.setText(equation(result.getText()));
        }
        else if (action.getText() == "C") {
            result.setText("");
        } else {
            result.setText(result.getText() + action.getText());
        }
    }

    public String equation(String expression) {
        char[] array = expression.toCharArray();
        String num1 = "";String num2 = "";String operator = "";
        double result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                if(operator.isEmpty()){
                    num1 += array[i];
                }else{
                    num2 += array[i];
                }
            }

            if(array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                operator += array[i];
            }
        }

        if (operator.equals("+"))
            result = addResult(Double.parseDouble(num1) ,Double.parseDouble(num2));
        else if (operator.equals("-"))
            result = restResult(Double.parseDouble(num1) ,Double.parseDouble(num2));
        else if (operator.equals("/"))
            result = divResult(Double.parseDouble(num1) ,Double.parseDouble(num2));
        else
            result = multResult(Double.parseDouble(num1) ,Double.parseDouble(num2));
        return num1 + operator + num2 + " = " + result;
    }

    public double addResult(double num1, double num2){
        return num1 + num2;
    }

    public double restResult(double num1, double num2){
        return num1 - num2;
    }

    public double divResult(double num1, double num2){
        return num1 / num2;
    }

    public double multResult(double num1, double num2){
        return num1 * num2;
    }
}
