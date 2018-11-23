/**
 *  µœ÷¡ÀContact
 * @author Admin
 *
 */
public class Contact extends Person {

	private String workTelephone;
	private String jobPosition;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String initialName, String initialHomeTelephone, String initialEmail, String initialWorkTelephone,
			String initialJobPosition) {
		super(initialName, initialHomeTelephone, initialEmail);
		workTelephone = initialWorkTelephone;
		jobPosition = initialJobPosition;
		// TODO Auto-generated constructor stub
	}

	public String getWorkTelephone() {
		return workTelephone;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public String toString() {
		String result = name + "_" + homeTelephone + "_" + email + "_" + workTelephone + "_" + jobPosition;
		return result;
	}
}
