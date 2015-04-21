/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.ForgotPasswordView;
import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Jairo
 */
public class ForgotPasswordController {
    private ForgotPasswordView forgotPasswordView;
    private LoginFrameView loginFrameView;
    
    public ForgotPasswordController(){
        forgotPasswordView = new ForgotPasswordView();
    }
    
    public ForgotPasswordController(ForgotPasswordView view){
        forgotPasswordView = view;
    }
    
    public void setLoginFrameView(LoginFrameView view){
        loginFrameView = view;
    }
    
    public void initializeView(){
        forgotPasswordView.setVisible(true);
        setConfirmAnswerButtonListener();
        setResetPasswordButtonListener();
        setOncloseListener();
    }
    
    private void setConfirmAnswerButtonListener(){
        forgotPasswordView.getConfirmAnswerButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(forgotPasswordView.getSecurityAnswer().getText().equals("123")){
                    forgotPasswordView.repaintAfterConfirmed();
                }
            }
        });
    }
    
    private void setResetPasswordButtonListener(){
        forgotPasswordView.getResetPasswordButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                
                String newPass = new String(forgotPasswordView.getNewPassword().getPassword());
                String confirmPass = new String(forgotPasswordView.getConfirmNewPassword().getPassword());
                if(newPass.equals(confirmPass)){
                    System.out.println(newPass);
                }
            }
        });
    }
    
    private void setOncloseListener(){
        forgotPasswordView.addWindowListener(new WindowListener() {

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
                loginFrameView.setEnabled(true);
                loginFrameView.toFront();
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
}