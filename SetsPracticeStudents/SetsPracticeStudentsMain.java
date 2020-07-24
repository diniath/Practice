/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nande
 */
public class SetsPracticeStudentsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student("Jack", 15, "A");
        Student s2 = new Student("Peter", 14, "B");
        Student s3 = new Student("Sophia", 15, "A");
        Student s4 = new Student();
        s4 = s3;
        
        HashSet<Student> set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
 
        System.out.println("hashSet contains s4?: " + set.contains(s4)); // returns true - Student s4 is contained in HashSet
        
        TreeSet<Student> treeSet = new TreeSet();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        
        System.out.println("treeSet: " + treeSet.contains(s1)); //Σκάει!!! mypackage.Student cannot be cast to java.lang.Comparable
    }
    
}
