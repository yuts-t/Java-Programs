/*How to find all pairs in array of integers whose sum is equal to given number?

eg: input - {5,6,7,4,9}, sum-13 
    o/p - {{6,7},{9,4}}*/
package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairsInArray {

	static ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
	static ArrayList<Integer> innerList=new ArrayList<Integer>();
	static void findPairsInArrayEqualsSum(int[] arr,int sum){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int temp=arr[i]+arr[j];
				if(sum==temp){
					innerList.add(arr[i]);
					innerList.add(arr[j]);
					System.out.println(arr[i]+","+arr[j]);
				}
				
			}
		}
		list.add(innerList);
		System.out.println(list);

		
	}
	public static void main(String[] args) {
		int arr[]={5,6,7,4,9};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter sum number");
		int sum=in.nextInt();
		findPairsInArrayEqualsSum(arr,sum);
	}

}
