/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.view;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Jairo
 */
public class LoginFrameView extends JFrame{
    private JPanel loginPanel;
    //private JPanel fieldsPanel;
    private JLabel loginLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel forgotPassLabel;
    private JLabel errorLabel;
    private JTextField username;
    private JPasswordField password;
    private JButton loginButton;
    private JLabel signUpLabel;
    private JRadioButton staffRadio;
    private JRadioButton studentRadio;
    private ButtonGroup buttonGroup;
    private JPanel groupPanel;
    
    public JButton getLoginButton(){
        return loginButton;
    }
    
    public JLabel getErrorLabel(){
        return errorLabel;
    }
    
    public JRadioButton getStaffRadio(){
        return staffRadio;
    }
    
    public JRadioButton getStudentRadio(){
        return studentRadio;
    }
    
    public LoginFrameView(){
        
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3, (Toolkit.getDefaultToolkit().getScreenSize().height/3+(50)));
        this.setLocation(this.getSize().width, this.getSize().height-100);
        //this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        try {
            //this.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir")+"resources\\logo.png"));
            //this.setIconImage(new ImageIcon(getClass().getResource(System.getProperty("user.dir")+"\\resources\\logo.png")).getImage());
            this.setIconImage(ImageIO.read(new File(System.getProperty("user.dir")+"\\resources\\logo.png")));
        } catch (IOException ex) {
            //System.out.println(System.getProperty("user.dir")+"\\resources\\logo.png");
        }
        //System.out.println(System.getProperty("user.dir")+"\\resources\\logo.png");
        
        loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //loginPanel.setSize(this.getSize());
        
        loginLabel = new JLabel("System Login");
        loginLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        
        forgotPassLabel = new JLabel("Forgot Password");
        forgotPassLabel.setForeground(Color.blue);
        usernameLabel = new JLabel("User name:");
        usernameLabel.setForeground(Color.blue);
        passwordLabel = new JLabel("Password:");
        errorLabel = new JLabel("   ");
        errorLabel.setForeground(Color.red);
        passwordLabel.setForeground(Color.blue);
        
        username = new JTextField(15);
        password = new JPasswordField(15);
        
        loginButton = new JButton("Login", new ImageIcon(System.getProperty("user.dir")+"\\resources\\Actions-go-next-icon.png"));
        loginButton.setIconTextGap(75);
        loginButton.setHorizontalTextPosition(SwingConstants.LEFT);
        loginButton.setHorizontalAlignment(SwingConstants.RIGHT);
        loginButton.setForeground(Color.blue);
        
        signUpLabel = new JLabel("Sign Up");
        signUpLabel.setForeground(Color.blue);         
         
        //constraints.weightx = 0.5;
        //constraints.weighty = 0.5;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(0,0,10,0);
        loginPanel.add(loginLabel, constraints);
        
        //constraints.weightx = 0.5;
        //constraints.weighty = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0,10,10,0);
        loginPanel.add(usernameLabel, constraints);
        
        //constraints.weightx = 0.5;
        //constraints.weighty = 1;
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        //constraints.gridy = 1;
        loginPanel.add(username, constraints);
        
        //constraints.weightx = 0.5;
        //constraints.weighty = 1;
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        loginPanel.add(passwordLabel, constraints);
        
        //constraints.weightx = 0.5;
        //constraints.weighty = 1;
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        //constraints.gridy = 2;
        loginPanel.add(password, constraints);
        
        staffRadio = new JRadioButton("Staff");
        studentRadio = new JRadioButton("Student");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(staffRadio);
        buttonGroup.add(studentRadio);
        groupPanel = new JPanel();
        studentRadio.setSelected(true);
        groupPanel.add(studentRadio);
        groupPanel.add(staffRadio);
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        loginPanel.add(groupPanel, constraints);
        
        //constraints.weightx = 0.5;
        //constraints.weighty = 1;
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        //constraints.gridx = 0;
        constraints.gridy = 4;
        //constraints.gridwidth = 2;
        //loginButton.setSize(loginButton.getSize().width, 530);
        loginPanel.add(loginButton, constraints);        
        
        constraints.fill = GridBagConstraints.CENTER;
        groupPanel = new JPanel();
        groupPanel.add(forgotPassLabel);
        groupPanel.add(new JLabel("    |    "));
        groupPanel.add(signUpLabel);        
        //constraints.gridx = 0;
        constraints.gridy = 5;
        //constraints.gridwidth = 2;
        constraints.insets = new Insets(10,0,0,0);
        loginPanel.add(groupPanel, constraints);
        
        //constraints.fill = GridBagConstraints.CENTER;
        //constraints.gridx = 0;
        constraints.gridy = 6;
        //constraints.gridwidth = 2;
        constraints.insets = new Insets(10,0,0,0);
        loginPanel.add(errorLabel, constraints);
        
        /*FlowLayout loginPanelLayout = new FlowLayout(FlowLayout.CENTER, 10, 15);
        loginPanelLayout.setAlignment(FlowLayout.CENTER);
        loginPanelLayout.setAlignOnBaseline(true);
        
        loginPanel = new JPanel(loginPanelLayout);
        loginPanel.setSize(this.getSize());
        
        GridLayout fieldsPanelLayout = new GridLayout(2, 2, 0, 5);
        
        fieldsPanel = new JPanel(fieldsPanelLayout);
        fieldsPanel.setSize(fieldsPanel.getSize().width, fieldsPanel.getSize().height/2);
        
        loginLabel = new JLabel("System Login");
        loginLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        
        usernameLabel = new JLabel("User name:");
        passwordLabel = new JLabel("Password:");
        
        username = new JTextField(15);
        password = new JTextField(15);
        
        loginButton = new JButton("Login");
        
        loginPanel.add(loginLabel);
        fieldsPanel.add(usernameLabel);
        fieldsPanel.add(username);
        fieldsPanel.add(passwordLabel);
        fieldsPanel.add(password);
        loginPanel.add(fieldsPanel);
        loginPanel.add(loginButton);
        */
        this.add(loginPanel);
        
        
       
    }

    /**
     * @return the username
     */
    public JTextField getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public JPasswordField getPassword() {
        return password;
    }

    /**
     * @return the forgotPassLabel
     */
    public JLabel getForgotPassLabel() {
        return forgotPassLabel;
    }

    /**
     * @return the signUpLabel
     */
    public JLabel getSignUpLabel() {
        return signUpLabel;
    }
}
