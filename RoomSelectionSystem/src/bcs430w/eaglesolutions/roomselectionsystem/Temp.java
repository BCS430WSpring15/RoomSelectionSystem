/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs430w.eaglesolutions.roomselectionsystem;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Angelo
 */
@Entity
public class Temp implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    private long id;
    
    private int x;
    private int y;
 
    public Temp() {
    }
 
    Temp(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public Long getId() {
        return id;
    }
 
    public int getX() {
         return x;
    }
 
    public int getY() {
         return y;
    }
 
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
