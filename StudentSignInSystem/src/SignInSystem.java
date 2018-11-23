import java.util.*;
import java.io.*;

public class SignInSystem {

	static Student Xiaowang = new Student("101", "xiaowang", 1);
	static Student Xiaoming = new Student("102", "xiaoming", 2);
	static Student Xiaohei = new Student("103", "xiaohei", 3);
	static Admin laoshi = new Admin("110", "test", "101", 1);
	static DataBase dataBase = new DataBase();

	public static void run(int num) {
		dataBase.setEvent(num);
		
	}

	public void signIn(Student e) {
		e.signIn();
	}

	public static void main(String[] args) {
		SignInSystem.run(3);
		Xiaowang.signIn();
		Xiaoming.signIn();
		Xiaohei.signIn();
		Event temp = dataBase.getEvent(0);
		System.out.println(temp.toString());
		//System.out.println(temp.signEvent.get(0).Aclass.size());
	}
}
