import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques28 {
    private JFrame frame;
    private JTextField userIdField;
    private JPasswordField passwordField;

    private String validUserId = "admin";
    private String validPassword = "password";

    public Ques28() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel userIdLabel = new JLabel("User ID:");
        userIdField = new JTextField(10);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(10);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginButtonListener());

        frame.add(userIdLabel);
        frame.add(userIdField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        frame.pack();
        frame.setVisible(true);
    }

    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userId = userIdField.getText();
            String password = new String(passwordField.getPassword());

            if (userId.equals(validUserId) && password.equals(validPassword)) {
                JOptionPane.showMessageDialog(frame, "Welcome! You have successfully logged in.");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid user ID or password. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ques28();
            }
        });
    }
}
