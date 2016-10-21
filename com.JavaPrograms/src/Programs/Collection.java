/*Write a java program that takes the below input and gives below output?
input - {"apple","ball","boy","cat","dog","duck"}
output- {{"apple"},{"ball","duck"},{"boy","cat","duck"}}*/
package Programs;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	ArrayList<ArrayList<String>> totalList=new ArrayList<ArrayList<String>>();
	public void sortBasic(String[] s){
		List<String> innerList1=new ArrayList<>();
		List<String> innerList2=new ArrayList<>();
		List<String> innerList3=new ArrayList<>();
		for(int i=0;i<s.length;i++){
			int length=s[i].length();
			if(length==5){
				innerList1.add(s[i]);
			}
			else if(length==4){
				innerList2.add(s[i]);
			}
			else if(length==3){
				innerList3.add(s[i]);
			}
		}
		totalList.add((ArrayList<String>) innerList1);
		totalList.add((ArrayList<String>) innerList2);
		totalList.add((ArrayList<String>) innerList3);
		System.out.println(totalList);


	}
	public void sort(String[] s){
		for(int i=0;i<s.length;i++){
			boolean isListPresent = false;
			for(int j=0;j<totalList.size();j++){ 
				if(totalList.get(j).get(0).length() == s[i].length()){
					totalList.get(j).add(s[i]);
					isListPresent=true;
				}
			}
			if(isListPresent==false){
				ArrayList<String> innerList=new ArrayList<>();
				innerList.add(s[i]);
				totalList.add(innerList);
			}
		}
		System.out.println(totalList);
	}
	public static void main(String[] args) {
		String[] s={"apple","ball","boy","cat","dog","duck"};
		Collection c=new Collection();
		c.sort(s);
	}

}
