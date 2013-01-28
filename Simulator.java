/**Simulator
The Simulator class is responsible for managing all of the Employees by printing out a report 
on each of their activities on a weekly basis along with the amount of money they have been paid so far this year.
Each Simulator should have two instances of each type of Employee. Once every month, 
one Employee should be selected at random to win their monthly line dancing competition,
earning a bonus check, which should be between $100 and $200.*/
import java.util.Random;
public class Simulator{
	private Employee[] employees;
	public static void main(String[] args){
		System.out.println("The Simulation has begun!");
		Simulator s = new Simulator();
	}
	public Simulator(){
		employees = new Employee[6];
		for(int i=0; i<2; i++){
			Employee i_tbs = new TastebudStylist(); // creates 2 TastebudStylists
			employees[i] = i_tbs;
		}
		for(int i=2; i<4; i++){
			Employee i_m = new Moover(); // creates 2 Moovers
			employees[i] = i_m;
		}
		for(int i=4; i<6; i++){
			Employee i_s = new Shaker(); // creates 2 Shakers
			employees[i] = i_s;
		}
		// @BC: A lot of for loops, but the comments add clarity to a nice implementation here
		for(int year=0; year<1; year++){
			for(int month=0; month<6; month++){ // 6 month simulation
				for(int week=0; week<4; week++){ // in this simulation a month is 4 weeks
					for(int day=0; day<7; day++){ // employees work 7 days a week
													// @BC: Ouch. What a tough boss!
						for(int i = 0; i < employees.length; i++){
							employees[i].work();
						}	
					}
					for(int i=0; i < employees.length; i++){
						employees[i].earnPaycheck();
					}
					printReport();
				}
				int monthNum = month+1;
				Random r = new Random();
				int j = r.nextInt(6);
				employees[j].earnBonus();
				// @BC: Nice attention to detail
				if(monthNum == 1){
					System.out.println(employees[j] + " I won the danceoff in the " + monthNum + "st month!" );
				} else if(monthNum == 2){
					System.out.println(employees[j] + " I won the danceoff in the " + monthNum + "nd month!" );
				} else if (monthNum == 3){
					System.out.println(employees[j] + " I won the danceoff in the " + monthNum + "rd month!" );
				} else {
					System.out.println(employees[j] + " I won the danceoff in the " + monthNum + "th month!" );
				}
			}
		}
		printSummary();
	}
	// @BC: The report is a bit hard to read. Not taking off for it, but definitely an opportunity for improvement next time around.
	public void printReport(){
		String a = "";
		for(int i = 0; i < employees.length; i++){
			a = a + employees[i];
			System.out.println("");
		}
		System.out.println(a);
	}
	public void printSummary(){
		System.out.println("The Simulation has ended.");
	}
}