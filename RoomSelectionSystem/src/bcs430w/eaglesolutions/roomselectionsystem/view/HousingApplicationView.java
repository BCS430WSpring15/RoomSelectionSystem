/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.view;

import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jairo
 */
public class HousingApplicationView extends JFrame{
    
    private JLabel housingApplicationLabel;
    private JPanel housingApplicationPanel;
    private JPanel groupPanel;
    private JLabel emergencyContactNameLabel;
    private JTextField emergencyContactName;
    private JLabel emergencyContactPhoneLabel;
    private JTextField emergencyContactPhone;
    private JLabel roommatePreferenceNameLabel;
    private JTextField roommatePreferenceName;
    private JLabel doesSmokeLabel;
    private ButtonGroup buttonGroup;
    private JRadioButton doesSmokeYes;
    private JRadioButton doesSmokeNo;
    private JLabel earlyRiserLabel;
    private JRadioButton earlyRiserYes;
    private JRadioButton earlyRiserNo;
    private JLabel sleepEarlyAtNightLabel;
    private JRadioButton sleepEarlyAtNightYes;
    private JRadioButton sleepEarlyAtNightNo;
    private JLabel studyQuietlyLateLabel;
    private JRadioButton studyQuietlyLateYes;
    private JRadioButton studyQuietlyLateNo;
    private JLabel considerToBeAPersonLabel;
    private JRadioButton considerToBeAPersonUntidy;
    private JRadioButton considerToBeAPersonModerately;
    private JRadioButton considerToBeAPersonVery;
    private JLabel medicalConcernsLabel;
    private JTextArea medicalConcerns;
    private JLabel studentSignatureLabel;
    private JTextField studentSignature;
    private JLabel studentSignatureDateLabel;
    private JTextField studentSignatureDate;
    private JCheckBox agreeStudentSignature;
    private JLabel releaseInfoToRoommateLabel;
    private JRadioButton releaseInfoToRoommateYes;
    private JRadioButton releaseInfoToRoommateNo;
    private JLabel guardianSignatureLabel;
    private JTextField guardianSignature;
    private JLabel guardianSignatureDateLabel;
    private JTextField guardianSignatureDate;
    private JCheckBox agreeGuardianSignature;
    private JButton submitApplication;
    
    public HousingApplicationView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width-150, Toolkit.getDefaultToolkit().getScreenSize().height-100);
        this.setLocation(75, 25);
        //this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        housingApplicationPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        housingApplicationLabel = new JLabel("Housing Application Form");
        housingApplicationLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.insets = new Insets(0,0,50,0);
        housingApplicationPanel.add(housingApplicationLabel, constraints);
        
        emergencyContactNameLabel = new JLabel("Emergency Contact:");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0,10,5,10);
        housingApplicationPanel.add(emergencyContactNameLabel, constraints);
        
        emergencyContactName = new JTextField(20);
        constraints.gridx = 1;
        housingApplicationPanel.add(emergencyContactName, constraints);
        
        emergencyContactPhoneLabel = new JLabel("Phone:");
        constraints.gridx = 2;
        housingApplicationPanel.add(emergencyContactPhoneLabel, constraints);
        
        emergencyContactPhone = new JTextField();
        constraints.gridx = 3;
        housingApplicationPanel.add(emergencyContactPhone, constraints);
        
        roommatePreferenceNameLabel = new JLabel("Roommate Preference:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        housingApplicationPanel.add(roommatePreferenceNameLabel, constraints);
        
        roommatePreferenceName = new JTextField();
        constraints.gridx = 1;
        housingApplicationPanel.add(roommatePreferenceName, constraints);
        
        doesSmokeLabel = new JLabel("Do you smoke?");
        constraints.gridx = 2;
        housingApplicationPanel.add(doesSmokeLabel, constraints);
        
        doesSmokeYes = new JRadioButton("Yes");
        doesSmokeNo = new JRadioButton("No");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(doesSmokeYes);
        buttonGroup.add(doesSmokeNo);
        constraints.gridx = 3;
        groupPanel = new JPanel();
        groupPanel.add(doesSmokeYes);
        groupPanel.add(doesSmokeNo);
        housingApplicationPanel.add(groupPanel, constraints);
        
        earlyRiserLabel = new JLabel("Are you an early riser?");
        constraints.gridx = 0;
        constraints.gridy = 3;
        housingApplicationPanel.add(earlyRiserLabel, constraints);
        
        earlyRiserYes = new JRadioButton("Yes");
        earlyRiserNo = new JRadioButton("No");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(earlyRiserYes);
        buttonGroup.add(earlyRiserNo);
        constraints.gridx = 1;
        groupPanel = new JPanel();
        groupPanel.add(earlyRiserYes);
        groupPanel.add(earlyRiserNo);
        housingApplicationPanel.add(groupPanel, constraints);
        
        sleepEarlyAtNightLabel = new JLabel("Do you go to sleep early at night?");
        constraints.gridx = 2;
        housingApplicationPanel.add(sleepEarlyAtNightLabel, constraints);
        
        sleepEarlyAtNightYes = new JRadioButton("Yes");
        sleepEarlyAtNightNo = new JRadioButton("No");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(sleepEarlyAtNightYes);
        buttonGroup.add(sleepEarlyAtNightNo);
        constraints.gridx = 3;
        groupPanel = new JPanel();
        groupPanel.add(sleepEarlyAtNightYes);
        groupPanel.add(sleepEarlyAtNightNo);
        housingApplicationPanel.add(groupPanel, constraints);
        
        studyQuietlyLateLabel = new JLabel("Do you like to study quietly at night?");
        constraints.gridx = 0;
        constraints.gridy = 4;
        housingApplicationPanel.add(studyQuietlyLateLabel, constraints);
        
        studyQuietlyLateYes = new JRadioButton("Yes");
        studyQuietlyLateNo = new JRadioButton("No");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(studyQuietlyLateYes);
        buttonGroup.add(studyQuietlyLateNo);
        constraints.gridx = 1;
        groupPanel = new JPanel();
        groupPanel.add(studyQuietlyLateYes);
        groupPanel.add(studyQuietlyLateNo);
        housingApplicationPanel.add(groupPanel, constraints);
        
        considerToBeAPersonLabel = new JLabel("You consider yourself to be a person who:");
        constraints.gridx = 2;
        housingApplicationPanel.add(considerToBeAPersonLabel, constraints);
        
        considerToBeAPersonUntidy = new JRadioButton("Untidy");
        considerToBeAPersonModerately = new JRadioButton("Moderately Neat");
        considerToBeAPersonVery = new JRadioButton("Very Neat");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(considerToBeAPersonUntidy);
        buttonGroup.add(considerToBeAPersonModerately);
        buttonGroup.add(considerToBeAPersonVery);
        constraints.gridx = 3;
        groupPanel = new JPanel();
        groupPanel.add(considerToBeAPersonUntidy);
        groupPanel.add(considerToBeAPersonModerately);
        groupPanel.add(considerToBeAPersonVery);
        housingApplicationPanel.add(groupPanel, constraints);
        
        medicalConcernsLabel = new JLabel("Medical Concerns:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        housingApplicationPanel.add(medicalConcernsLabel, constraints);
        
        medicalConcerns = new JTextArea();
        constraints.gridx = 1;
        constraints.gridwidth = 3;
        constraints.ipady = 20;
        housingApplicationPanel.add(medicalConcerns, constraints);
        
        studentSignatureLabel = new JLabel("Signature:");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.ipady = 0;
        housingApplicationPanel.add(studentSignatureLabel, constraints);
        
        studentSignature = new JTextField();
        constraints.gridx = 1;
        housingApplicationPanel.add(studentSignature, constraints);
        
        studentSignatureDateLabel = new JLabel("Date:");
        constraints.gridx = 2;
        housingApplicationPanel.add(studentSignatureDateLabel, constraints);
        
        studentSignatureDate = new JTextField();
        constraints.gridx = 3;
        housingApplicationPanel.add(studentSignatureDate, constraints);
        
        releaseInfoToRoommateLabel = new JLabel("Release contact information to roommate?");
        constraints.gridx = 0;
        constraints.gridy = 7;
        housingApplicationPanel.add(releaseInfoToRoommateLabel, constraints);
        
        releaseInfoToRoommateYes = new JRadioButton("Yes");
        releaseInfoToRoommateNo = new JRadioButton("No");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(releaseInfoToRoommateYes);
        buttonGroup.add(releaseInfoToRoommateNo);
        constraints.gridx = 1;
        groupPanel = new JPanel();
        groupPanel.add(releaseInfoToRoommateYes);
        groupPanel.add(releaseInfoToRoommateNo);
        housingApplicationPanel.add(groupPanel, constraints);
        
        guardianSignatureLabel = new JLabel("Signature:");
        constraints.gridx = 0;
        constraints.gridy = 8;
        housingApplicationPanel.add(guardianSignatureLabel, constraints);
        
        guardianSignature = new JTextField();
        constraints.gridx = 1;
        housingApplicationPanel.add(guardianSignature, constraints);
        
        guardianSignatureDateLabel = new JLabel("Date:");
        constraints.gridx = 2;
        housingApplicationPanel.add(guardianSignatureDateLabel, constraints);
        
        guardianSignatureDate = new JTextField();
        constraints.gridx = 3;
        housingApplicationPanel.add(guardianSignatureDate, constraints);
        
        submitApplication = new JButton("        Submit        ");
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 9;
        constraints.gridwidth = 4;
        constraints.insets = new Insets(50,0,0,0);
        housingApplicationPanel.add(submitApplication, constraints);
        
        this.add(housingApplicationPanel);
    }
}
