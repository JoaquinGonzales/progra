

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SubTaskTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SubTaskTest
{
    @Test
    public void createSubTask()
    {
        SubTask subTask= new SubTask();
        assertTrue(subTask instanceof SubTask);
    }
    @Test
    public void createSubTaskWithDescription()
    {
       SubTask subTask= new SubTask("test",1);
       assertEquals("test",subTask.getDescription());
    }
}
