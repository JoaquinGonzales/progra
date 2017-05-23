

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TaskTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TaskTest
{
    @Test
    public void createNewInstanceOfTask()
    {
        Task emptytask = new Task();
        assertTrue(emptytask instanceof Task);
        assertTrue(emptytask instanceof Object);
    }
    @Test
    public void readDescriptionProperty()
    {
        Task emptyTask = new Task();
        
        assertEquals("",emptyTask.getDescription());
    }
    @Test
    public void writeDescription()
    {
         Task task = new Task();
         task.setDescription("TEST");
        
        assertEquals("TEST",task.getDescription());
    }
     @Test
    public void readNameProperty()
    {
        Task emptyTask = new Task();
        
        assertEquals("",emptyTask.getName());
    }
    @Test
    public void writeName()
    {
         Task task = new Task();
         task.setName("TEST");
        
        assertEquals("TEST",task.getName());
    }
    @Test
    public void readOwnerProperty()
    {
        Task emptyTask = new Task();
        
        assertEquals("",emptyTask.getOwner());
    }
    @Test
    public void writeOwner()
    {
         Task task = new Task();
         task.setOwner("TEST");
        
        assertEquals("TEST",task.getOwner());
    }
    @Test
    public void readTimeToCompleteProperty()
    {
        Task emptyTask = new Task();
        
        assertEquals(0,emptyTask.getTimeToComplete());
    }
    @Test
    public void writeTimeToComplete()
    {
         Task task = new Task();
         task.setTimeToComplete(1);
        
        assertEquals(1,task.getTimeToComplete());
    }
}
