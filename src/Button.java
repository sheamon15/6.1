import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
@Author:Shea Salloum
@Lisense:GNU
 */
public class Button implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JLabel output;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public Button() {
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.white);
        frame.add(panel);

        label = new JLabel();
        label.setText("Enter Numbers");
        label.setForeground(Color.blue);

        output = new JLabel();
        output.setText("Total");

        textField1 = new JTextField(5);
        textField2 = new JTextField(5);

        button = new JButton("Add");
        button.addActionListener(this);

        panel.add(label);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button);
        panel.add(output);

        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double sum = num1 + num2;
        System.out.println("Total is" + num1 + num2);


    }




}
