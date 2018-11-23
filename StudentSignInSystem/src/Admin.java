/**
 * level could use 0、1 which contro wether admin can get the list of student who
 * is sign in.
 * 
 * @author MECHREV
 *
 */
public class Admin extends Person {

	int level;
	String teachercode;

	public Admin(String string1, String string2, String string3, int num) {
		super(string1, string2);
		level = num;
		teachercode = string3;
		// TODO 自动生成的构造函数存根
	}

}
