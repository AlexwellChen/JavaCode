/**
 * TaskScore
 * 
 * @author MECHREV
 *
 */
public class TaskScore {
	float score;
	Task task;
	Student student;

	TaskScore(int i, Task task2, Student student1) {
		// TODO 自动生成的构造函数存根
		score = i;
		task = task2;
		student = student1;
	}

	public float getScore() {
		return score;
	}

	public Task getTask() {
		return task;
	}

	public Student getStudent() {
		return student;
	}

	public void setScore(float stuscore) {
		score = stuscore;
	}
}
