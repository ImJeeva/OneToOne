package ManyToMany;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerdetails")
public class CustDetails {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "salary")
	private int salary;
	
	@OneToOne(mappedBy = "cid", cascade = CascadeType.ALL)
	private Customer customer;

	
	public CustDetails() {
		
	}
	
	public CustDetails(int id, String email, int salary) {
		super();
		this.id = id;
		this.email = email;
		this.salary = salary;
	}

	public int getCid() {
		return id;
	}

	public void setCid(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public String toString() {
		return  id +", "+email + ", " + salary;
	}

	
	

}

