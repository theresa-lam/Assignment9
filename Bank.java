import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;

public class Bank  {
    PriorityQueue<Customer> queuedCustomers = new PriorityQueue<Customer>();
    private TreeSet<Customer> customers = new TreeSet<Customer>();
    private HashSet<BankAccount> accounts = new HashSet<BankAccount>();
    private Iterator iterator = accounts.iterator();
    private BankAccount[] anArray = new BankAccount[accounts.size()];

    public void queueCustomer(Customer a) {
        queuedCustomers.add(a);
    }

    public  Customer nextCustomer() {
        return queuedCustomers.poll();
    }

    public void addCustomer (Customer customer) {
        this.customers.add(customer);
    }

    public Customer [] getCustomers() {
        return customers.toArray(new Customer [customers.size()]);
    }


    public void addAccount(BankAccount account) throws DuplicateAccountException {
        if (accounts.contains(account) == false){
            accounts.add(account);
        }
        else{
            throw new DuplicateAccountException("This account already exists and has not been added");
        }
    }


    public BankAccount[] getAccounts() {
        ArrayList<BankAccount> list = new ArrayList<BankAccount>(accounts);
        return list.toArray(anArray);
    }
}

