package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

//        inserting data into db
        /*Student s1 = new Student();
        s1.setRollNo(103);
        s1.setsAge(17);
        s1.setsName("Jane");

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);*/

//        fetching data from db

        /*Student s2 = null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        s2 = session.find(Student.class,101);

        session.close();
        sf.close();

        System.out.println(s2);*/

//        updating the data in the db

        Student s1 = new Student();
        s1.setRollNo(103);
        s1.setsAge(19);
        s1.setsName("Jane");

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge(s1);

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);

    }
}
