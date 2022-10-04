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
@Table(name="chq_request")
public class BankChqRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public int accountno;
	public String accountname;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new Date(System.currentTimeMillis());
	public String request;
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
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public BankChqRequest(int id, int accountno, String accountname, Date date, String request) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.accountname = accountname;
		this.date = date;
		this.request = request;
	}
	
	public BankChqRequest() {}
}
