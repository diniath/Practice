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
public class Bunny {
    private int bunnyNumber;

    public Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }
    
    
    
    public String hop(){
        String hopity = "Bunny number " + bunnyNumber + " is hopping";
        return hopity;
    }
    
    
}
