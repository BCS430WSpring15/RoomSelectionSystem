/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem;

import bcs430w.eaglesolutions.roomselectionsystem.controller.FinancialStatusController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.ForgotPasswordController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.HousingApplicationController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.LoginFrameController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.MainFrameController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.RoomSelectionFrameController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.SignUpStudentController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.RemoveStudentController;
import bcs430w.eaglesolutions.roomselectionsystem.controller.RoomSelectionFormController;
import bcs430w.eaglesolutions.roomselectionsystem.view.HousingApplicationView;
import bcs430w.eaglesolutions.roomselectionsystem.view.LoginFrameView;
import bcs430w.eaglesolutions.roomselectionsystem.view.MainFrameView;
import bcs430w.eaglesolutions.roomselectionsystem.view.RoomSelectionFrameView;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Jairo
 */
public class Main {
    public static void main(String[] args) {
        run();
    }
	
    private static void run(){
        //MainFrameController mainFrameController = new MainFrameController();
        //mainFrameController.initializeView();
        LoginFrameController loginFrameController = new LoginFrameController();
        loginFrameController.initializeView();
        //RoomSelectionFrameView roomSelectionFrameView = new RoomSelectionFrameView();
        //RoomSelectionFrameController roomSelectionFrameController = new RoomSelectionFrameController(roomSelectionFrameView);
        //roomSelectionFrameController.initializeView();
        //HousingApplicationController housingApplicationController = new HousingApplicationController();
        //housingApplicationController.initializeView();
        //SignUpStudentController signUpStudentController = new SignUpStudentController();
        //signUpStudentController.initializeView();
        //RemoveStudentController removeStudentController = new RemoveStudentController();
        //removeStudentController.initializeView();
        //FinancialStatusController financialStatusController = new FinancialStatusController();
        //financialStatusController.initializeView();
        //RoomSelectionFormController roomSelectionFormController = new RoomSelectionFormController();
        //roomSelectionFormController.initializeView();
        //ForgotPasswordController forgotPasswordController = new ForgotPasswordController();
        //forgotPasswordController.initializeView();
        
        //TestEntity te = new TestEntity();
        
        /*EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("RoomSelectionSystemPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(te);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }*/
    }
}
