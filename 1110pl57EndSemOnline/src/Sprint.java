import java.util.ArrayList;
import java.util.List;


public class Sprint {
	List<Story> stories=new ArrayList<Story>();

	public void addsprint(Story story) {
		// TODO Auto-generated method stub
		stories.add(story);
	}

	public List<Story> getStories() {
		return stories;
	}
	public void update_task()
	{
		
	}

	public boolean show_team_progress() {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<stories.size();i++)
		{
			if(stories.get(i).check_for_complete())
			{
				System.out.println("\t\t" +stories.get(i).getName()+ " :-Completed");
				k=k+1;
			}
			else
			{
				System.out.println("\t\t" +stories.get(i).getName()+ " :- Incomplete");
			}
		}
		if(k==stories.size()&& stories.size()>1)
			return true;
		return false;
	}
}
