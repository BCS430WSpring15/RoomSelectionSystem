/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        setLoginButtonActionListener();
        setForgotPasswordListener();
        setSignUpListener();
    }
    
    private void setForgotPasswordListener(){
        loginFrameView.getForgotPassLabel().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                ForgotPasswordController forgotPasswordController = new ForgotPasswordController();
                forgotPasswordController.initializeView();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    private void setSignUpListener(){
        loginFrameView.getSignUpLabel().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //System.out.println(System.getProperty("user.dir")+"\\resources\\logo.png");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    private void setLoginButtonActionListener(){
        loginFrameView.getLoginButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(loginFrameView.getStaffRadio().isSelected()){
                    String pass = new String(loginFrameView.getPassword().getPassword()); 
                    if(loginFrameView.getUsername().getText().equals("admin") && pass.equals("123")){
                        //loginFrameView.getErrorLabel().setText("Accepted");
                        MainFrameController mainFrameController = new MainFrameController();
                        mainFrameController.initializeView();
                        loginFrameView.dispose();
                    }
                }
                else if(loginFrameView.getStudentRadio().isSelected()){
                    //loginFrameView.getErrorLabel().setText("Student selected");
                }
                //if(loginFrameView.getErrorLabel().equals("admin") && loginFrameView.getErrorLabel().equals("123"))
                //MainFrameController mainFrameController = new MainFrameController();
                //mainFrameController.initializeView();
                //loginFrameView.dispose();
            }
        });
    }
}
