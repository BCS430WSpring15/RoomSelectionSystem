/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.view;

import java.awt.Checkbox;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JButton;
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
public class RoomSelectionFormView extends JFrame{
    private JPanel roomSelectionFormPanel;
    private JLabel roomSelectionFormLabel;
    private Checkbox proxyOptionCheck;
    private JLabel proxyOptionExplanationLabel;
    private JTextArea proxyOptionExplanation;
    private JLabel studentSignatureLabel;
    private JTextField studentSignature;
    private JLabel studentSignatureDateLabel;
    private JTextField studentSignatureDate;
    private JLabel suiteRoomPreference1Label;
    private JLabel selectSuiteRoomPreference1;
    private JLabel selectSuiteRoomPreference1RoommateLabel;
    private JTextField selectSuiteRoomPreference1Roommate;
    private JLabel selectSuiteRoomPreference2;
    private JLabel selectSuiteRoomPreference2RoommateLabel;
    private JTextField selectSuiteRoomPreference2Roommate;
    private JLabel suiteRoomPreference2Label;
    private JLabel selectSuiteLabel;
    private JLabel selectSuite;
    private JLabel representativeLabel;
    private JTextField representativeName;    
    private JButton submitApplication;
    
    
    public RoomSelectionFormView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width-150, Toolkit.getDefaultToolkit().getScreenSize().height-100);
        this.setLocation(75, 25);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        roomSelectionFormPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        roomSelectionFormLabel = new JLabel("Room Selection Form");
        roomSelectionFormLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.insets = new Insets(0,0,10,0);
        roomSelectionFormPanel.add(roomSelectionFormLabel, constraints);
        
        proxyOptionCheck = new Checkbox("Proxy Option");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(10,0,0,0);
        roomSelectionFormPanel.add(proxyOptionCheck, constraints);
        
        proxyOptionExplanationLabel = new JLabel("<html>Please check this box and sign below if you will not be present for the Room Selection process.<br>"
                + "Your signature below gives permission for your Group Representative to select a room for you.<br>"
                + "(You will not be able to change your assigment once it's chosen)</html>");
        
        //proxyOptionExplanation = new JTextArea("Please check this box and sign below if you will not be present for the Room Selection process.\n"
        //        + "Your signature below gives permission for your Group Representative to select a room for you.\n"
        //        + "(You will not be able to change your assigment once it's chosen)");
        //constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.insets = new Insets(10,0,0,0);
        roomSelectionFormPanel.add(proxyOptionExplanationLabel, constraints);
        //roomSelectionFormPanel.add(proxyOptionExplanation, constraints);
        
        studentSignatureLabel = new JLabel("Signature:");
        //constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        roomSelectionFormPanel.add(studentSignatureLabel, constraints);
        
        studentSignature = new JTextField(15);
        constraints.gridx = 1;
        constraints.insets = new Insets(10,10,0,0);
        roomSelectionFormPanel.add(studentSignature, constraints);
        
        studentSignatureDateLabel = new JLabel("Date:");
        constraints.gridx = 2;
        constraints.insets = new Insets(10,10,0,0);
        //constraints.gridy = 4;
        roomSelectionFormPanel.add(studentSignatureDateLabel, constraints);
        
        studentSignatureDate = new JTextField(15);
        constraints.gridx = 3;
        constraints.insets = new Insets(10,10,0,0);
        roomSelectionFormPanel.add(studentSignatureDate, constraints);
        
        suiteRoomPreference1Label = new JLabel("Suite/Room Preference I:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(20,0,0,0);
        roomSelectionFormPanel.add(suiteRoomPreference1Label, constraints);
        
        selectSuiteRoomPreference1 = new JLabel("Select");
        constraints.gridx = 2;
        constraints.insets = new Insets(20,10,0,0);
        roomSelectionFormPanel.add(selectSuiteRoomPreference1, constraints);
        
        selectSuiteRoomPreference1RoommateLabel = new JLabel("Roommate:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.insets = new Insets(10,0,0,0);
        roomSelectionFormPanel.add(selectSuiteRoomPreference1RoommateLabel, constraints);
        
        selectSuiteRoomPreference1Roommate = new JTextField();
        constraints.gridx = 1;
        constraints.insets = new Insets(10,10,0,0);
        roomSelectionFormPanel.add(selectSuiteRoomPreference1Roommate, constraints);
        
        suiteRoomPreference2Label = new JLabel("Suite/Room Preference II:");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(20,0,0,0);
        roomSelectionFormPanel.add(suiteRoomPreference2Label, constraints);
        
        selectSuiteRoomPreference2 = new JLabel("Select");
        constraints.gridx = 2;
        constraints.insets = new Insets(20,10,0,0);
        roomSelectionFormPanel.add(selectSuiteRoomPreference2, constraints);
        
        selectSuiteRoomPreference2RoommateLabel = new JLabel("Roommate:");
        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.insets = new Insets(10,0,0,0);
        roomSelectionFormPanel.add(selectSuiteRoomPreference2RoommateLabel, constraints);
        
        selectSuiteRoomPreference2Roommate = new JTextField();
        constraints.gridx = 1;
        constraints.insets = new Insets(10,10,0,0);
        roomSelectionFormPanel.add(selectSuiteRoomPreference2Roommate, constraints);
        
        selectSuiteLabel = new JLabel("Suite:");
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.insets = new Insets(10,0,0,0);
        roomSelectionFormPanel.add(selectSuiteLabel, constraints);
        
        selectSuite = new JLabel("Select:");
        constraints.gridx = 1;
        constraints.insets = new Insets(10,10,0,0);
        roomSelectionFormPanel.add(selectSuite, constraints);
        
        representativeLabel = new JLabel("Representative:");
        constraints.gridx = 0;
        constraints.gridy = 9;
        constraints.insets = new Insets(10,0,0,0);
        roomSelectionFormPanel.add(representativeLabel, constraints);
        
        representativeName = new JTextField();
        constraints.gridx = 1;
        constraints.insets = new Insets(10,10,0,0);
        roomSelectionFormPanel.add(representativeName, constraints);
        
        submitApplication = new JButton("        Submit        ");
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 10;
        constraints.gridwidth = 4;
        constraints.insets = new Insets(50,0,0,0);
        roomSelectionFormPanel.add(submitApplication, constraints);
        
        this.add(roomSelectionFormPanel);
    }
}
