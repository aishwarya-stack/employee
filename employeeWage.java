package employeeWage;
import java.util.*;
public class employeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int IS_FULL_TIME=1;
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
  int empCheck=(int) (Math.floor(Math.random()*10)%2);
  //System.out.println("value"+number);
  if(empCheck==1)
  {
      empHrs=8;	  
	   System.out.println("employee present");
	   
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
