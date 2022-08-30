/*
 * Perera A.S.A
 * IT21013096
 * Malabe
 * 1.2
 * Y2S1
 * 
 * */

package assignment_01_Q2;

public class Director extends Manager{//Director inherit from Manager class 
	
	private double bonus;
	private double entertainmentAllowance;
	
	//default constructor
	public Director() {
		this.bonus = 0;
		this.entertainmentAllowance = 0;
	}
	
	//Parameterized constructor
	public Director(double bonus, double entertainmentAllowance) {
		this.bonus = bonus;
		this.entertainmentAllowance = entertainmentAllowance;
	}
	
	//setters and getters 
	
	public void setBonus(double bonus){
		this.bonus = bonus;

	}
	public void setEntertainmentAllowance(double entertainmentAllowance){
		this.entertainmentAllowance = entertainmentAllowance;
	
	}
	
	public double getBonus(){
		return bonus;
	}

	public double getEntertainmentAllowance(){
		return entertainmentAllowance;	
		}
		
	//declare methods
	
	//Salary Calculation method
	public double calcNetSalary() {
		
		return getBasicsalary() + getAllowances() - getDeduction()+ getBonus() + getEntertainmentAllowance();
	}
	
	//Display Net salary method
	public void displayNetSalary() {
			
		System.out.println("Director Net Salary = " + calcNetSalary());
				
	}
		

}
