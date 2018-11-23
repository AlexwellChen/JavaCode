import java.util.*;

/**
 * a database contain a series of sign in events
 * 
 * @author Admin
 *
 */
public class DataBase {
	Vector<Event> Events = new Vector<Event>();

	public Event getEvent(int num) {
		return Events.get(num);
	}

	public void setEvent(int numOfClass) {
		Event temp = new Event();
		Events.add(temp);
		for(int i=0;i<numOfClass;i++) {
			Event.addClass();
		}
		//System.out.println("creat success"+" "+Events.size());
	}

}
