package com.hdfc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SavingAccountDettails {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory sf = cfg.buildSessionFactory();
            Session sess = sf.openSession();
            Transaction tx = sess.beginTransaction();

            SavingAcoount account1 = new SavingAcoount();
            SavingAcoount account2 = new SavingAcoount();
            SavingAcoount account3 = new SavingAcoount();
            SavingAcoount account4 = new SavingAcoount();

            account1.setAcc_number(12234578);
            account1.setAcc_holder_name("Rajesh Lilhare");
            account1.setBranch_name("Balaghat branch");
            account1.setCity("Balaghat");
            account1.setAcc_balance(2000.0d);

            account2.setAcc_number(16345578);
            account2.setAcc_holder_name("Lavi");
            account2.setBranch_name("Waraseoni branch");
            account2.setCity("Waraseoni");
            account2.setAcc_balance(1000.0d);

            account3.setAcc_number(37234578);
            account3.setAcc_holder_name("sachin");
            account3.setBranch_name("Gondia branch");
            account3.setCity("Gondia");
            account3.setAcc_balance(5000.0d);

            account4.setAcc_number(87234578);
            account4.setAcc_holder_name("mohan");
            account4.setBranch_name("Nagpur");
            account4.setCity("Nagpur");
            account4.setAcc_balance(9000.0d);

            sess.save(account1);
            sess.save(account2);
            sess.save(account3);
            sess.save(account4);
            tx.commit();
            sess.close();
            System.out.println("Data save successfully .....................");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}