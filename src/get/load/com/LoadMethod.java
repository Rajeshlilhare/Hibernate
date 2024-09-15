package get.load.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadMethod {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("get.hibernate.cfg.xml");
            SessionFactory sf = cfg.buildSessionFactory();
            Session sess = sf.openSession();
            BusinessAdvantagePlusAccount result = sess.load(BusinessAdvantagePlusAccount.class, new Integer(20));
            System.out.println(result);
            sess.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
