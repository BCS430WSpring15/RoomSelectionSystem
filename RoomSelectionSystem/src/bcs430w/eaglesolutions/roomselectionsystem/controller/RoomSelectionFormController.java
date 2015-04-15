/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.RoomSelectionFormView;

/**
 *
 * @author Jairo
 */
public class RoomSelectionFormController {
    private RoomSelectionFormView roomSelectionFormView;
    
    public RoomSelectionFormController(){
        roomSelectionFormView = new RoomSelectionFormView();
    }
    
    public RoomSelectionFormController(RoomSelectionFormView view){
        roomSelectionFormView = view;
    }
    
    public void initializeView(){
        roomSelectionFormView.setVisible(true);
    }
}
