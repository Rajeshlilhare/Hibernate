package com.hdfc;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CertificateOfDepositAccountDettails {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory sf = cfg.buildSessionFactory();
            Session sess = sf.openSession();
            Transaction tx = sess.beginTransaction();

            CertificateOfDepositAccount account1 = new CertificateOfDepositAccount();
            CertificateOfDepositAccount account2 = new CertificateOfDepositAccount();
            CertificateOfDepositAccount account3 = new CertificateOfDepositAccount();
            CertificateOfDepositAccount account4 = new CertificateOfDepositAccount();

            account1.setCda_acc_num(123566);
            account1.setCda_holder_name("Rajesh");
            account1.setCda_branch_name("Bhopal");
            account1.setCda_city("Bhopal");
            account1.setCda_acc_balance(1000.0d);

            account2.setCda_acc_num(322356);
            account2.setCda_holder_name("Kamla");
            account2.setCda_branch_name("Surat");
            account2.setCda_city("Surat");
            account2.setCda_acc_balance(2000.0d);

            account3.setCda_acc_num(836235);
            account3.setCda_holder_name("Yuvi");
            account3.setCda_branch_name("Mumbai");
            account3.setCda_city("Mumbai");
            account3.setCda_acc_balance(10000.0d);

            account4.setCda_acc_num(123574);
            account4.setCda_holder_name("Raksha");
            account4.setCda_branch_name("Pune");
            account4.setCda_city("Pune");
            account4.setCda_acc_balance(9000.0d);

            sess.save(account1);
            sess.save(account2);
            sess.save(account3);
            sess.save(account4);
            tx.commit();
            sess.close();
            System.out.println("Hibernate project using annotation executed successfully............");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
