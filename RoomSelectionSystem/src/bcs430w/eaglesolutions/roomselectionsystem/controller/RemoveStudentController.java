/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.RemoveStudentView;

/**
 *
 * @author Jairo
 */
public class RemoveStudentController {
    private RemoveStudentView RemoveStudentView;
    
    public RemoveStudentController(){
        RemoveStudentView = new RemoveStudentView();
    }
    
    public RemoveStudentController(RemoveStudentView view){
        RemoveStudentView = view;
    }
    
    public void initializeView(){
        RemoveStudentView.setVisible(true);
    }
}
