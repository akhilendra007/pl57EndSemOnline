import java.util.ArrayList;
import java.util.List;


public class Story {
	String name;
	public String getName() {
		return name;
	}
	int priority;
	int velocity;
	int story_points;
	List<Tasks> tasks1=new ArrayList<Tasks>();;
	public Story(String string) {
		// TODO Auto-generated constructor stub
		name=string;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public int getStory_points() {
		return story_points;
	}
	public void setStory_points(int story_points) {
		this.story_points = story_points;
	}
	public List<Tasks> getTasks() {
		return tasks1;
	}
	boolean completed;
	
	List<String> tasks=new ArrayList<String>();
	public void definetask(String string, int i) {
		// TODO Auto-generated method stub
		tasks1.add(new Tasks(string,i));
	}
	public boolean check_for_complete() {
		// TODO Auto-generated method stub
		int st=1;
		
		for(int i=0;i<tasks1.size();i++)
		{
			if(tasks1.get(i).isCompleted())
			{
				System.out.println("\t\t\t" +tasks1.get(i).getTask()+ " :-Completed");
				st=st+1;
			}
			else
			{
				System.out.println("\t\t\t" +tasks1.get(i).getTask()+ " :-Is Not Completed");
			}
		}
		if(st==tasks1.size())
		{
			return true;
		}
		return false;
	}
	
}
