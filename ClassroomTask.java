
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.*;

public class ClassroomTask extends Task {
	private Vector<Student> listOfStudent;

	ClassroomTask(int i, String string, String string2, String string3, int j) {
		// TODO �Զ����ɵĹ��캯�����
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
