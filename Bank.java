import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Bank {
	PriorityQueue<Customer> queuedCustomers = new PriorityQueue<Customer>();
	private TreeSet<Customer> customers = new TreeSet<Customer>();
	private HashSet<BankAccount> accounts = new HashSet<BankAccount>();
	
	public void queueCustomer(Customer a) {
		queuedCustomers.add(a);
	}
	
	public  Customer nextCustomer() {
		
			return queuedCustomers.poll();
	
	}
	
	


	public void addCustomer (Customer customer)
	{
		this.customers.add(customer);
	}

	public Customer [] getCustomers()
	{
		return customers.toArray(new Customer [customers.size()]);
	}


	

	

    public void addAccount(BankAccount account) throws DuplicateAccountException {
        if (accounts.add(account)){
            accounts.add(account);
        }
        else{
            throw new DuplicateAccountException("This account already exists and has not been added");
        }
    }
	

		 public BankAccount[] getAccounts() {
		        Iterator iterator = accounts.iterator();
		        BankAccount[] anArray = new BankAccount[accounts.size()];
		        while (iterator.hasNext()) {
		            for (int i=0; i<=accounts.size(); i++){
		                anArray[i] = (BankAccount)iterator.next();
		            }
		        }
		        return anArray;
		    }


	
	
}

