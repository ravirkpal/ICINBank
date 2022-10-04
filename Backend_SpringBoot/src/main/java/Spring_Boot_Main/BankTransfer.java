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
@Table(name="transfer")
public class BankTransfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public int accountno;
	public String accountname;
	public String beneficiaryname;
	public int beneficiaryaccno;
	public String bank;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new Date(System.currentTimeMillis());
	public double ammount;
	public String descr;
	public String actions;
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
	public String getBeneficiaryname() {
		return beneficiaryname;
	}
	public void setBeneficiaryname(String beneficiaryname) {
		this.beneficiaryname = beneficiaryname;
	}
	public int getBeneficiaryaccno() {
		return beneficiaryaccno;
	}
	public void setBeneficiaryaccno(int beneficiaryaccno) {
		this.beneficiaryaccno = beneficiaryaccno;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
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
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public BankTransfer(int id, int accountno, String beneficiaryname, int beneficiaryaccno, String bank,
			String accountname, Date date, double ammount, String descr, String actions) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.beneficiaryname = beneficiaryname;
		this.beneficiaryaccno = beneficiaryaccno;
		this.bank = bank;
		this.accountname = accountname;
		this.date = date;
		this.ammount = ammount;
		this.descr = descr;
		this.actions = actions;
	}
	
	public BankTransfer() {}
}
