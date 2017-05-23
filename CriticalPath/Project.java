
import java.util.Vector;

/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project
{
   private Vector<Task> tasks;
   private String description="";
   public Project()
   {
       tasks= new Vector<Task>();
    }
    public Project (String desc)
    {
        description = desc;
        tasks= new Vector<Task>();
    }
    public int calculateMaxTimeToComplete()
    {
        int max=0;
        for(Task task:tasks)
        {
            int time = task.calculateTimeToComplete();
            if(time > max)
            {
                max=time;
            }
        }
        return max;
    }
    public void addTask(Task task)
    {
        tasks.add(task);
    }
}
