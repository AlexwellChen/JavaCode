
/**
 * Student
 * @author MECHREV
 *
 */
import java.util.*;

public class Student {
	int code;
	String name;
	Vector<TaskScore> taskScorelist = new Vector<TaskScore>();

	Student(int i, String string) {
		// TODO 自动生成的构造函数存根
		code = i;
		name = string;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Vector<TaskScore> getTaskScore() {
		return taskScorelist;
	}

	public void addTaskScore(TaskScore taskScore) {
		TaskScore a = taskScore;
		if (a == null)
			return;
		taskScorelist.addElement(a);
	}

	public void editTaskScore(Task t, int j)// i为课程代码，j为分数
	{
		
	}
}
