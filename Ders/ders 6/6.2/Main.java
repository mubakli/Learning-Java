import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("Hello GUI");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//
//        Container pane = frame.getContentPane();
//
//        // frame.setLayout(new BoxLayout(pane,BoxLayout.X_AXIS));
//
//        //frame.setLayout(new GridLayout(3,2));
//
//        frame.setLayout(null);
//
//        JLabel lbName = new JLabel("Name");
//        JLabel lbEmail = new JLabel("Email");
//
//        JTextField txtName = new JTextField();
//        JTextField txtEmail = new JTextField();
//
//        JButton btnSave = new JButton("SAVE");
//        JButton btnDelete = new JButton("DELETE");
//
//
//        pane.add(lbName);
//        pane.add(txtName);
//        pane.add(lbEmail);
//        pane.add(txtEmail);
//
//        pane.add(btnSave);
//        pane.add(btnDelete);
//        lbName.setBounds(20,10,80,30);
//        txtName.setBounds(120,10,200,30);
//        lbEmail.setBounds(20,50,80,30);
//        txtEmail.setBounds(120,50,200,30);
//        btnSave.setBounds(20,100,80,30);
//        btnDelete.setBounds(120,100,80,30);
        JFrame frame = new JFrame("Hello GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JTextField txtNum1 = new JTextField();
        JTextField txtNum2 = new JTextField();

        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnDivide = new JButton("/");
        JButton btnTimes = new JButton("x");

        frame.setVisible(true);
    }
}
