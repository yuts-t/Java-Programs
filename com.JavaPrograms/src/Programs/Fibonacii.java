//Write a program to print Fibonacci series using recursion and without recursion
package Programs;

public class Fibonacii {

	static void printFibonacii(int n){ // 7
		int n1=1, n2=1, n3;
		System.out.println(n1); //n1=1
		System.out.println(n2);//n2=1
		for(int i=2;i<n;i++){ //i=2;2<7 ;i=3 ;3<7 ;i=7 ;
			n3=n1+n2; //n3=1+1=2 //n3=1+2=3
			System.out.println(n3);//2 //3
			n1=n2; //n1=1 //n1=2;
			n2=n3; //n2=2 //n2=3
		}
	}
	
	static void printFibonaciiUsingRecursion(int n){ //8
		System.out.println("Using recursion");
		for(int i=1;i<=n;i++){ //i=2 //i=3
			System.out.println(getFibonaciiUsingRecursion(i));
		}
		
	}
	static int getFibonaciiUsingRecursion(int i){//1 //2 //3
		if (i==1){
			return 1;
		}
		if(i==2){
			return 1;
		}
		
		return getFibonaciiUsingRecursion(i-1) + getFibonaciiUsingRecursion(i-2); //2  //1 //(n-1)+(n-2)
	}
	public static void main(String[] args) {
		int n=8;
		//printFibonacii(n);
		printFibonaciiUsingRecursion(n);
		
		
	}

}
