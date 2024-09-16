import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    //Private UI elements
    private JPanel Calculator;
    private JTextField Output;
    private JButton no0;
    private JButton no1;
    private JButton no2;
    private JButton no3;
    private JButton no4;
    private JButton no5;
    private JButton no6;
    private JButton no7;
    private JButton no8;
    private JButton no9;

    private JButton plus;
    private JButton minus;
    private JButton divide;
    private JButton multiply;

    private JButton AC;
    private JButton equal;

    private JButton[] buttons = {no0, no1, no2, no3, no4, no5, no6, no7, no8, no9};

    public Calculator() {

        setContentPane(Calculator);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setMinimumSize(new java.awt.Dimension(400, 500));
        setLocationRelativeTo(null);
        setVisible(true);

        //Loop through all buttons and add an action performed
        for (JButton button : buttons) {
            //System.out.println(button.getText());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Output.getText().equals("0")) {
                        System.out.print("test");
                        Output.setText(button.getText());
                    } else {
                        Output.setText(Output.getText() + button.getText());
                    }
                }
            });
        }

        // Set Output to Empty when AC
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Output.setText("0");
            }
        });

    }
    public static void main(String[] args) {
        new Calculator();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
