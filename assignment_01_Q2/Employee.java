/*
 * Perera A.S.A
 * IT21013096
 * Malabe
 * 1.2
 * Y2S1
 * 
 * */

package assignment_01_Q2;

public class Employee {
	//declare attributes  
	private String  Empno;
	private String name;
	private String telephone;
	private double basicsalary;
	private double othrs; 
	private double otrate;
	
	//default constructor 
	public Employee(){
		this.Empno = "";
		this.name = "";
		this.telephone = "";
		this.basicsalary = 0;
		this.othrs = 0;
		this.otrate = 0;
	}
	
	//Parameterized constructor
	public Employee(String Empno,String name,String telephone,double basicsalary, double othrs,double otrate) {
		this.Empno = Empno;
		this.name = name;
		this.telephone = telephone;
		this.basicsalary = basicsalary;
		this.othrs = othrs;
		this.otrate = otrate;
	}
	
	//setters and getters
	
	public void setEmpno(String  Empno){
		this.Empno = Empno;

	}
	public void setName(String name){
		this.name = name;

	}
	public void setTelephone(String telephone){
		this.telephone = telephone;

	}
	public void setBasicsalary(double basicsalary){
		this.basicsalary = basicsalary;

	}
	public void setOthrs(double othrs){
		this.othrs = othrs;

	}
	public void setOtrate(double otrate){
		this.otrate = otrate;

	}
	
	public String  getEmpno(){
		return Empno;
	}
	public String getName(){
		return name;
	}
	public String getTelephone(){
		return telephone;
	}
	public double getBasicsalary(){
		return basicsalary;
	}
	public double getOthrs(){
		return othrs;
	}
	public double getOtrate(){
		return otrate;
	}
	
	
	
	//declare methods
	
	//Salary Calculation method
	public double calcNetSalary() {
		
		return basicsalary + (othrs * otrate);
	}
	
	//Display Net salary method
	public void displayNetSalary() {
		
		System.out.println("Employee Net Salary = " + calcNetSalary());
		
	}
	
}//end of the class Employee
