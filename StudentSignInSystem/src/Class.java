import java.util.*;

/**
 * A class include a bounch of students
 * 
 * @author Admin
 *
 */
public class Class {
	//String classcode = null;
	static Vector<Student> Aclass = new Vector<Student>();

	Class(){
		
	}

	public void addStudent(String code, String name, int classCode) {
		Student temp = new Student(code, name, classCode);
		Aclass.addElement(temp);
	}

	public void addStudent(Student e) {
		Aclass.addElement(e);
		System.out.println("cnt "+this.hashCode()+" "+Aclass.size());
	}

	public Vector<Student> getClassMember() {
		return Aclass;
	}

	public String toString() {
		String str = "";
		for (Student temp : Aclass) {
			str += temp.toString();
		}
		return str;
	}
}
