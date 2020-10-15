
package diniath.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String lastname;
    private LocalDate dateofbirth;
    private int age;
    private String chosen_class;

    public Student() {
    }

    public Student(String lastname, int age, String chosen_class) {
        this.lastname = lastname;
        this.age = age;
        this.chosen_class = chosen_class;
    }
    
    

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChosen_class() {
        return chosen_class;
    }

    public void setChosen_class(String chosen_class) {
        this.chosen_class = chosen_class;
    }
    
    

}