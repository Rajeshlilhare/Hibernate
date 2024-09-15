package get.load.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BusinessAdvantagePlusAccountDettails {
    public static void main(String[] args) {
        try{
            Configuration cfg = new Configuration();
            cfg.configure("get.hibernate.cfg.xml");
            SessionFactory sf =cfg.buildSessionFactory();
            Session sess= sf.openSession();
            Transaction tx = sess.beginTransaction();

            BusinessAdvantagePlusAccount account1 = new BusinessAdvantagePlusAccount();
            BusinessAdvantagePlusAccount account2 = new BusinessAdvantagePlusAccount();
            BusinessAdvantagePlusAccount account3 = new BusinessAdvantagePlusAccount();

            account1.setBapa_acc_num(123456);
            account1.setBapa_cust_name("rajesh");
            account1.setBapa_branch_name("Delhi");
            account1.setBapa_avail_balance(200.0d);

            account2.setBapa_acc_num(3223456);
            account2.setBapa_cust_name("raja");
            account2.setBapa_branch_name("Buhar");
            account2.setBapa_avail_balance(500.0d);

            account3.setBapa_acc_num(933456);
            account3.setBapa_cust_name("Lalla");
            account3.setBapa_branch_name("Luknau");
            account3.setBapa_avail_balance(900.0d);

            sess.save(account1);
            sess.save(account2);
            sess.save(account3);

            tx.commit();
            sess.close();
            System.out.println("Data saved successful ............");
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
