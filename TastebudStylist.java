/**TastebudStylist
The Dairy Wiggle doesn’t have chefs or cooks. They have TastebudStylists. 
These folks are the masters responsible for crafting the milkshakes, 
and typically earn the most money of all employees. TastebudStylists work() by doing one thing and one thing alone: making milkshakes.
makeShake()
	Increase the effectivenessMultiplier by +0.1... 
	unless the TastebudStylist decides to sample the product (which happens 10% of the time). 
	In that case, immediately reset the effectivenessMultiplier to 1.*/

public class TastebudStylist extends Employee{
	public TastebudStylist(){
		super(600,200);
	}
	public void work(){
		makeShake();
		setDW();
	}
	public void makeShake(){
		if(calcChances(10)){
			setEM(getEM() + 0.1);
		} 
	}
}