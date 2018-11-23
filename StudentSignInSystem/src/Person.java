/**
 * Person(code, name, classcode)
 * 
 * @author MECHREV
 *
 */
public class Person {

	String code = null;
	String name = null;

	// String classcode = null;
	Person(String string1, String string2) {
		code = string1;
		name = string2;
	}

	public String getCode() {
		return code;
	}

	public String getname() {
		return name;
	}

}
