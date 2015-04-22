/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.MainFrameView;
import bcs430w.eaglesolutions.roomselectionsystem.view.RoomSelectionFrameView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Jairo
 */
public class RoomSelectionFrameController {
    private RoomSelectionFrameView roomSelectionFrameView;
    private MainFrameView mainFrameView;
    
    public RoomSelectionFrameController(){
        roomSelectionFrameView = new RoomSelectionFrameView();
    }
    
    public RoomSelectionFrameController(RoomSelectionFrameView view){
        roomSelectionFrameView = view;
    }
    
    public void initializeView(){
        roomSelectionFrameView.setVisible(true);
        setOncloseListener();
        setGetBuildingComboListener();
        setGetFloorComboListener();
        setGetSuiteComboListener();
        setGetRoomComboListener();
        setGetSelectButtonListener();
    }

    /**
     * @param mainFrameView the mainFrameView to set
     */
    public void setMainFrameView(MainFrameView mainFrameView) {
        this.mainFrameView = mainFrameView;
    }
    
    private void setOncloseListener(){
        roomSelectionFrameView.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                mainFrameView.setEnabled(true);
                mainFrameView.toFront();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
        
    
    private void setGetBuildingComboListener(){
        roomSelectionFrameView.getBuildingCombo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                roomSelectionFrameView.getFloorCombo().setEnabled(true);
            }
        });
    }
    
    private void setGetFloorComboListener(){
        roomSelectionFrameView.getFloorCombo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                roomSelectionFrameView.getSuiteCombo().setEnabled(true);
                System.out.println(roomSelectionFrameView.getSuiteCombo().isEnabled());
                System.out.println(roomSelectionFrameView.getSuiteCombo().getSelectedItem().toString());
            }
        });
    }
    
    private void setGetSuiteComboListener(){
        roomSelectionFrameView.getSuiteCombo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                roomSelectionFrameView.getRoomCombo().setEnabled(true);
            }
        });
    }
    
    private void setGetRoomComboListener(){
        roomSelectionFrameView.getRoomCombo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                roomSelectionFrameView.getSelectButton().setEnabled(true);
            }
        });
    }
    
    private void setGetSelectButtonListener(){
        
    }
}
