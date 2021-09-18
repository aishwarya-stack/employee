package employeeWage;
import java.util.*;
public class employeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int IS_FULL_TIME=2;
int IS_PART_TIME=1;
int EMP_RATE_PER_HOUR=20;
int empHrs=0;
int empWage=0;
  System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
  int number=(int) (Math.floor(Math.random()*10)%2);
  System.out.println("value"+number);
  if(number==1)
  {
	   System.out.println("employee present");
	   
  }
  else
  {
	   System.out.println("employee absent");
  }
  int empCheck=(int) (Math.floor(Math.random()*10)%3);
  //System.out.println("value"+number);
  if(empCheck==IS_PART_TIME)
  {
      empHrs=4;	  
	   
  }
  else if(empCheck==IS_FULL_TIME)
  {
	  empHrs=8;
  }
  else 
  {
       empHrs=0;	  
	   System.out.println("employee absent");
  }
  empWage=empHrs*EMP_RATE_PER_HOUR;
 System.out.println("emp wage"+empWage);
	}

}
