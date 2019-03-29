public class Customer implements Comparable<Customer> {
	private String name = "";
	private int id = 0;
	private CreditHistory history;
	
	public Customer()
	{
		
	}
	
	public Customer(Customer oldCustomer)
	{
		name = oldCustomer.getName();
		id = oldCustomer.getID();
	}
	
	
	public Customer(String aName, int anID){
		name = aName;
		id = anID;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setID(int newID)
	{
		id = newID;
	}
	
	public int getID() {
		return id;
	}
	
	
	public String toString()
	{
		return name + ' ' + id;
	}
	
	public void setCreditHistory(CreditHistory aHistory) {
		history = aHistory;
	}

	
	@Override
	public int compareTo(Customer o) {
		int order = this.name.compareTo((o.name));
		if (order == 0)
		{
			return this.id - o.id;
		}
		else 
		{
			return order;
		}
	}
		
	public boolean equals (Object o) {
		if (this == o) 
			return true;
		else if (o == null || getClass() != o.getClass())
			return false;
		Customer customer = (Customer) o;
		return id == customer.id;
	}
		
	
}