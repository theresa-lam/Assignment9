import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class BankTest
{	
	// testing customer queue list
	@Test
	public void test_queueAndNextCustomer_emptyQueue(){
		Bank b = new Bank();
		
		Customer actual = b.nextCustomer();
		
		assertNull("Did not put any customer on the queue, so expected next customer to be null", actual);
	}
	
	@Test
    public void test_queueAndNextCustomer_firstAddedWorseRating(){
    	Customer c1 = new Customer("Customer One", 123);
    	CreditHistory h1 = new CreditHistory();
    	h1.addRating(4);
    	c1.setCreditHistory(h1);
    	
    	Customer c2 = new Customer("Customer Two", 456);
    	CreditHistory h2 = new CreditHistory();
    	h2.addRating(5);
    	c2.setCreditHistory(h2);
    	
    	Bank b = new Bank();
    	b.queueCustomer(c1);
    	b.queueCustomer(c2);
    	
    	Customer actual = b.nextCustomer();
   
    	assertEquals("Last customer added should have been first removed: it had higher rating", "Customer Two", actual.getName());
    }

	@Test
    public void test_queueAndNextCustomer_secondAddedWorseRating(){
    	Customer c1 = new Customer("Customer One", 123);
    	CreditHistory h1 = new CreditHistory();
    	h1.addRating(3);
    	c1.setCreditHistory(h1);
    	
    	Customer c2 = new Customer("Customer Two", 456);
    	CreditHistory h2 = new CreditHistory();
    	h2.addRating(-1);
    	c2.setCreditHistory(h2);
    	
    	Bank b = new Bank();
    	b.queueCustomer(c1);
    	b.queueCustomer(c2);
    	
    	Customer actual = b.nextCustomer();
   
    	assertEquals("First customer added should have been first removed: it had higher rating", "Customer One", actual.getName());
    }


	@Test
    public void test_queueAndNextCustomer_addingManyThenDequeuAll(){
    	Customer c1 = new Customer("Rating 5", 123);
    	CreditHistory h1 = new CreditHistory();
    	h1.addRating(5);
    	c1.setCreditHistory(h1);
    	
    	Customer c2 = new Customer("Rating 4", 456);
    	CreditHistory h2 = new CreditHistory();
    	h2.addRating(4);
    	c2.setCreditHistory(h2);
    	
    	Customer c3 = new Customer("Rating 3", 456);
    	CreditHistory h3 = new CreditHistory();
    	h3.addRating(3);
    	c3.setCreditHistory(h3);
    	
    	Customer c4 = new Customer("Rating -1", 456);
    	CreditHistory h4 = new CreditHistory();
    	h4.addRating(-1);
    	c4.setCreditHistory(h4);
    	
    	Customer c5 = new Customer("Rating -3", 456);
    	CreditHistory h5 = new CreditHistory();
    	h5.addRating(-3);
    	c5.setCreditHistory(h5);
    	
    	Bank b = new Bank();
    	b.queueCustomer(c3);
    	b.queueCustomer(c4);
    	b.queueCustomer(c1);
    	b.queueCustomer(c5);
    	b.queueCustomer(c2);
    	
    	  
    	assertEquals("After queueing five customer, expected customer with rating 5 to be at the head of the queue.", "Rating 5", b.nextCustomer().getName());
    	assertEquals("After queueing five customer, expected customer with rating 4 to be second in the queue.", "Rating 4", b.nextCustomer().getName());
    	assertEquals("After queueing five customer, expected customer with rating 3 to be third in the queue", "Rating 3", b.nextCustomer().getName());
    	assertEquals("After queueing five customer, expected customer with rating -1 to be fourth in the queue.", "Rating -1", b.nextCustomer().getName());
    	assertEquals("After queueing five customer, expected customer with rating -3 to be last in the queue.", "Rating -3", b.nextCustomer().getName());
    }	
}
