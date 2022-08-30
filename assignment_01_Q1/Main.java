/*
 * Perera A.S.A
 * IT21013096
 * Malabe
 * 1.2
 * Y2S1
 * 
 * */

package assignment_01;

import java.util.Scanner;//import scanner class

public class Main {
public static void main(String[] args) {
		//declare variables
		int uInput=0;
		int select=0;
		int start;
		int end;
		int incr;
		int size=0;
		int data[];
		data = new int[100];
		double distance;
		double temperature;
		double weight;
		
		
		Scanner myScan = new Scanner(System.in);// Create a Scanner object
		
		Menu Menu_1 = new Menu();// Create a Menu object
		Calculation Cal_1 = new Calculation();// Create a Calculation object
		Conversion Con_1 = new Conversion();// Create a Conversion object
		
		Menu_1.displayMainMenu();
		uInput = myScan.nextInt();//get user input
		
		while(uInput > 0 ) {//main menu while loop starts
			
			select = uInput;
			
			switch (select) {//main menu options 
			case 1:
				
				Menu_1.displayCalculationSubMenu();//display menu
				uInput = myScan.nextInt();//get user input
					while(uInput > 0) {//sub menu menu while loop starts
						switch (uInput) {//sub menu options 
						case 1:
							System.out.print("Input start : ");
							 start = myScan.nextInt();
							
							System.out.print("\n" + "Input end : ");
							 end = myScan.nextInt();
							
							System.out.print("\n" + "Input incr : ");
							 incr = myScan.nextInt();
							
							System.out.print("\n" + "Sum of the Series : " + Cal_1.SumOfSeries(start, end, incr)+ "\n");
							
							break;
							
						case 2:
							System.out.print("Input size of array : ");
							size  = myScan.nextInt();
							
							for(int i=0 ; i < size; i++) {
								System.out.print("Input elements : ");
								data[i]  = myScan.nextInt();
							}
							
							System.out.print("\n" + "Sum of the array : " + Cal_1.SumOfArray(data, size)+ "\n");
							break;
							
						case 3:
							System.out.print("Input start : ");
							 start = myScan.nextInt();
							
							System.out.print("\n" + "Input end : ");
							 end = myScan.nextInt();
							
							System.out.print("\n" + "Input incr : ");
							 incr = myScan.nextInt();
							
							System.out.print("\n" + "Sum of the Series : " + Cal_1.ProductOfSeries(start, end, incr)+ "\n");
							
							break;
							
						case 4:
							System.out.print("Input size of array : ");
							size  = myScan.nextInt();
							
							for(int i=0 ; i < size; i++) {
								System.out.print("Input elements : ");
								data[i]  = myScan.nextInt();
							}
							
							System.out.print("\n" + "Sum of the array : " + Cal_1.ProductOfArray(data, size)+ "\n");
							break;

						default:
							System.out.println("Invalid Input");
							uInput = 0;
							break;
						}
						
						Menu_1.displayCalculationSubMenu();//display menu
						uInput = myScan.nextInt();//get user input
						
					}
				
				
				break;
				
			case 2:
				
				Menu_1.displayConversionSubMenu();//display menu
				uInput = myScan.nextInt();//get user input
				
				while(uInput > 0) {//sub menu while loop starts
					
					switch (uInput) {
					case 1:
						Menu_1.displayConversionLengthSubmenu();//display menu
						uInput = myScan.nextInt();//get user input
							
							while(uInput > 0) {//sub menu while loop starts
								switch (uInput) {
									case 1:
										System.out.print("Input Km : ");
										distance = myScan.nextDouble();//get user input
										
										
										System.out.print("\n" + "Distance(Miles) : " +Con_1.KMToMiles(distance) + "\n");

										break;
									
									case 2:
										System.out.print("Input Miles : ");
										distance = myScan.nextDouble();//get user input
										
										
										System.out.print("\n" + "Distance(Km) : " +Con_1.MilesToKM(distance) + "\n");

										break;
									
									case 3:
										System.out.print("Input Feets : ");
										distance = myScan.nextDouble();//get user input
										
										
										System.out.print("\n" + "Distance(Metres) : " +Con_1.FeetToMetres(distance) + "\n");

										break;
									
									case 4:
										System.out.print("Input Metres : ");
										distance = myScan.nextDouble();//get user input
										
										
										System.out.print("\n" + "Distance(Feet) : " +Con_1.MetresToFeet(distance) + "\n");

										break;

									default:
										System.out.println("Invalid Input");
										break;
								}
								
								Menu_1.displayConversionLengthSubmenu();//display menu
								uInput = myScan.nextInt();//get user input
							}//sub menu while loop ends
						
						break;
					case 2:
						Menu_1.displayConversionTemperatureSubmenu();//display menu
						uInput = myScan.nextInt();//get user input
							
							while(uInput > 0) {//sub menu while loop starts
								
								switch (uInput) {
								case 1:
									System.out.print("Input celsius  : ");
									temperature = myScan.nextDouble();//get user input
									
									
									System.out.print("\n" + "temperature(F) : " +Con_1.CelciusToFahrenheit(temperature) + "\n");

									break;
								case 2:
									System.out.print("Input Fahrenheit  : ");
									temperature = myScan.nextDouble();//get user input
									
									
									System.out.print("\n" + "temperature(C) : " +Con_1.FahrenheightToCelcius(temperature) + "\n");
									break;
									

								default:
									System.out.println("Invalid Input");
									break;
								}
								Menu_1.displayConversionTemperatureSubmenu();//display menu
								uInput = myScan.nextInt();//get user input
							}
						
						break;
					case 3:
						Menu_1.displayConversionWeightSubmenu();//display menu
						uInput = myScan.nextInt();//get user input
						while(uInput > 0) {//sub menu while loop starts
							
							switch (uInput) {
							case 1:
								System.out.print("Input Kg  : ");
								weight = myScan.nextDouble();//get user input
								
								
								System.out.print("\n" + "weight(Kg) : " +Con_1.KgToPounds(weight) + "\n");

								break;
							case 2:
								System.out.print("Input Pound  : ");
								weight = myScan.nextDouble();//get user input
								
								
								System.out.print("\n" + "weight(Kg) : " +Con_1.PoundsToKg(weight) + "\n");
								break;
								

							default:
								System.out.println("Invalid Input");
								break;
							}
							Menu_1.displayConversionWeightSubmenu();//display menu
							uInput = myScan.nextInt();//get user input
						}
						break;

					default:
						System.out.println("Invalid Input");
						break;
					}
					Menu_1.displayConversionSubMenu();//display menu
					uInput = myScan.nextInt();//get user input
					
				}
				
				
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
			
			Menu_1.displayMainMenu();//display menu
			uInput = myScan.nextInt();//get user input
			
		}//main menu while loop ends
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		myScan.close();//close scanner
		
	}//main program ends

}//main class ends
