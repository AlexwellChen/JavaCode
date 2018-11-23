/**
 * Homework
 * @author Admin
 */
//import java.text.SimpleDateFormat;

//import java.util.*;
public class Homework extends Task {
	private String deadline;

	Homework(int i, String string, String string2, String string3, int j, String string4) {
		// TODO 自动生成的构造函数存根
		code = i;
		title = string;
		description = string2;
		creationDate = string3;
		state = j;
		deadline = string4;

	}

	public String getDeadline() {
		return deadline;
	}
}
