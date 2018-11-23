import java.util.*;
import java.text.*;

public class Student extends Person {

	String time;
	int classcode;

	public Student(String string1, String string2, int string3) {
		super(string1, string2);
		classcode = string3;

		// TODO 自动生成的构造函数存根
	}

	public void signIn() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH：mm：ss：SSS");
		String str = sdf.format(System.currentTimeMillis());
		time = str;
		Event.addStudentToClass(this);
		// return "Sign in SUCCESSFULLY!";
	}

	public int getClassCode() {
		return classcode;
	}

	public String toString() {
		String str = "Code: " + code + " " + "Name: " + name + "   " + "ClassCode: " + classcode + "\n";
		return str;
	}

}
