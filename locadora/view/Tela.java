package view;

import layouts.SpringUtilities;

import javax.swing.*;
import java.awt.*;

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
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        loginLabel = new JLabel("Login:");
        senhaLabel = new JLabel("Senha:");

        loginField = new JTextField(10);
        senhaField = new JPasswordField(10);

        signInButton = new JButton("Sign In");
        signOutButton = new JButton("Sign Out");

        fieldPanel = new JPanel(new SpringLayout());
        buttonPanel = new JPanel(new SpringLayout());

        fieldPanel.add(loginLabel);
        fieldPanel.add(loginField);
        fieldPanel.add(senhaLabel);
        fieldPanel.add(senhaField);

        buttonPanel.add(signInButton);
        buttonPanel.add(signOutButton);

        SpringUtilities.makeGrid(fieldPanel,2,2,5,5,5,5);
        SpringUtilities.makeGrid(buttonPanel,1,2,5,5,5,5);

        add(fieldPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
