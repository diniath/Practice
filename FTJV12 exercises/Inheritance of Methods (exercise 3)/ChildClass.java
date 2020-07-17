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
public class ChildClass extends ParentClass {

    private int e;
  

    public ChildClass() {

    }

    public void sum(int a, int b, int c, int d, int e){
        System.out.println("from child class method 4: " + (a + b + c + d + e));
        
    }
}
