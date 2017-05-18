

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
}
