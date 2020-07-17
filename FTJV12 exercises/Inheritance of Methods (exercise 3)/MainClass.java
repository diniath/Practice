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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChildClass childclass = new ChildClass();
        
        childclass.sum(4, 2, 2, 1, 5);
        childclass.sum(1, 1, 1, 1);
        childclass.sum(1, 2, 3);
        childclass.sum(1, 1);
        
        
    }
    
}
