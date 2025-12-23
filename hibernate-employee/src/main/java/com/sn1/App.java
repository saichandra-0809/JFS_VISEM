package com.sn1;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sn1.Employee;
import com.sn1.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee(
                "Chandra",
                "kanna@gmail.com",
                85000
        );

        session.persist(emp);

        tx.commit();
        session.close();

        System.out.println("Employee inserted successfully!");
    }
}

