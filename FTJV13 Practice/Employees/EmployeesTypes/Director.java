/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeesTypes;

/**
 *
 * @author nande
 */
public class Director extends Employee implements Advisable, Driving{

    public Director(String name, int salary) {
        super(name, salary);
    }
    public static void guide(){
        System.out.println("I am a director, my work is to guide");
    }

    @Override
    public void giveAdvice() {
        System.out.println("my name is " + getName() + "and my job is to give you advice");
    }

    @Override
    public void drive() {
        
        System.out.println("my name is " + getName() + " and I am here to drive you!");
    }

    @Override
    public String work() {
        guide();
        return null;
    }
}
