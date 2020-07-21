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
public class Teacher extends Employee implements Advisable{

    public Teacher(String name, int salary) {
        super(name, salary);
    }
    
    public static void teach(){
        System.out.println("I am a teacher, my work is to teach");
    }

    @Override
    public void giveAdvice() {
        System.out.println("my name is " + getName() + "and my job is to give you advice");
    }

    @Override
    public String work() {
       teach();
       return null;
    }
    
    
    
}
