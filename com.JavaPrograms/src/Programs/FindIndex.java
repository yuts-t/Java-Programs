//Find the index of numbers greater than n in a given sorted array..                         

package Programs;

import java.util.Scanner;

public class FindIndex {
	
	static void find(int[] arr,int a){ 
		int index=-1;
		for(int i=0;i<arr.length;i++){ 
			if(a<arr[i]){ 
				index=i;
				break;
			}
		}
		
		if(index!=-1){ 
		for(int j=index; j<arr.length;j++){ 
			System.out.println("Index greater than " +a+ " is " +j);
		}
		}
		else{
			System.out.println(a +" is greater than all numbers");
		}
	}
	public static void main(String[] args) {
		int[] arr={2,7,9,10,12};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		int a=in.nextInt(); 
		find(arr,a);
	}

}
