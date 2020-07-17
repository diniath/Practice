/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nande
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SadActor sadactor = new SadActor("sad", "blue");
        HappyActor happyactor = new HappyActor("happy", "orange");
        
        sadactor.acting();
        happyactor.acting();
        
        System.out.println("--------------The actors on stage--------------");
        List<Actor> stage = new ArrayList();
        stage.add(sadactor);
        stage.add(happyactor);
        
        for (Actor ithopios:stage){
            ithopios.acting();
        }
        
    }
    
}
