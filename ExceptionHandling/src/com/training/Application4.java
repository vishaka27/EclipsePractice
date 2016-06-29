package com.training;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Book b1 = new Book(101,"Java",450.00);
			Book b2= new Book(101,"Java",450.00);
			System.out.println(b1.equals(b2));
			Book b3 = b2;     //we are overriding the object so in this case we will get true
			System.out.println(b3.equals(b2));
			Book b4 = null;
			System.out.println(b1.equals(b4));    //to check if the method is cautious.. SO it will return false instead of an exception
			String name = new String("ramesh");
			System.out.println(b1.equals(name));    //returns false since they belong to 2 different classes
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
