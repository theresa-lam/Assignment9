import java.util.TreeSet;


public class Bank {
	private TreeSet<Customer> customers;
	
	public Bank() {
		customers = new TreeSet<Customer>();
	}
	
	public void addCustomer (Customer customer){
		this.customers.add(customer);
	}
	
	public Customer [] getCustomers(){
		return customers.toArray(new Customer [customers.size()]);
	}

}