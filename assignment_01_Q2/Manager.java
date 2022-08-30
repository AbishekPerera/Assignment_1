/*
 * Perera A.S.A
 * IT21013096
 * Malabe
 * 1.2
 * Y2S1
 * 
 * */

package assignment_01_Q2;

public class Manager extends Employee{//Manager Inherit from Employee calss
	//declare attributes 
	private double allowances;
	private double deduction;
	
	//default constructor
	public Manager() {
		this.allowances = 0;
		this.deduction = 0;
	}
	
	//Parameterized constructor
	public Manager(double allowances, double deduction) {
		this.allowances = allowances;
		this.deduction = deduction;
	}
	
	//setters and getters 
	
	public void setAllowances(double allowances){
		this.allowances = allowances;

	}
	public void setDeduction(double deduction){
		this.deduction = deduction;
	
	}
	
	public double getAllowances(){
		return allowances;

	}
	public double getDeduction(){
		return deduction;	
	}
	
	//declare methods
	
	//Salary Calculation method
	public double calcNetSalary() {
		
		return getBasicsalary() + getAllowances() - getDeduction();
	}
	
	//Display Net salary method
	public void displayNetSalary() {
		
		System.out.println("Manager Net Salary = " + calcNetSalary());
			
		}
	
	
}
