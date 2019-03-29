import java.util.Comparator;

public class CustomerPriorityComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer st, Customer g) {
		if (st.history.getCreditRating() < g.history.getCreditRating()) {
			return 1;
		} else if (st.history.getCreditRating() == g.history.getCreditRating()) {
			return 0;
		} else {
			return -1;
		}

		
	}

	
	
	

}
