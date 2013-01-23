
/**Employee
effectivenessMultiplier
	the total amount the employee makes every week is the baseWeeklySalary multiplied by this number. This number should be reset to 1 at the start of every week.
baseWeeklySalary
	the baseline figure that the employee should make every week
totalPaymentToDate
	a running total of how much the employee has been paid
work()
earnPaycheck()
earnBonus(amount)*/

import java.util.Random;
public abstract class Employee{
	private double effectivenessMultiplier;
	private int baseWeekSalary;
	private int totalPaymentToDate;
	private int daysWorked;
	private int bonus;
	public Employee(int bws, int amount){
		effectivenessMultiplier = 1;
		daysWorked = 0;
		baseWeekSalary = bws;
		bonus = amount;
	}
	public abstract void work();
	public void earnPaycheck() {
		totalPaymentToDate += (baseWeekSalary * effectivenessMultiplier);
	}
	public void earnBonus() {
		totalPaymentToDate += bonus;
	}
	public double getEM(){
		return effectivenessMultiplier;
	}
	public void setEM(double em){
		effectivenessMultiplier = em;
	}	 
	public int getDW(){
		return daysWorked;
	} 
	public void setDW(){
		daysWorked++;
		if (daysWorked % 7 == 0){
			setEM(1);
		}
	}
	public boolean calcChances(int pct){
		Random r = new Random();
		int myNum = r.nextInt(100);
		return(100-pct <= myNum);
	}
	public String toString(){
		return "EMult: "+effectivenessMultiplier+"  BWS: $" + baseWeekSalary+"/week   TPTD: $"+totalPaymentToDate+   " DW: " + daysWorked+ " days ";
	}
}