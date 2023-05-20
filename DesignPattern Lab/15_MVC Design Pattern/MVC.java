import javax.swing.*;

public class MVC extends JFrame {
    private JLabel nameLabel, companyLabel, priceLabel;
    private JTextField nameField, companyField, priceField;
    private JButton submitButton;

    public MVC() {
        // Set up the GUI components
        nameLabel = new JLabel("Aircraft Name:");
        companyLabel = new JLabel("Company:");
        priceLabel = new JLabel("Price:");
        nameField = new JTextField(20);
        companyField = new JTextField(20);
        priceField = new JTextField(20);
        submitButton = new JButton("Submit");

        // Set the layout and add the components
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(nameLabel);
        add(nameField);
        add(companyLabel);
        add(companyField);
        add(priceLabel);
        add(priceField);
        add(submitButton);

        // Add an action listener to the submit button
        submitButton.addActionListener(e -> {
            // Get the values entered by the user
            String name = nameField.getText();
            String company = companyField.getText();
            double price = Double.parseDouble(priceField.getText());

            // Display the values in a dialog box
            JOptionPane.showMessageDialog(this, "Aircraft Name: " + name +
                    "\nCompany: " + company + "\nPrice: $" + price);
        });

        // Set the window properties and make it visible
        setTitle("Aircraft Information");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MVC();
    }
}
