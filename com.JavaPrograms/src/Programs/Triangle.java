//Find the types of triangle from their sides
package Programs;

import java.util.Scanner;

public class Triangle {
	
	static void find(int a,int b,int c){ //5 5 5
		if(a==b && a==c){
			System.out.println("Equilateral Triangle");
		}
		else if(a==b || a==c){
			System.out.println("Isosceles Triangle");
		}
		else{
			System.out.println("Scalene Triangle");
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter lengths for 3 sides of triangle"); 
		int a=in.nextInt(); 
		int b=in.nextInt(); 
		int c=in.nextInt(); 
		find(a,b,c);
		
	}

}
