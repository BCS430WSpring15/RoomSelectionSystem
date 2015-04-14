/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.FinancialStatusView;
import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;

/**
 *
 * @author Jairo
 */
public class FinancialStatusController {
    private FinancialStatusView financialStatusView;
    
    public FinancialStatusController(){
        financialStatusView = new FinancialStatusView();
    }
    
    public FinancialStatusController(FinancialStatusView view){
        financialStatusView = view;
    }
    
    public void initializeView(){
        financialStatusView.setVisible(true);
    }
}
