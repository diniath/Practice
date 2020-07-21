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
public class Receptionist extends Employee implements Driving{

    public Receptionist(String name, int salary) {
        super(name, salary);
    }
    
    public static void greet(){
        System.out.println("I am a receptionist, my work is to greet");
    }

    @Override
    public void drive() {
        System.out.println("my name is " + getName() + " and I am here to drive you!");
    }

    @Override
    public String work() {
        greet();
        return null;
    }
}
