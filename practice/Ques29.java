
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques29 {
    public static void main(String[] args) {
        // Arrays to store country names and their capitals
        String[] countryNames = {"United States", "Canada", "Mexico", "France", "Germany", "Italy", "Spain", "China", "Japan", "India"};
        String[] capitalNames = {"Washington, D.C.", "Ottawa", "Mexico City", "Paris", "Berlin", "Rome", "Madrid", "Beijing", "Tokyo", "New Delhi"};

        // Create a JFrame window
        JFrame frame = new JFrame("Country Capital Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold the quiz components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Create a JLabel and a JComboBox for country names
        JLabel countryLabel = new JLabel("Select a country:");
        panel.add(countryLabel);
        JComboBox<String> countryBox = new JComboBox<>(countryNames);
        panel.add(countryBox);

        // Create a JLabel and a JComboBox for capital names
        JLabel capitalLabel = new JLabel("Select a capital:");
        panel.add(capitalLabel);
        JComboBox<String> capitalBox = new JComboBox<>(capitalNames);
        panel.add(capitalBox);

        // Create a JButton to check the answer
        JButton checkButton = new JButton("Check answer");
        panel.add(checkButton);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedCountryIndex = countryBox.getSelectedIndex();
                int selectedCapitalIndex = capitalBox.getSelectedIndex();
                if (capitalNames[selectedCapitalIndex].equals(capitalNames[selectedCountryIndex])) {
                    JOptionPane.showMessageDialog(frame, "Correct answer!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Incorrect answer. The correct capital for " + countryNames[selectedCountryIndex] + " is " + capitalNames[selectedCountryIndex]);
                }
            }
        });

        // Create a JLabel to display the result
        JLabel resultLabel = new JLabel("", SwingConstants.CENTER);
        panel.add(resultLabel);

        // Add the JPanel to the JFrame
        frame.getContentPane().add(panel);

        // Set the JFrame size and make it visible
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

