/*
 * Perera A.S.A
 * IT21013096
 * Malabe
 * 1.2
 * Y2S1
 * 
 * */

package assignment_01;

public class Conversion {//Conversion Class

	public double KMToMiles(double distance) { //Calculation and returning answer
		
		return distance * 0.6214;
		
	}
	
	public double MilesToKM(double distance){//Calculation and returning answer
		
		return distance * 1.60;
	}
	
	public double FeetToMetres(double distance){//Calculation and returning answer
		
		return distance / 3.2808; 
	}
	
	public double MetresToFeet(double distance){//Calculation and returning answer
		
		return distance * 3.2808;
		
	}
	
	public double KgToPounds(double weight){//Calculation and returning answer
		
		return weight * 2.204;
		
	}
	
	public double PoundsToKg(double weight){//Calculation and returning answer
		
		return weight / 2.204;
		
	}
	
	public double CelciusToFahrenheit(double temperature){//Calculation and returning answer
		
		return ((9.0/5.0)*temperature) +32;
		
	}
	
	public double FahrenheightToCelcius(double temperature){//Calculation and returning answer
		
		return (5.0/9.0)*(temperature - 32);
		
	}
	
}
