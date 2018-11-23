import java.util.*;
/**
 * 实现了主控类
 * @author Admin
 *
 */
public class CustomerInformationSystem {

	ArrayList<Customer> customers = new ArrayList<Customer>();

	public void addCustomer(Customer customer) {
		int flag = 0;
		for(Customer temp : customers)
		{
			if(temp.getCustomerId() == customer.getCustomerId())
				flag = 1;
		}
		if(flag == 0 )
			customers.add(customer);
	}

	public Customer getCustomer(String customerId) {
		for (Customer temp : customers) {
			if (temp.getCustomerId() == customerId)
				return temp;
		}
		return null;
	}

	public boolean addContact(String customerId, Contact contact) {

		for(Customer temp : customers) {
			if(temp.getCustomerId() == customerId && temp instanceof InstitutionalCustomer)
			{
				InstitutionalCustomer temp2 = (InstitutionalCustomer)temp;
				temp2.addContact(contact);
				return true;
			}
		}
		return false;
	}
}
