/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class ForgotPasswordView extends JFrame{
    
    private JPanel forgotPasswordPanel;
    private JPanel confirmedAnswerPanel;
    private JLabel forgotPasswordLabel;
    private JLabel afterConfirmedLabel;
    private JTextField username;
    private JLabel securityQuestionLabel;
    private JRadioButton staffRadio;
    private JRadioButton studentRadio;
    private ButtonGroup buttonGroup;
    private JPanel groupPanel;
    private JLabel usernameLabel;
    private JLabel securityAnswerLabel;
    private JTextField securityAnswer;
    private JLabel newPasswordLabel;
    private JLabel confirmNewPasswordLabel;
    private JPasswordField newPassword;
    private JPasswordField confirmNewPassword;    
    private JComboBox securityQuestionCombo;
    private JButton confirmAnswerButton;
    private JButton resetPasswordButton;    
    private JLabel errorLabel;
    private JLabel errorLabel2;
    private Container contain;
    
    public ForgotPasswordView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3, (Toolkit.getDefaultToolkit().getScreenSize().height/3+(50)));
        this.setLocation(this.getSize().width, this.getSize().height-100);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        try {
            this.setIconImage(ImageIO.read(new File(System.getProperty("user.dir")+"\\resources\\logo.png")));
        } catch (IOException ex) {}
        
        forgotPasswordPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        confirmedAnswerPanel = new JPanel(new GridBagLayout());
        
        forgotPasswordLabel = new JLabel("Forgot Password");
        forgotPasswordLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        afterConfirmedLabel = new JLabel("Forgot Password");
        afterConfirmedLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        
        String[] securityQuestions = { "Mother's maiden name", "Name of first pet", "Favorite teacher", "Favorite book"};
        
        usernameLabel = new JLabel("User name:");
        usernameLabel.setForeground(Color.blue);
        
        securityQuestionLabel = new JLabel("Security Question:");
        securityQuestionLabel.setForeground(Color.blue);
        
        newPasswordLabel = new JLabel("New Password:");
        newPasswordLabel.setForeground(Color.blue);
        
        confirmNewPasswordLabel = new JLabel("Confirm Password:");
        confirmNewPasswordLabel.setForeground(Color.blue);
        
        securityAnswerLabel = new JLabel("Answer");
        securityAnswerLabel.setForeground(Color.blue);
        
        errorLabel = new JLabel("   ");
        errorLabel.setForeground(Color.red);
        
        errorLabel2 = new JLabel("   ");
        errorLabel2.setForeground(Color.red);
        
        username = new JTextField(15);
        securityAnswer = new JTextField(15);
        newPassword = new JPasswordField(15);
        confirmNewPassword = new JPasswordField(15);
        
        confirmAnswerButton = new JButton("Confirm Answer");        
        confirmAnswerButton.setForeground(Color.blue);
        
        resetPasswordButton = new JButton("Reset Password", new ImageIcon(System.getProperty("user.dir")+"\\resources\\Register-icon.png"));       
        resetPasswordButton.setHorizontalTextPosition(SwingConstants.LEFT);
        resetPasswordButton.setForeground(Color.blue);
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(0,0,10,0);
        forgotPasswordPanel.add(forgotPasswordLabel, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0,0,0,0);
        forgotPasswordPanel.add(usernameLabel, constraints);
        
        constraints.gridx = 1;
        forgotPasswordPanel.add(username, constraints);
        
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
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        forgotPasswordPanel.add(groupPanel, constraints);
        
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        //constraints.insets = new Insets(10,0,0,0);
        forgotPasswordPanel.add(securityQuestionLabel, constraints);
        
        securityQuestionCombo = new JComboBox(securityQuestions);
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        //constraints.insets = new Insets(10,0,0,0);
        forgotPasswordPanel.add(securityQuestionCombo, constraints);
        
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(10,0,0,0);
        forgotPasswordPanel.add(securityAnswerLabel, constraints);
        
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(0,0,0,0);
        forgotPasswordPanel.add(securityAnswer, constraints);
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridy = 7;
        constraints.insets = new Insets(10,0,0,0);
        forgotPasswordPanel.add(confirmAnswerButton, constraints);
        
        constraints.gridy = 8;
        constraints.insets = new Insets(10,0,0,0);
        forgotPasswordPanel.add(errorLabel, constraints);
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(0,0,0,0);
        confirmedAnswerPanel.add(afterConfirmedLabel, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(10,0,0,0);
        confirmedAnswerPanel.add(newPasswordLabel, constraints);
        
        constraints.gridx = 1;
        confirmedAnswerPanel.add(newPassword, constraints);
        
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.insets = new Insets(20,0,0,10);
        confirmedAnswerPanel.add(confirmNewPasswordLabel, constraints);
        
        constraints.gridx = 1;
        constraints.insets = new Insets(20,0,0,0);
        confirmedAnswerPanel.add(confirmNewPassword, constraints);
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(20,0,0,0);
        confirmedAnswerPanel.add(resetPasswordButton, constraints);
        
        constraints.gridy = 4;
        constraints.insets = new Insets(10,0,0,0);
        confirmedAnswerPanel.add(errorLabel2, constraints);
        
        this.add(forgotPasswordPanel);        
    }

    /**
     * @return the resetPasswordButton
     */
    public JButton getResetPasswordButton() {
        return resetPasswordButton;
    }
    
    public void repaintAfterConfirmed(){
        contain = getContentPane();        
        contain.removeAll();
        contain.add(confirmedAnswerPanel);
        this.validate();
        this.repaint();
    }

    /**
     * @return the confirmAnswerButton
     */
    public JButton getConfirmAnswerButton() {
        return confirmAnswerButton;
    }

    /**
     * @return the securityAnswer
     */
    public JTextField getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * @return the newPassword
     */
    public JPasswordField getNewPassword() {
        return newPassword;
    }

    /**
     * @return the confirmNewPassword
     */
    public JPasswordField getConfirmNewPassword() {
        return confirmNewPassword;
    }

    /**
     * @return the errorLabel
     */
    public JLabel getErrorLabel() {
        return errorLabel;
    }

    /**
     * @return the errorLabel2
     */
    public JLabel getErrorLabel2() {
        return errorLabel2;
    }
}
