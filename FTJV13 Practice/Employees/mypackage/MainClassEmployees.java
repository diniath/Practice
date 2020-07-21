/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import EmployeesTypes.Director;
import EmployeesTypes.Employee;
import EmployeesTypes.Receptionist;
import EmployeesTypes.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nande
 */
public class MainClassEmployees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee teacher1 = new Teacher("Jamie", 2000);
        Employee teacher2 = new Teacher("Sofia", 2000);
        Employee receptionist = new Receptionist("Mina", 1500);
        Employee director = new Director("Anderson", 2700);
        
        teacher1.work();
        teacher2.work();
        receptionist.work();
        director.work();
        
        List <Employee> employees = new ArrayList();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist);
        employees.add(director);
        
        whoDriveOrAdvise(employees);
    }
    
    public static void whoDriveOrAdvise (List <Employee> employees){
            Employee tempEmployee = null;
            System.out.println("The employees who drive are: ");
            for (Employee drivers : employees){
                if ((drivers instanceof Receptionist) || (drivers instanceof Director)){
                    tempEmployee = drivers;
                    System.out.println(tempEmployee.getName());
                }
            }
            System.out.println("The employees who advise are: ");
            for (Employee advisors : employees){
                if ((advisors instanceof Teacher) || (advisors instanceof Director)){
                    tempEmployee = advisors;
                    System.out.println(tempEmployee.getName());
                }
            } 
        }
    
}
