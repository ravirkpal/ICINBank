package Spring_Boot_Main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;



@CrossOrigin("http://localhost:4200")
@Controller
public class MyController {


	@Autowired
	BankRepository repo;
	
	@Autowired
	BankRepository2 repo2;
	
	@Autowired
	BankRepository3 repo3;
	
	@Autowired
	BankRepository4 repo4;
	
	@Autowired
	BankRepository5 repo5;
	
	
//	list of users
	
	@GetMapping("/index")
	@ResponseBody
	public List<BankCustomers> getAllUser() {
		return repo.findAll();
		
	}
	
	
	@PostMapping("/save")
	@ResponseBody
	public BankCustomers saveUser(@RequestBody BankCustomers user) {
		return repo.save(user);
	}

	
	
//	deposit save
	
	@PostMapping("/savedepo")
	@ResponseBody
	public BankTransactions saveUser(@RequestBody BankTransactions user) {
		return repo2.save(user);
	}
	
	@GetMapping("/savedepo")
	@ResponseBody
	public List<BankTransactions> saveUser() {
		return repo2.findAll();
	}
	

	@GetMapping("/status/{id}")
	@ResponseBody
	public BankTransactions updateStatus(@PathVariable("id") int id) {
		return repo2.findById(id).get();
	}

	
//	withdrawal amount
	
	@PostMapping("/savewithdraw")
	@ResponseBody
	public BankWithdrawal withdrawuser(@RequestBody BankWithdrawal user) {
		return repo3.save(user);
	}
	
	
	@GetMapping("/savewithdraw")
	@ResponseBody
	public List<BankWithdrawal> saveUser2() {
		return repo3.findAll();
	}
	

	@GetMapping("/status2/{id}")
	@ResponseBody
	public BankWithdrawal updateStatus2(@PathVariable("id") int id) {
		return repo3.findById(id).get();
	}

	
//	Transfer 
	
	@PostMapping("/savetransfer")
	@ResponseBody
	public BankTransfer transferuser(@RequestBody BankTransfer user) {
		return repo4.save(user);
	}
	
	@GetMapping("/savetransfer")
	@ResponseBody
	public List<BankTransfer> saveUser3() {
		return repo4.findAll();
	}
	

	@GetMapping("/status3/{id}")
	@ResponseBody
	public BankTransfer updateStatus3(@PathVariable("id") int id) {
		return repo4.findById(id).get();
	}

	
//	cheque request
	
	@PostMapping("/chqreq")
	@ResponseBody
	public BankChqRequest transferuser(@RequestBody BankChqRequest user) {
		return repo5.save(user);
	}
	
	@GetMapping("/chqreq")
	@ResponseBody
	public List<BankChqRequest> saveUser4() {
		return repo5.findAll();
	}
	

	@GetMapping("/status4/{id}")
	@ResponseBody
	public BankChqRequest updateStatus4(@PathVariable("id") int id) {
		return repo5.findById(id).get();
	}

	

//	edit
	
	@GetMapping("/update/{id}")
	@ResponseBody
	public BankCustomers updateuser(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}

	
//	delete
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public List<BankCustomers> deleteuser(@PathVariable("id") int id) {
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
}
