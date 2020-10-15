package diniath.entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SingularAttribute<Student, LocalDate> dateofbirth;
	public static volatile SingularAttribute<Student, String> chosen_class;
	public static volatile SingularAttribute<Student, Integer> age;
	public static volatile SingularAttribute<Student, Integer> sid;
	public static volatile SingularAttribute<Student, String> lastname;

}

