/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.RoomSelectionFrameView;

/**
 *
 * @author Jairo
 */
public class RoomSelectionFrameController {
    private RoomSelectionFrameView roomSelectionFrameView;
    
    public RoomSelectionFrameController(){
        roomSelectionFrameView = new RoomSelectionFrameView();
    }
    
    public RoomSelectionFrameController(RoomSelectionFrameView view){
        roomSelectionFrameView = view;
    }
    
    public void initializeView(){
        roomSelectionFrameView.setVisible(true);
    }
}
