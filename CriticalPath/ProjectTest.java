

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProjectTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProjectTest
{
   @Test
   public void testProject()
   {
      Project project = new Project("sample");
       
       Task firstTask = new Task("t1",5);
       
       project.addTask(firstTask);
       
       assertEquals(5, project.calculateMaxTimeToComplete()); 
   }
   //US1
   @Test
   public void calcultateTimeOfTwoIndependentTask()
   {
       Project project = new Project("sample");
       
       Task firstTask = new Task("t1",5);
       Task secondTask = new Task("t1",4);
       
       project.addTask(firstTask);
       project.addTask(secondTask);
       
       assertEquals(5, project.calculateMaxTimeToComplete());
    }
    @Test
    public void calculateTimeToDeliveryofDependentTasks()
    {
       Project project = new Project("sample");
       
       Task firstTask = new Task("t1",5);
       Task secondTask = new Task("t1",4);
       firstTask.setDependency(secondTask);
       
       project.addTask(firstTask);
       project.addTask(secondTask);
       
       assertEquals(9, project.calculateMaxTimeToComplete());
    }
}
