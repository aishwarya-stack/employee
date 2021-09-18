package employeeWage;
import java.util.*;
public class employeeWage {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HOUR=20;
public static final int NUM_OF_WORKING_DAYS=2;
public static final int MAX_HRS_IN_MONTH=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int empHrs=0;
int empWage=0;
int totalEmpHrs=0;
int totalEmpWage,totalWorkingDays=0;
  System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
  while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
  {
	  totalWorkingDays++;
  int empCheck=(int) (Math.floor(Math.random()*10)%3);
 
  switch (empCheck)
  {
  case IS_PART_TIME:
	  empHrs=4;
  case IS_FULL_TIME:
	  empHrs=8;
  default:
	  empHrs=0;
  }
   //empWage=empHrs*EMP_RATE_PER_HOUR;
   totalEmpHrs+=empWage;
 System.out.println("days"+totalWorkingDays+"emphrs"+empHrs);
  }
   totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
  System.out.println("Total emp wage"+totalEmpWage);
	}

}
