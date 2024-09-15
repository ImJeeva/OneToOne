package ManyToMany;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	private CustDetails cid;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;	
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCustDetails(CustDetails cid) {
		this.cid = cid;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	

	public CustDetails getCustDetails() {
		return cid;
	}
	
	public String toString(){
		return id +" "+ name;
	}
	


}

