/**
 * Experiment
 * @author Admin
 */
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;

public class Experiment extends Task {
	String deadline;
	int numberOfJavaFile;

	Experiment(int i, String string, String string2, String string3, int j, String string4, int k) {
		// TODO �Զ����ɵĹ��캯�����
		code = i;
		title = string;
		description = string2;
		creationDate = string3;
		state = j;
		deadline = string4;
		numberOfJavaFile = k;
	}

	public String getDeadline() {
		return deadline;
	}

	public int getNumberOfJavaFile() {
		return numberOfJavaFile;
	}

}
