import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        Container pane = frame.getContentPane();

       // frame.setLayout(new BoxLayout(pane,BoxLayout.X_AXIS));

        frame.setLayout(new GridLayout(3,2));

        JLabel lbName = new JLabel("Name");
        JLabel lbEmail = new JLabel("Email");

        JTextField txtName = new JTextField();
        JTextField txtEmail = new JTextField();

        JButton btnSave = new JButton("SAVE");
        JButton btnDelete = new JButton("DELETE");
        //JButton btn1 = new JButton("BENİ YIKA");
        //btnKaydet.setSize(75,75);
        //(frame.getContentPane().add(btnKaydet);
        pane.add(lbName);
        lbName.setHorizontalAlignment(JLabel.CENTER);
        lbEmail.setHorizontalAlignment(JLabel.CENTER);
        pane.add(txtName);
        pane.add(lbEmail);
        pane.add(txtEmail);

        pane.add(btnSave);
        pane.add(btnDelete);


        frame.setVisible(true);
    }
}
