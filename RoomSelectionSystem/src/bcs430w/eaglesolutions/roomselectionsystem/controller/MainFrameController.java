/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.MainFrameView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jairo
 */
public class MainFrameController {
    private MainFrameView mainFrameView;
	
    public MainFrameController(){
        mainFrameView = new MainFrameView();
    }

    public MainFrameController(MainFrameView view){
        mainFrameView = view;
    }

    public void initializeView(){
        mainFrameView.setVisible(true);
        setGoToFinancialStatusListener();
    }
    
    private void setGoToFinancialStatusListener(){
        mainFrameView.getGoToFinancialStatus().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinancialStatusController financialStatusController = new FinancialStatusController();
                financialStatusController.setMainFrameView(mainFrameView);
                financialStatusController.initializeView();
                mainFrameView.setEnabled(false);
            }
        });
    }
}
