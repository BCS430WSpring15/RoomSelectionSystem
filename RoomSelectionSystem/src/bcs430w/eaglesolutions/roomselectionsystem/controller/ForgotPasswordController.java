/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.ForgotPasswordView;

/**
 *
 * @author Jairo
 */
public class ForgotPasswordController {
    private ForgotPasswordView forgotPasswordView;
    
    public ForgotPasswordController(){
        forgotPasswordView = new ForgotPasswordView();
    }
    
    public ForgotPasswordController(ForgotPasswordView view){
        forgotPasswordView = view;
    }
    
    public void initializeView(){
        forgotPasswordView.setVisible(true);
    }
}
