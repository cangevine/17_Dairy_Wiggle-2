/**Moover
Moovers are the waiters at the Dairy Wiggle. 
(Although the restaurant only serves milkshakes, you are expected to sit down, place your order, receive your shake, and tip your waiter. Like civilized folk.)
 Moovers work() by taking an order and then delivering it.
takeOrder()
	Increase the effectivenessMultiplier by +0.05...
	unless the Moover forgets the order (which happens 20% of the time). 
	In that case, decrease the effectivenessMultiplier by -0.1. 
deliverShake()
	Increase the effectivenessMultiplier by +0.03... 
	unless the Moover trips and spills the shake (which happens 5% of the time).
	In that case, decrease the effectivenessMultiplier by -0.1
*/
public class Moover extends Employee{
	public Moover(){
		super(500, 150);
	}
	public void work(){
		takeOrder();
		deliverShake();
		setDW();
	}
	public void takeOrder(){
		if(calcChances(20)){
			setEM(getEM()+0.05);
		} else {
			setEM(getEM()-0.1);
		}
	}
	public void deliverShake(){
		if(calcChances(5)){
			setEM(getEM()+0.03);
		} else {
			setEM(getEM()-0.1);
		}
	}
	
}