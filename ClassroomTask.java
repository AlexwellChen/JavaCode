
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.*;

public class ClassroomTask extends Task {
	private Vector<Student> listOfStudent;

	ClassroomTask(int i, String string, String string2, String string3, int j) {
		// TODO 自动生成的构造函数存根
		code = i;
		title = string;
		description = string2;
		creationDate = string3;
		state = j;
	}

	public Vector<Student> getListOfStudent() {
		return listOfStudent;
	}
}
