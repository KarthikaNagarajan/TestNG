package Listeners;

import java.io.FileReader;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//When a program runs, unexpected events may occur—like dividing by zero or accessing a file that doesn’t exist.
		//These events cause exceptions.//

		//Exception Handling lets your program continue running instead of crashing.
		try {
		    int arr[] = new int[3];
		    arr[5] = 10; // causes ArrayIndexOutOfBoundsException
		} 
		catch (ArithmeticException e) {
		    System.out.println("Arithmetic error");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Array index error");
		}
		catch (Exception e) {  // parent class
		    System.out.println("Some other error");
		}
		
		try (FileReader fr = new FileReader("data.txt")) {
		    int c = fr.read();
		    System.out.println(c);
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		}
		
		try {
		    int a = Integer.parseInt("abc"); // NumberFormatException
		}
		catch (Exception e) {
		    System.out.println("Error "+e.getMessage());
		}
		finally {
		    System.out.println("Always executed");

	}
	}
}
