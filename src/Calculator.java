import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    // Private UI elements
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

    private JButton[] buttons = {no0, no1, no2, no3, no4, no5, no6, no7, no8, no9, plus, minus, divide, multiply};

    private String firstOperand = "";
    private String operator = "";

    public Calculator() {
        setContentPane(Calculator);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setMinimumSize(new java.awt.Dimension(400, 500));
        setLocationRelativeTo(null);
        setVisible(true);

        // Loop through all buttons and add an action performed
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Output.setText(Output.getText() + button.getText());
                }
            });
        }

        // Set Output to Empty when AC
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Output.setText("0");
                firstOperand = "";
                operator = "";
            }
        });

        // Add ActionListener for operators
        ActionListener operatorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstOperand = Output.getText();
                operator = ((JButton) e.getSource()).getText();
                //Output.setText("0");
            }
        };

        plus.addActionListener(operatorListener);
        minus.addActionListener(operatorListener);
        multiply.addActionListener(operatorListener);
        divide.addActionListener(operatorListener);

        // Add ActionListener for equal button
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the input from the JTextField
                    String input = Output.getText();

                    // Evaluate the expression
                    int result = evaluateExpression(input);

                    // Set the result back to the JTextField
                    Output.setText(String.valueOf(result));
                } catch (Exception ex) {
                    Output.setText("Error");
                }
            }
        });
    }

    private int evaluateExpression(String input) {
        int result = 0;
        String[] tokens = input.split("\\+");
        for (String token : tokens) {
            result += Integer.parseInt(token.trim());
        }
        return result;
    }

    public static void main(String[] args) {
        new Calculator();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}