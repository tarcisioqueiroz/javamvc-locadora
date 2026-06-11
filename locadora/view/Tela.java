package view;

import layouts.SpringUtilities;

import javax.swing.*;

public class Tela extends JFrame {
    JLabel loginLabel, senhaLabel;
    JTextField loginField;
    JPasswordField senhaField;
    JPanel fieldPanel, buttonPanel;
    JButton signInButton, signOutButton;

    public Tela(){
        super("Login");
        setSize(400,200);
        setResizable(false);
        setLayout(new SpringLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        loginLabel = new JLabel("Login:");
        senhaLabel = new JLabel("Senha:");

        loginField = new JTextField(10);
        senhaField = new JPasswordField(10);

        signInButton = new JButton("Sign In");
        signOutButton = new JButton("Sign Out");

        fieldPanel = new JPanel();
        buttonPanel = new JPanel();

        fieldPanel.add(loginLabel, loginField);
        buttonPanel.add(signInButton,signOutButton);




        setVisible(true);
    }
}
