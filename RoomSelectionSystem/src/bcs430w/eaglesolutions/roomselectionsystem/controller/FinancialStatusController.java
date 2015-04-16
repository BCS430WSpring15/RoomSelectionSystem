/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.FinancialStatusView;
import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;
import bcs430w.eaglesolutions.roomselectionsystem.view.MainFrameView;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Jairo
 */
public class FinancialStatusController {
    private FinancialStatusView financialStatusView;
    private MainFrameView mainFrameView;
    
    public FinancialStatusController(){
        financialStatusView = new FinancialStatusView();
    }
    
    public FinancialStatusController(FinancialStatusView view){
        financialStatusView = view;
    }
    
    public void setMainFrameView(MainFrameView mainFrameView){
        this.mainFrameView = mainFrameView;
    }
    
    public void initializeView(){
        financialStatusView.setVisible(true);
        setOncloseListener();
    }
    
    private void setOncloseListener(){
        financialStatusView.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                mainFrameView.setEnabled(true);
                mainFrameView.toFront();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                
            }
        });
    }
}
