/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;

/**
 *
 * @author Jairo
 */
public class LoginFrameController {
    private LoginFrameView loginFrameView;
    
    public LoginFrameController(){
        loginFrameView = new LoginFrameView();
    }
    
    public LoginFrameController(LoginFrameView view){
        loginFrameView = view;
    }
    
    public void initializeView(){
        loginFrameView.setVisible(true);
    }
}
