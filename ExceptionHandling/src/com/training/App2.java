package com.training;
/**
 * 
 * @author vnaga1
 *
 */
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=45;
		int den=0;
	
		
		try {
			int den1= Integer.parseInt(args[0]);
			
			//System.out.println(num/den);
			System.out.println(num/den1);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Exception - denominator is 0");
		}
catch(ArrayIndexOutOfBoundsException e){
	System.err.println("Pass command line argument");
}
		catch(Exception e){
			
			System.out.println("invalid command line argument");
		}
	}

}
