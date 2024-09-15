package ManyToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		cf.addAnnotatedClass(Orders.class);
		cf.addAnnotatedClass(Customer.class);
		cf.addAnnotatedClass(CustDetails.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		// created Customer details.
		Customer c = new Customer(5,"Ajila");
		CustDetails cd = new CustDetails(104, "aji@gmail", 50000);
		c.setCustDetails(cd);
		//Order details.
		Orders b = new Orders(208, "Noodles", 99);
		b.setCustomer(c);
		s.save(b);
		
//      <------------- Using Exist Customer Object ------------->		
		//Storing data by directly calling CUSTOMER object which are present in database.
		
//		Orders biriyani = new Orders(204, "Biriyani", 199);
//		Orders gobi = new Orders(205, "Gobi", 75);
//		Orders noodles = new Orders(206, "Noodles", 99);
//		
//		Customer c = s.get(Customer.class, 2); // fetch the customer from database.
//		
//		biriyani.setCustomer(c);
//		noodles.setCustomer(c);
//		gobi.setCustomer(c);
//		
//		s.save(biriyani);
//		s.save(gobi);
//		s.save(noodles);
		
		t.commit();
		System.out.println("Sucess");
		
		
		
	}

}

