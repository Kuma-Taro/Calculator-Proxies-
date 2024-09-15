import javax.swing.*;

public class Calculator extends JFrame {
    private JPanel Calculator;
    private JLabel Output;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button7;
    private JButton button8;
    private JButton a1Button1;
    private JButton a2Button1;
    private JButton a3Button1;
    private JButton button12;
    private JButton a0Button;
    private JButton πButton;
    private JButton button1;
    private JButton button2;
    private JButton ACButton;
    private JButton button3;

    public Calculator() {
        setContentPane(Calculator);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
