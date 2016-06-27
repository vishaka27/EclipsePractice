package com.training.domains;

import java.util.Scanner;

//import com.training.ifaces.Automobile;

public class Application {
	
 public static void main(String[] args) {
	 
	String ch="Y";
	
	 Scanner sc= new Scanner(System.in);
	 do{
	System.out.println("Enter 1 for Maruti and 2 for Toyota and 3 for Bike");
	int key = sc.nextInt();
	ShowRoom obj = new NewShowRoom();
	 obj.getModel(key);   // you can also use:                     Automobile polyAuto = obj.getModel();
	
		
	obj.printQuote(obj.getModel(key));  
	 System.out.println("Y for yes and N for no.");
	 ch= sc.next();
	 }while(ch.equalsIgnoreCase("Y"));  //IgnoreCase is to make it case insensitive so it can accept both y and Y
	sc.close();
	
}

}
