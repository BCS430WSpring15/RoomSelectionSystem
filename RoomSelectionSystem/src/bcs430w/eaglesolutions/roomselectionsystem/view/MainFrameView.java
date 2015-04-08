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
import java.awt.GridLayout;
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
    private JButton goToDormApplication;
    private JButton goToFinancialApplication;
    private JButton goToAddStudent;
    private JButton goToRemoveStudent;
    
    public MainFrameView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height/2);
        this.setLocation(this.getSize().width/2, this.getSize().height/2);
        //this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 15));
        mainPanel.setSize(this.getSize());
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
        goToDormApplication = new JButton("Dorm Application");
        //goToDormApplication.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToDormApplication.setPreferredSize(new Dimension(400, 30));
        goToFinancialApplication = new JButton("Financial Application");
        //goToFinancialApplication.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToFinancialApplication.setPreferredSize(new Dimension(400, 30));
        goToAddStudent = new JButton("Add Student");
        //goToAddStudent.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToAddStudent.setPreferredSize(new Dimension(400, 30));
        goToRemoveStudent = new JButton("Remove Student");
        //goToRemoveStudent.setAlignmentX(Component.CENTER_ALIGNMENT);
        goToRemoveStudent.setPreferredSize(new Dimension(400, 30));
        
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 40)));
        mainPanel.add(welcomeLabel);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(goToLogin);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(goToRoomSelection);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(goToDormApplication);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(goToFinancialApplication);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(goToAddStudent);
        //mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(goToRemoveStudent);
        
        this.add(mainPanel);
    }
}
