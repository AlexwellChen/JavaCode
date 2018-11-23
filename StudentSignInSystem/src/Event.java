import java.util.*;
/**
 * a event include some class with specific classcode which is its' index
 */
import java.text.*;

public class Event {
	String creatTime = null;
	static Vector<Class> signEvent = new Vector<Class>();

	Event() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH£ºmm£ºss£ºSSS");
		String str = sdf.format(System.currentTimeMillis());
		creatTime = str;
		System.out.println("creat signEvent success");
	}

	public static void addClass() {
		Class temp = new Class();
		signEvent.add(temp);
	}

	public static void addStudentToClass(Student e) {
		int ClassCode = e.getClassCode();
		//System.out.println(ClassCode);
		signEvent.get(ClassCode-1).addStudent(e);
	}

	public Vector<Class> getSignClass() {
		if (signEvent == null)
			return null;
		else
			return signEvent;
	}

	public String toString() {
		String str = "";
		for (int i=0;i<signEvent.size();i++) {
			int temp = i+1;
			str+="Class "+temp+":\n"+signEvent.get(i).toString()+"\n";
		}
		
		return str;
	}
}
