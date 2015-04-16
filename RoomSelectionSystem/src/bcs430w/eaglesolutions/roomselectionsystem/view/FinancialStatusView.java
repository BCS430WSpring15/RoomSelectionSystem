/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.view;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jairo
 */
public class FinancialStatusView extends JFrame {
    private JPanel financialStatusPanel;
    private JLabel financialStatusLabel;
    private JLabel studentIDLabel;
    private JTextField studentID;
    private JLabel studentNameLabel;
    private JTextField studentName;
    private JTextArea studentStatus;
    
    public FinancialStatusView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/3);
        this.setLocation(this.getSize().width, this.getSize().height);
        //this.setSize(1000, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        
        financialStatusPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        financialStatusLabel = new JLabel("Financial Status");
        financialStatusLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(20,0,20,0);
        financialStatusPanel.add(financialStatusLabel, constraints);
        
        studentIDLabel = new JLabel("RAM ID:");
        studentID = new JTextField("R00000000");
        //studentID.setEnabled(false);
        studentNameLabel = new JLabel("Name:");
        studentName = new JTextField("John Brown");
        //studentName.setEnabled(false);
        studentStatus = new JTextArea("All bills paid. The students has no financial debts.");
        //studentStatus.setEnabled(false);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0,20,0,10);
        financialStatusPanel.add(studentIDLabel, constraints);
        
        constraints.gridx = 1;
        constraints.insets = new Insets(0,10,0,20);
        financialStatusPanel.add(studentID, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.insets = new Insets(10,20,0,10);
        financialStatusPanel.add(studentNameLabel, constraints);
        
        constraints.gridx = 1;
        constraints.insets = new Insets(10,10,0,20);
        financialStatusPanel.add(studentName, constraints);
        
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.insets = new Insets(10,20,20,20);
        constraints.gridwidth = 2;
        financialStatusPanel.add(studentStatus, constraints);
        
        this.add(financialStatusPanel);
    }
    
    
}
