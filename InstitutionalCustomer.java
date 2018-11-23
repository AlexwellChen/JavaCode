import java.util.*;
/**
 * ʵ���˼��ſͻ�
 * @author Admin
 *
 */
public class InstitutionalCustomer implements Customer, java.lang.Iterable<Contact> {

	String customerId;
	ArrayList<Contact> contacts = new ArrayList<Contact>();

	public InstitutionalCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * �вι��캯��
	 * 
	 * @param customerId2
	 * @param object
	 */
	public InstitutionalCustomer(String customerId2, ArrayList<Contact> contacts) {
		// TODO Auto-generated constructor stub
		super();
		customerId = customerId2;
		this.contacts = contacts;
	}

	@Override
	public Iterator<Contact> iterator(){
		return contacts.iterator();
	}

	@Override
	public String getCustomerId() {
		// TODO Auto-generated method stub
		return customerId;
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public Contact getContact(String name) {
		for (Contact temp : contacts) {
			if (temp.getName() == name)
				return temp;
		}
		return null;
	}

}
