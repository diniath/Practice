package diniath.app;

import diniath.entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {

        openEntityManagerFactory();

        // Create Student
//        Student s1 = new Student("THOMAS", 27, "CB12");
//        createStudent(s1);

        // Update Student
//        Student s = getStudentById(2);
//        System.out.println("The requested student before the update is: " + s);
//        s.setLastname("Malkovich");
//        updateStudent(s);
//        s = getStudentById(2);
//        System.out.println("The requested student after the update is: " + s);

        // Delete Student
        Student s = em.find(Student.class, 3);

        closeEmf();
    }
    
    private static void deleteStudent(Student s){
        openEntityManager();
        em.getTransaction().begin();
        em.remove(s);
        em.getTransaction().commit();
        closeEntityManager();
    }
    
    private static Student updateStudent(Student s){
        openEntityManager();
        em.getTransaction().begin();
        s = em.merge(s);
        em.getTransaction().commit();
        closeEntityManager();
        return s;
    }
    
    private static Student getStudentById (int sid){
        openEntityManager();
        Student student = em.find(Student.class, sid);
        System.out.println("The requested student is: " + student.getLastname());
        closeEntityManager();
        return student;
    }

    private static Student createStudent(Student s) {
        openEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        closeEntityManager();
        return s;
    }

    private static void openEntityManager() {
        em = emf.createEntityManager();
    }

    private static void closeEntityManager() {
        em.close();
    }

    private static void openEntityManagerFactory() {
        System.out.println("Opening EntityManagerFactory...");
        emf = Persistence.createEntityManagerFactory("mainPU");
    }

    private static void closeEmf() {
        emf.close();
        System.out.println("Closing EntityManagerFactory...");
    }

}
