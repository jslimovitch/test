/**      Jonathan Slimovitch
         CS 110: Intermediate Programming
         Assignment #8
         
         CourseGrades: Write a class named CourseGrades. The class should have a GradedActivity array
         named grades as a field. The array should have four elements (lab activity, pass/fail exam,
         essay, final exam). The class should also have setLab, setPassFailExam, setEssay, setFinalExam,
         toString methods.
         
         Analyzable Interface: Modify the CourseGrades class created below so that it implements an interface.
         The interface should have the getAverage(), getHighest(), and getLowest() methods.
*/

public class CourseGrades implements Analyzable
{
   //Declare/Initialize Fields
   private final int NUM_GRADES=4;
   private GradedActivity[] grades=new GradedActivity[NUM_GRADES];
   

   /**
      This constructor creates an object titled GradedActivity.
   */
   
   public CourseGrades()
   {
      GradedActivity[] grades=new GradedActivity[NUM_GRADES];
      System.out.print("hi");
             
   }
   
   /**
      The setLab method loads lab grade into array of GradedActivities
      @param aLab Lab Grade
   */
   
   public void setLab(GradedActivity aLab)
   {
      // grades[0]=new GradedActivity();
      grades[0]=aLab;
   }
   
   /**
      The setPassFailExam method sets pass fail exam object into array of Graded Activities
      @param aPassFailExam Exam Object
   */
   
   public void setPassFailExam(PassFailExam aPassFailExam)
   {
      grades[1]=aPassFailExam;
   }
   
   /**
      The setEssay method sets essay object into array of graded activities      
      @param aEssay Essay Object
   */
   
   public void setEssay(Essay aEssay)
   {
      grades[2]=aEssay;
   }
   
   /**
      The setFinalExam method sets Final Exam object into array of graded activities
      @param aFinalExam Final Exam object
   */
   
   public void setFinalExam(FinalExam aFinalExam)
   {
      grades[3]=aFinalExam;
   }
   
   /**
      The toString method combines everything into a single string
      @return str The string containing all information
   */
   
   public String toString() 
   {
      String str="Lab Grade: "+grades[0].getScore()+ "\nExam: "+grades[1].getGrade()
      + "\nEssay Grade: "+grades[2].getScore()+"\nFinal Exam Grade: "+grades[3].getScore();
      return str;
   }
   
   /**
      The getAverage() method returns average of four grades
      @return average Average of grades stored in array
   */
   
   public double getAverage()
   {
      double average =(grades[0].getScore()+grades[1].getScore()+grades[2].getScore()+grades[3].getScore())/(double)4;
      
      return average;
   }      
   
   /**
      The getHighest() method returns highest GradedActivity
      @return grades[highIndex] Highest Graded Activity
   */
   
   public GradedActivity getHighest()
   {
      int highIndex=0;
      
      for (int index=1;index<NUM_GRADES;index++)
      {
         if(grades[index].getScore()>grades[highIndex].getScore())
         {  
            highIndex=index;
         }
      }
      return grades[highIndex];  
   }
            
   /**
      The getLowest() method returns object with lowest score
      @return grades[lowIndex] Object with lowest score
   */
   
   public GradedActivity getLowest()
   {
      int lowIndex=0;
      
      for (int index=1;index<NUM_GRADES;index++)
      {
         if(grades[index].getScore()<grades[lowIndex].getScore())
         {  
            lowIndex=index;
         }
      }
      return grades[lowIndex];  
   }

   
   public static void main(String[] args)
   {
      //Create CourseGrades Object
      CourseGrades courseGrades1=new CourseGrades();
      
      //Create LabActivity, setScore, and then read it into CourseGrades
      GradedActivity labActivity1=new GradedActivity();
      labActivity1.setScore(20);
      courseGrades1.setLab(labActivity1);
      
      //Create PassFailExam object and read it into CourseGrades
      PassFailExam exam1=new PassFailExam(20,20,40);
      courseGrades1.setPassFailExam(exam1);
      
      //Create Essay object and read it into CourseGrades
      Essay essay1=new Essay();
      essay1.setScore(0,12,14,10);
      courseGrades1.setEssay(essay1);
      
      //Create Final Exam object and read it into CourseGrades
      FinalExam finalExam1=new FinalExam(20,10);
      courseGrades1.setFinalExam(finalExam1);
      
      //Call CourseGrades toString()
      System.out.println(courseGrades1.toString());
      
   }   
}         