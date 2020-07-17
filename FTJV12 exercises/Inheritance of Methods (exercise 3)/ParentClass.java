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
public class ParentClass {
    public int a;
    public int b;
    public int c;
    public int d;

    public ParentClass() {
        
    }
    
    public void sum(int a, int b){
        System.out.println("from parent class method 1: " + (a + b));
    }
            
    public void sum(int a, int b, int c){
        System.out.println("from parent class method 2: " + (a + b + c));
    }
    
    public void sum(int a, int b, int c, int d){
        System.out.println("from parent class method 3: " + (a + b + c + d));
    }
}
