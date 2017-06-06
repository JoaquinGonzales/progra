

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
    @Test
    public void taskAreEqualIfTheyHaveTheSameAndTimeToComplete()
    {
        Task task1 = new Task("t1",5);
        Task task2 = new Task("t1",5);
        boolean equals = task1.equals(task2);
        assertTrue(equals);
    }
    @Test
    public void taskAreEqualIfTheyHaveTheSameAndTimeToComplete2()
    {
        Task task1 = new Task("t1",5);
        Task task2 = new Task("t2",5);
        boolean equals = task1.equals(task2);
        assertFalse(equals);
    }
    @Test
    public void taskAreEqualIfTheyHaveTheSameNameAndDifferentTimeToComplete()
    {
        Task task1 = new Task("t1",5);
        Task task2 = new Task("t1",6);
        boolean equals = task1.equals(task2);
        assertFalse(equals);
    }
}
