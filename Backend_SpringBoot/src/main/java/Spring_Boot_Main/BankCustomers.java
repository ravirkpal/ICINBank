package Spring_Boot_Main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOM_DATA")
public class BankCustomers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public int accountno;
	public String firstname;
	public String lastname;
	public String phoneno;
	public String email;
	public String username;
	public String password;
	public String accountname;

	
	
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public BankCustomers(int id, int accountno, String firstname, String lastname, String phoneno, String email,
			String username, String password, String accountname) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneno = phoneno;
		this.email = email;
		this.username = username;
		this.password = password;
		this.accountname = accountname;
	}
	public BankCustomers() {
		
	}
}
