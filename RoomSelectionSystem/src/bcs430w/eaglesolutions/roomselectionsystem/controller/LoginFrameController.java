/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jairo
 */
public class LoginFrameController {
    private LoginFrameView loginFrameView;
    
    public LoginFrameController(){
        loginFrameView = new LoginFrameView();
        setLoginButtonActionListener();
    }
    
    public LoginFrameController(LoginFrameView view){
        loginFrameView = view;
    }
    
    public void initializeView(){
        loginFrameView.setVisible(true);
    }
    
    private void setLoginButtonActionListener(){
        loginFrameView.getLoginButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameController mainFrameController = new MainFrameController();
                mainFrameController.initializeView();
            }
        });
    }
}
