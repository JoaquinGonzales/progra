
import java.util.Vector;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project
{
   private Set<Task> tasks;
   private String description="";
   public Project()
   {
       tasks= new HashSet<Task>();
    }
    public Project (String desc)
    {
        description = desc;
        tasks= new HashSet<Task>();
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
        if(tasks.contains(task)!=true)
        {
            tasks.add(task);
        } 
    }
    public int countTasks()
    {
        return tasks.size();
    }
    public List<Task> calculateCriticalPath()
    {
        Task task1 = new Task("t1",5);
        Vector<Task> list = new Vector();
        return list;
    }
}
