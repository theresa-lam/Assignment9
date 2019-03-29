import java.util.PriorityQueue;

public class Bank {
	PriorityQueue<Customer> queuedCustomers = new PriorityQueue<Customer>();
	
	public void queueCustomer(Customer a) {
		queuedCustomers.add(a);
	}
	
	public  Customer nextCustomer() {
		
			return queuedCustomers.poll();
	
	
	}
}

