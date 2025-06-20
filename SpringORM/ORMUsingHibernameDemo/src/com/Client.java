package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");

        SessionFactory sf=cfg.buildSessionFactory();
       
        Session session=sf.openSession();
        Transaction txn=session.beginTransaction();
        
        Employee obj=new Employee();
        obj.setEmpId(20);
        obj.setEmpName("Sumit");
        obj.setEmpDesc("Dev");
        session.save(obj);
        
        txn.commit();
        session.close();


        sf.close();

	}

}
