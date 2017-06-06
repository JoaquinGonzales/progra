
import java.util.Vector;
/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task
{
    private String description;
    private String name;
    private String owner;
    private int timeToComplete;
    
    private Vector<Task> preRequisite;
    
    public Task()
    {
        description = "";
        name="";
        owner="";
        timeToComplete=0;
        preRequisite = new Vector();
    }
    public Task(String name, int time)
    {
        this.name = name;
        timeToComplete = time;
        preRequisite = new Vector();
    }
   public String getDescription()
   {
       return description;
    }
   public void setDescription(String desc)
   {
       description = desc;
    }
     public String getName()
   {
       return name;
    }
   public void setName(String name)
   {
       this.name = name;
    }
     public String getOwner()
   {
       return owner;
    }
   public void setOwner(String owner)
   {
       this.owner = owner;
    }
      public int getTimeToComplete()
   {
       return timeToComplete;
    }
   public void setTimeToComplete(int timeToComplete)
   {
       this.timeToComplete = timeToComplete;
    }
    public void setDependency(Task task)
    {
       preRequisite.add(task);
    }
    
    public Vector<Task> getPreRequisite()
    {
        return preRequisite;
    }
    public int calculateTimeToComplete()
    {
        int time = getTimeToComplete();
        int num = getTimeToCompleteDepency();
        if(getPreRequisite() != null)
            {
                time = time + getTimeToCompleteDepency() ;
            }
        return time;
    }
    public int getTimeToCompleteDepency()
    {
       int max = 0;
       for(Task task:preRequisite)
        {
            int time = task.calculateTimeToComplete();
            if(time > max)
            {
                max=time;
            }
        } 
        return max;
    }
    @Override
    public boolean equals(Object otherObject)
    {
        Task otherTask = (Task) otherObject;
        return this.name.equals(otherTask.name)&&
               this.timeToComplete==otherTask.timeToComplete;
    }
    @Override
    public int hashCode()
    {
        return name.hashCode() + 53*timeToComplete;
    }
    
}

