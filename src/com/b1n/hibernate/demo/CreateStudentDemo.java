package com.b1n.hibernate.demo;

import com.b1n.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();

        try{
            // use the session object to save Java object
            // create a student object
            System.out.println("Creating new Student object..");
            Student student = new Student("Jo", "Wonbin", "lkic1625@gmail.com");
            // start a transaction
            session.beginTransaction();
            // save the student object
            System.out.println("Saving the Student.. ");
            session.save(student);
            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done.");
        } finally {
            factory.close();
        }

    }
}
