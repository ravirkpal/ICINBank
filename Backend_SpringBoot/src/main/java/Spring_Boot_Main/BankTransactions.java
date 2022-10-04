package Spring_Boot_Main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="transactions")
public class BankTransactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public int accountno;
	public String accountname;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new Date(System.currentTimeMillis());
	public double ammount;
	public String descr;
	public String actions;
	public int Total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public String getDesc() {
		return descr;
	}
	public void setDesc(String descr) {
		this.descr = descr;
	}
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public BankTransactions(int id, int accountno, String accountname, Date date, int ammount, String desc,
			String actions) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.accountname = accountname;
		this.date = date;
		this.ammount = ammount;
		this.descr = desc;
		this.actions = actions;
	}
	
	public BankTransactions() {}

}
