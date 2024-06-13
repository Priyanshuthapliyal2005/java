import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques30 extends JFrame {
    private JTextField cityTextField;
    private DefaultListModel<String> cityListModel;
    private JList<String> cityList;

    public Ques30() {
        setTitle("List Box Demo");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for the input and buttons
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel label = new JLabel("Adding Name to a List");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        inputPanel.add(label, gbc);
        cityTextField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        inputPanel.add(cityTextField, gbc);

        JButton addButton = new JButton("ADD >>");
        gbc.gridx = 1;
        gbc.gridy = 1;
        inputPanel.add(addButton, gbc);
        JButton exitButton = new JButton("Exit");
        gbc.gridx = 1;
        gbc.gridy = 2;
        inputPanel.add(exitButton, gbc);

        add(inputPanel, BorderLayout.CENTER);

        // List to display cities
        cityListModel = new DefaultListModel<>();
        cityList = new JList<>(cityListModel);
        JScrollPane listScrollPane = new JScrollPane(cityList);
        listScrollPane.setPreferredSize(new Dimension(200, 100));
        add(listScrollPane, BorderLayout.EAST);

        // Action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String city = cityTextField.getText().trim();
                if (!city.isEmpty()) {
                    cityListModel.addElement(city);
                    cityTextField.setText("");
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ques30().setVisible(true);
            }
        });
        System.out.println("*************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println("*************************************************************************");
    
    }
}