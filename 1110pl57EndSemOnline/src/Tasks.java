
public class Tasks {
	public Tasks(String string, int i) {
		// TODO Auto-generated constructor stub
		this.task=string;
		no_hours=i;
		completed=false;
	}
	String task;
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public String getTask() {
		return task;
	}
	public int getNo_hours() {
		return no_hours;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void set_complete(boolean th)
	{
		completed=th;
	}
	int no_hours;
	boolean completed;
}
