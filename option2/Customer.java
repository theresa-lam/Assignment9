public class Customer implements Comparable<Customer>{
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
	
	public int compareTo(Customer st){
		if (history.getCreditRating() < st.history.getCreditRating()) {
			return 1;
		} else if (history.getCreditRating() == st.history.getCreditRating()) {
			return 0;
		} else {
			return -1;
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
}
