package employeeWage;
import java.util.*;
public class employeeWage {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HOUR=20;
public static final int NUM_OF_WORKING_DAYS=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int empHrs=0;
int empWage=0;
int totalEmpWage=0;
  System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
  for(int day=0;day<NUM_OF_WORKING_DAYS;day++)
  {
  int empCheck=(int) (Math.floor(Math.random()*10)%3);
 
  switch (empCheck)
  {
  case IS_PART_TIME:
	  empHrs=4;
  case IS_FULL_TIME:
	  empHrs=8;
  default:
	  empHrs=4;
  }
   empWage=empHrs*EMP_RATE_PER_HOUR;
   totalEmpWage+=empWage;
 System.out.println("emp wage"+empWage);
  }
  System.out.println("Total emp wage"+totalEmpWage);
	}

}
