
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
    
    private Task preRequisite;
    
    public Task()
    {
        description = "";
        name="";
        owner="";
        timeToComplete=0;
    }
    public Task(String name, int time)
    {
        this.name = name;
        timeToComplete = time;
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
       preRequisite = task;
    }
    public boolean getDependency()
    {
        return preRequisite!=null;
    }
    public int getTimeOfPrerequisite()
    {
        int res=0;
        if(preRequisite!=null)
        {
            res = preRequisite.getTimeToComplete();
        }
        return res;
    }
    public Task getPreRequisite()
    {
        return preRequisite;
    }
    
    public int calculateTimeToComplete()
    {
        int time = getTimeToComplete();
        if(getPreRequisite() != null)
            {
                time = time + getPreRequisite().getTimeToComplete();
            }
        return time;
    }
}

