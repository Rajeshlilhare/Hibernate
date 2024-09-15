package get.load.com;
import javax.persistence.*;

@Entity
@Table(name = "AdvantagePlusAccount")
public class BusinessAdvantagePlusAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="acc_id")
    private int bapa_acc_id;
    @Column(name="acc_num")
    private long bapa_acc_num;
    @Column(name="cust_name")
    private String bapa_cust_name;
    @Column(name="acc_branch_name")
    private String bapa_branch_name;
    @Column(name="acc_balance")
    private double bapa_avail_balance;

    public int getBapa_acc_id() {
        return bapa_acc_id;
    }

    public void setBapa_acc_id(int bapa_acc_id) {
        this.bapa_acc_id = bapa_acc_id;
    }

    public long getBapa_acc_num() {
        return bapa_acc_num;
    }

    public void setBapa_acc_num(long bapa_acc_num) {
        this.bapa_acc_num = bapa_acc_num;
    }

    public String getBapa_branch_name() {
        return bapa_branch_name;
    }

    public void setBapa_branch_name(String bapa_branch_name) {
        this.bapa_branch_name = bapa_branch_name;
    }

    public String getBapa_cust_name() {
        return bapa_cust_name;
    }

    public void setBapa_cust_name(String bapa_cust_name) {
        this.bapa_cust_name = bapa_cust_name;
    }

    public double getBapa_avail_balance() {
        return bapa_avail_balance;
    }

    public void setBapa_avail_balance(double bapa_avail_balance) {
        this.bapa_avail_balance = bapa_avail_balance;
    }
}
