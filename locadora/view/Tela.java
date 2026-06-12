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
//        setMinimumSize(null);
        setResizable(false);
        setLayout(new BorderLayout(5,10));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        loginLabel = new JLabel("Login:", SwingConstants.RIGHT);
        senhaLabel = new JLabel("<html> <body style='color:red;'>Password muito grande<br> tente novamente</body></html>:", SwingConstants.RIGHT);

        loginField = new JTextField(10);
        senhaField = new JPasswordField(10);

        signInButton = new JButton("Sign In");
        signOutButton = new JButton("Sign Out");

        fieldPanel = new JPanel(new SpringLayout());
        buttonPanel = new JPanel();

        fieldPanel.add(loginLabel);
        fieldPanel.add(loginField);
        fieldPanel.add(senhaLabel);
        fieldPanel.add(senhaField);

        buttonPanel.add(signInButton);
        buttonPanel.add(signOutButton);

        SpringUtilities.makeCompactGrid(fieldPanel,2,2,5,5,10,10);
//        SpringUtilities.makeCompactGrid(buttonPanel,1,2,5,5,5,5);

        add(fieldPanel, BorderLayout.PAGE_START);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
