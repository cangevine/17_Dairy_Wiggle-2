/**Shakers
Why use a machine to blend your dairy when you can use a professional? Shakers are critical to the restaurant, however they are not very well paid. 
Shakers work() by doing just one thing. They get into a groove over the course of a week and get better and better at it -- and they never ever fail...
shake()
	Increase the effectivenessMultiplier by +0.02*/
public class Shaker extends Employee{
	public Shaker(){
		super(400,100);
	}
	public void shake() {
		setEM(getEM() + 0.02);
	}
	public void work() {
		shake();
		setDW();
	}
}