/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.SignUpStudentView;

/**
 *
 * @author Jairo
 */
public class SignUpStudentController {
    private SignUpStudentView signUpStudentView;
    
    public SignUpStudentController(){
        signUpStudentView = new SignUpStudentView();
    }
    
    public SignUpStudentController(SignUpStudentView view){
        signUpStudentView = view;
    }
    
    public void initializeView(){
        signUpStudentView.setVisible(true);
    }
}
