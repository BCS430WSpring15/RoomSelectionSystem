/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem;

import bcs430w.eaglesolutions.roomselectionsystem.controller.HousingApplicationController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.LoginFrameController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.MainFrameController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.RoomSelectionFrameController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.SignUpStudentController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.RemoveStudentController;
import bcs430w.eaglesolutions.roomselectionsystem.view.HousingApplicationView;
import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;
import bcs430w.eaglesolutions.roomselectionsystem.view.MainFrameView;
import bcs430w.eaglesolutions.roomselectionsystem.view.RoomSelectionFrameView;

/**
 *
 * @author Jairo
 */
public class Main {
    public static void main(String[] args) {
        run();
    }
	
    private static void run(){
        MainFrameView mainFrameView = new MainFrameView();
        MainFrameController mainFrameController = new MainFrameController(mainFrameView);
        mainFrameController.initializeView();
        LoginFrameView loginFrameView = new LoginFrameView();
        LoginFrameController loginFrameController = new LoginFrameController(loginFrameView);
        loginFrameController.initializeView();
        RoomSelectionFrameView roomSelectionFrameView = new RoomSelectionFrameView();
        RoomSelectionFrameController roomSelectionFrameController = new RoomSelectionFrameController(roomSelectionFrameView);
        roomSelectionFrameController.initializeView();
        HousingApplicationController housingApplicationController = new HousingApplicationController();
        housingApplicationController.initializeView();
        SignUpStudentController signUpStudentController = new SignUpStudentController();
        signUpStudentController.initializeView();
        RemoveStudentController RemoveStudentController = new RemoveStudentController();
        RemoveStudentController.initializeView();
    }
}
