/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author nande
 */
public class Actor {
    public String face;
    public String colour;

    public Actor() {
    }

    public Actor(String face, String colour) {
        this.face = face;
        this.colour = colour;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void acting(){
        System.out.println("I have a " + getFace() + " face. My colour is " + getColour() + " while I am acting.");
    }
}
