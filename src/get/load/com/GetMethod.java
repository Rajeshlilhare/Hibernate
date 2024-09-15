package get.load.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetMethod {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("get.hibernate.cfg.xml");
            SessionFactory sf = cfg.buildSessionFactory();
            Session sess = sf.openSession();
            BusinessAdvantagePlusAccount result = sess.get(BusinessAdvantagePlusAccount.class, new Integer(10));
            System.out.println(result);
            sess.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
