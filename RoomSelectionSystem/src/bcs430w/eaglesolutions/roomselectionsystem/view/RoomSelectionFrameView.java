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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jairo
 */
public class RoomSelectionFrameView extends JFrame{
    
    private JPanel roomSelectionPanel;
    private JLabel roomSelectionLabel;
    private JComboBox buildingCombo;
    private JComboBox floorCombo;
    private JComboBox suiteCombo;
    private JComboBox roomCombo;
    private JButton selectButton;
    
    public RoomSelectionFrameView(){
        super("Room Selection System");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/3);
        this.setLocation(this.getSize().width, this.getSize().height);
        //this.setSize(1000, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        
        roomSelectionPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        roomSelectionLabel = new JLabel("Room Selection");
        roomSelectionLabel.setFont(new Font("Tekton Pro", NORMAL, 30));
        
        String[] buildingOptions = { "Orchard Hall", "Dewey Hall", "Alumni Hall"};
        String[] floorOptions = { "1", "2", "3", "4" };
        String[] suiteOptions = { "Four Person Suite", "Six Person Suite" };
        String[] roomOptions = { "4K03", "3K03", "2K03", "1K03" };
        
        selectButton = new JButton("       Select       ");
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.insets = new Insets(0,0,30,0);
        roomSelectionPanel.add(roomSelectionLabel, constraints);
        
        buildingCombo = new JComboBox(buildingOptions);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0,10,10,0);
        roomSelectionPanel.add(buildingCombo, constraints);
        
        floorCombo = new JComboBox(floorOptions);
        floorCombo.setEnabled(false);
        constraints.weightx = 0.5;
        //constraints.weighty = 1;
        constraints.gridx = 1;
        roomSelectionPanel.add(floorCombo, constraints);
        
        suiteCombo = new JComboBox(suiteOptions);
        suiteCombo.setEnabled(false);
        constraints.gridx = 2;
        roomSelectionPanel.add(suiteCombo, constraints);
        suiteCombo = new JComboBox(suiteOptions);
        
        roomCombo = new JComboBox(roomOptions);
        roomCombo.setEnabled(false);
        constraints.gridx = 3;
        constraints.insets = new Insets(0,10,10,10);
        roomSelectionPanel.add(roomCombo, constraints);
        
        constraints.fill = GridBagConstraints.CENTER;
        selectButton.setEnabled(false);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.insets = new Insets(20,10,10,10);
        roomSelectionPanel.add(selectButton, constraints);
        
        this.add(roomSelectionPanel);
    }

    /**
     * @return the buildingCombo
     */
    public JComboBox getBuildingCombo() {
        return buildingCombo;
    }

    /**
     * @return the floorCombo
     */
    public JComboBox getFloorCombo() {
        return floorCombo;
    }

    /**
     * @return the suiteCombo
     */
    public JComboBox getSuiteCombo() {
        return suiteCombo;
    }

    /**
     * @return the roomCombo
     */
    public JComboBox getRoomCombo() {
        return roomCombo;
    }

    /**
     * @return the selectButton
     */
    public JButton getSelectButton() {
        return selectButton;
    }
}
