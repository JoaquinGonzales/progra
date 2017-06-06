

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Vector;

/**
 * The test class ProjectTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProjectTest
{
    Project project1;
    @Before
    public void setup()
    {
        project1= new Project("Project");
    }
    
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
    @Test
    public void projectCannotDuplicateTasks()
    {
        Project project = new Project("sample");
        Task firstTask = new Task("t1",5);
        
        project.addTask(firstTask);
        project.addTask(new Task("t1",5));
        assertEquals(1, project.countTasks());  
    }
    @Test
    public void projectWithMoreThanOnePath()
    {
       Project project = new Project("sample");
       Task firstTask = new Task("t1",1);
       Task secondTask = new Task("t2",5);
       Task thirdTask = new Task("t3",3);
       Task fourthTask = new Task("t4",2); 
       Task task5 = new Task("t5",3); 
       Task task6 = new Task("t6",4); 
       Task task7 = new Task("t7",3);
       
       task6.setDependency(fourthTask);
       task6.setDependency(task5);
       fourthTask.setDependency(secondTask);
       secondTask.setDependency(firstTask);
       task5.setDependency(thirdTask);
       thirdTask.setDependency(firstTask);
       task7.setDependency(task6);
       
        project.addTask(firstTask);
        project.addTask(secondTask);
        project.addTask(thirdTask);
        project.addTask(fourthTask);
        project.addTask(task5);
        project.addTask(task6);
        project.addTask(task7);       
        
       assertEquals(15, project.calculateMaxTimeToComplete());  
      // //List<Task> criticalPath = project.calculateCriticalPath();
       //assert
    }
    @Test
    public void calculateCritialPath()
    {
        Task task = new Task("t1",4);
        project1.addTask(task);
        List<Task> expected = new Vector<Task>();
        expected.add(task);
        assertEquals(expected,project1.calculateCriticalPath());
    }
}
