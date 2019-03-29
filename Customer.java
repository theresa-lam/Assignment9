public class Customer implements Comparable<Customer>{
	private String name = "";
	private int id = 0;
	CreditHistory history;
	
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
	
		@Override
	public int compareTo(Customer other) {
		int nameOrder = this.name.compareTo((other.name));
		if (nameOrder == 0)
		{
			return this.id - other.id;
		}
		else 
		{
			return nameOrder;
		}
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
	public CreditHistory getCreditHistory (){
		return history;
	}

	
}
