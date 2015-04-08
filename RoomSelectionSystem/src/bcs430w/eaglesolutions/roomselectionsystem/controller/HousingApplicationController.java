/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem.controller;

import bcs430w.eaglesolutions.roomselectionsystem.view.HousingApplicationView;

/**
 *
 * @author Jairo
 */
public class HousingApplicationController {
    
    private HousingApplicationView housingApplicationView;
    
    public HousingApplicationController(){
        housingApplicationView = new HousingApplicationView();
    }
    
    public HousingApplicationController(HousingApplicationView view){
        housingApplicationView = view;
    }
    
    public void initializeView(){
        housingApplicationView.setVisible(true);
    }
}
