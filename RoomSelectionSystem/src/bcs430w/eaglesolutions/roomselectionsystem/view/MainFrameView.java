/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jairo
 */
public class MainFrameView extends JFrame{

    /**
     *
     */
    
    private JLabel welcomeLabel;
    private JPanel mainPanel;
    private JButton goToLogin;
    private JButton goToRoomSelection;
    private JButton goToHousingApplication;
    private JButton goToFinancialStatus;
    private JButton goToAddStudent;
    private JButton goToRemoveStudent;
    
    public MainFrameView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height/2);
        this.setLocation(this.getSize().width/2, this.getSize().height/2);
        //this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        //mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        //mainPanel.setLayout(new GridLayout(0,1));
        
        welcomeLabel = new JLabel("Welcome To The Application");
        welcomeLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        //welcomeText.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        goToLogin = new JButton("Log In");
        //goToLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToLogin.setPreferredSize(new Dimension(400, 30));
        goToRoomSelection = new JButton("Room Selection");
        //goToRoomSelection.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToRoomSelection.setPreferredSize(new Dimension(400, 30));
        goToHousingApplication = new JButton("Housing Application");
        //goToDormApplication.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToHousingApplication.setPreferredSize(new Dimension(400, 30));
        goToFinancialStatus = new JButton("Financial Status");
        //goToFinancialStatus.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToFinancialStatus.setPreferredSize(new Dimension(400, 30));
        goToAddStudent = new JButton("Add Student");
        //goToAddStudent.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToAddStudent.setPreferredSize(new Dimension(400, 30));
        goToRemoveStudent = new JButton("Remove Student");
        //goToRemoveStudent.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToRemoveStudent.setPreferredSize(new Dimension(400, 30));
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0,0,10,0);
        mainPanel.add(welcomeLabel, constraints);
        
        //constraints.gridx = 0;
        constraints.gridy = 1;
        //constraints.gridwidth = 1;
        constraints.insets = new Insets(10,0,10,0);
        mainPanel.add(goToLogin, constraints);
        
        constraints.gridy = 2;
        constraints.insets = new Insets(0,0,10,0);
        mainPanel.add(goToRoomSelection, constraints);
        
        constraints.gridy = 3;
        //constraints.insets = new Insets(0,0,10,0);
        mainPanel.add(goToHousingApplication, constraints);
        
        constraints.gridy = 4;
        //constraints.insets = new Insets(0,0,10,0);
        mainPanel.add(goToFinancialStatus, constraints);
        
        constraints.gridy = 5;
        mainPanel.add(goToAddStudent, constraints);
        
        constraints.gridy = 6;
        mainPanel.add(goToRemoveStudent, constraints);
        
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 40)));
        //mainPanel.add(welcomeLabel);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        //mainPanel.add(goToLogin);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        //mainPanel.add(goToRoomSelection);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        //mainPanel.add(goToDormApplication);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        //mainPanel.add(goToFinancialApplication);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        //mainPanel.add(goToAddStudent);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        //mainPanel.add(goToRemoveStudent);
        
        this.add(mainPanel);
    }

    public JButton getGoToFinancialStatus() {
        return goToFinancialStatus;
    }

    public JButton getGoToHousingApplication() {
        return goToHousingApplication;
    }
}
