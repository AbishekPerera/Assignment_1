/*
 * Perera A.S.A
 * IT21013096
 * Malabe
 * 1.2
 * Y2S1
 * 
 * */

package assignment_01;

public class Calculation {//Calculation Class

	public int SumOfSeries(int start, int end, int incr) {//Calculation for Sum Of Series
		int sum = 0;
		
		for(int i = start; i <= end ; i= i + incr) {
			sum= sum + i;
		}
		
		return sum;//return sum value 
	}
	public int SumOfArray(int data[], int size){//Calculation for Sum Of Array
		int sum = 0;
		
		for(int i = 0; i < size ; i++) {
			sum= sum + data[i];
		}
		
		return sum;//return sum value 
	}
	public int ProductOfSeries(int start, int end, int incr){//Calculation for Product Of Series
		int sum = 1;
		
		for(int i = start; i <= end ; i= i + incr) {
			sum = sum * i;
		}
		return sum;//return sum value 
	}
	public int ProductOfArray(int data[], int size){//Calculation for Product Of Array
		int sum = 1;
		for(int i = 0; i < size ; i++) {
			sum= sum * data[i];
		}
		return sum;//return sum value 
	}
	
	
	
}//end of the calculation
