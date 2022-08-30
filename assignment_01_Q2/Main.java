/*
 * Perera A.S.A
 * IT21013096
 * Malabe
 * 1.2
 * Y2S1
 * 
 * */
 


package assignment_01_Q2;

public class Main {
	public static void main(String[] args) {
		
		//Create 6 employees objects of different types
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Manager emp4 = new Manager();
		Manager emp5 = new Manager();
		Director emp6 = new Director();
		
		
		//set some values 
		emp1.setEmpno("E01");
		emp1.setName("Normal Employee 01");
		emp1.setTelephone("0777666666");
		emp1.setBasicsalary(10000);
		emp1.setOthrs(1);
		emp1.setOtrate(1000);
		
		emp1.displayNetSalary();//display salary 
		
		emp2.setEmpno("E02");
		emp2.setName("Normal Employee 02");
		emp2.setTelephone("0777666666");
		emp2.setBasicsalary(20000);
		emp2.setOthrs(1);
		emp2.setOtrate(1000);
		
		emp2.displayNetSalary();//display salary
		
		emp3.setEmpno("E03");
		emp3.setName("Normal Employee 03");
		emp3.setTelephone("0777666666");
		emp3.setBasicsalary(30000);
		emp3.setOthrs(1);
		emp3.setOtrate(1000);
		
		emp3.displayNetSalary();//display salary
		
		emp4.setEmpno("E04");
		emp4.setName("Manager 01");
		emp4.setTelephone("0777666666");
		emp4.setBasicsalary(100000);
		emp4.setAllowances(1000);
		emp4.setDeduction(500);
		
		emp4.displayNetSalary();//display salary	
		
		emp5.setEmpno("E05");
		emp5.setName("Manager 02");
		emp5.setTelephone("0777666666");
		emp5.setBasicsalary(200000);
		emp5.setAllowances(2000);
		emp5.setDeduction(500);
		
		emp5.displayNetSalary();//display salary
		
		emp6.setEmpno("E06");
		emp6.setName("Director 02");
		emp6.setTelephone("0777666666");
		emp6.setBasicsalary(2000000);
		emp6.setAllowances(2000);
		emp6.setDeduction(500);
		emp6.setBonus(50000);
		emp6.setEntertainmentAllowance(100);
		
		emp6.displayNetSalary();//display salary
		
		
		
	}
}
