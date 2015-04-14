/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.view;

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

/**
 *
 * @author Jairo
 */
public class FinancialStatusView extends JFrame {
    private JPanel financialStatusPanel;
    private JLabel financialStatusLabel;
    
    public FinancialStatusView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/3);
        this.setLocation(this.getSize().width, this.getSize().height);
        //this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        financialStatusPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        financialStatusLabel = new JLabel("Financial Status");
        financialStatusLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0,0,10,0);
        financialStatusPanel.add(financialStatusLabel, constraints);
        
        this.add(financialStatusPanel);
    }
}
