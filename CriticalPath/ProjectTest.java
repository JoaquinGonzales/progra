

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
    @Test
    public void calculateTimeToDeliverofTwoDependentTasks()
    {
       Project project = new Project("sample");
       
       Task firstTask = new Task("t1",5);
       Task secondTask = new Task("t2",4);
       Task thirdTask = new Task("t3",6);
       firstTask.setDependency(secondTask);
       firstTask.setDependency(thirdTask);

       project.addTask(firstTask);
       project.addTask(secondTask);
       project.addTask(thirdTask);
       
       assertEquals(11, project.calculateMaxTimeToComplete()); 
    }
    @Test
    public void calculateTimeToDeliveryUsingATaskDependentOfTwoTask()
    {
      Project project = new Project("sample");
       
       Task firstTask = new Task("t1",5);
       Task secondTask = new Task("t2",2);
       Task thirdTask = new Task("t3",6);
       Task fourthTask = new Task("t4",1);
       secondTask.setDependency(firstTask);
       thirdTask.setDependency(firstTask);
       fourthTask.setDependency(secondTask);
       fourthTask.setDependency(thirdTask);

       project.addTask(firstTask);
       project.addTask(secondTask);
       project.addTask(thirdTask);
       project.addTask(fourthTask);
       
       assertEquals(12, project.calculateMaxTimeToComplete());   
    }
    @Test
    public void calculateTimeToDeliverUsingATaskWithoutDependencies()
    {
      Project project = new Project("sample");
       
       Task firstTask = new Task("t1",5);
       Task secondTask = new Task("t2",2);
       Task thirdTask = new Task("t3",6);
       Task fourthTask = new Task("t4",1);
       Task fifthTask = new Task("t5",10);
       Task sixthTask = new Task("t6",40);
       secondTask.setDependency(firstTask);
       thirdTask.setDependency(firstTask);
       fourthTask.setDependency(secondTask);
       fourthTask.setDependency(thirdTask);
       firstTask.setDependency(fifthTask);

       project.addTask(firstTask);
       project.addTask(secondTask);
       project.addTask(thirdTask);
       project.addTask(fourthTask);
       project.addTask(fifthTask);
       project.addTask(sixthTask);
       
       assertEquals(40, project.calculateMaxTimeToComplete());   
    }
    //US 3
    @Test
    public void modifyTaskTimeToCompleteShouldChangeTheProject()
    {
       Project project = new Project("sample");
       Task firstTask = new Task("t1",5);
       Task secondTask = new Task("t2",2);
       Task thirdTask = new Task("t3",6);
       Task fourthTask = new Task("t4",1);
       secondTask.setDependency(firstTask);
       thirdTask.setDependency(firstTask);
       fourthTask.setDependency(secondTask);
       fourthTask.setDependency(thirdTask);

       project.addTask(firstTask);
       project.addTask(secondTask);
       project.addTask(thirdTask);
       project.addTask(fourthTask);
       
       assertEquals(12, project.calculateMaxTimeToComplete());  
       secondTask.setTimeToComplete(10);
       assertEquals(16, project.calculateMaxTimeToComplete());  
       
    }
}
