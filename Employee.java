
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
	// @BC: Careful here -- the specs required that earnBonus take a parameter. This way, each time a bonus happens it could be a
	//		random amount (and not a fixed bonus per employee)
	public void earnBonus() {
		totalPaymentToDate += bonus;
	}
	public double getEM(){
		return effectivenessMultiplier;
	}
	// @BC: Looking at the way this is used in subclasses, it seems as if it would be easier to rethink this mutator and instead
	//		you could have increase and decrease EM mutator methods
	public void setEM(double em){
		effectivenessMultiplier = em;
	}	 
	public int getDW(){
		return daysWorked;
	} 
	// @BC: Nice idea here
	public void setDW(){
		daysWorked++;
		if (daysWorked % 7 == 0){
			setEM(1);
		}
	}
	// @BC: Nice thought to carry this over from the last project
	public boolean calcChances(int pct){
		Random r = new Random();
		int myNum = r.nextInt(100);
		return(100-pct <= myNum);
	}
	public String toString(){
		return "EMult: "+effectivenessMultiplier+"  BWS: $" + baseWeekSalary+"/week   TPTD: $"+totalPaymentToDate+   " DW: " + daysWorked+ " days ";
	}
}