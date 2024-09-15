import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel Calculator;
    private JTextField Output;
    private JButton no7;
    private JButton no8;
    private JButton no9;
    private JButton no4;
    private JButton no5;
    private JButton no6;
    private JButton plus;
    private JButton minus;
    private JButton no1;
    private JButton no2;
    private JButton no3;
    private JButton divide;
    private JButton no0;
    private JButton pie;
    private JButton dot;
    private JButton multiply;
    private JButton AC;
    private JButton equal;
    private JButton positivenegative;

    public Calculator() {

        setContentPane(Calculator);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setMinimumSize(new java.awt.Dimension(300, 400));
        setLocationRelativeTo(null);
        setVisible(true);

        // Adding ActionListener to no1 button
        no1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Output.setText(Output.getText() + "1");
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
