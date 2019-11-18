import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author saifahmad
 *
 */
public class LearnCollections {
	
	ArrayList<Integer> arrNumList = new ArrayList<Integer>();
	ArrayList<String> arrStrList = new ArrayList<String>();
	
	LearnCollections() {
		System.out.println("Learning sessions for Java Collections\n");
	}
	
	protected void learnArrayList() {
		/* Adding numbers in arrNumList */
		for(int i = 1; i <= 10; i++) {
			int rand = (int)(Math.random() * i) + i;
			addInList(rand, -1);
		}		
		
		showListData(arrNumList);
		addInList(13, 2);
		showListData(arrNumList);
		
		delFromNumList(4);
		showListData(arrNumList);
		
		replaceNumList(2, 15);
		showListData(arrNumList);
		
		
		addInStrList("Saif", -1);
		addInStrList("Ramsha", -1);
		showStrListData(arrStrList);
		
		System.out.println(checkExists(arrStrList, "Saifi"));
		System.out.println(checkExists(arrNumList, 15));
	
		sortList();
		showListData(arrNumList);
		showStrListData(arrStrList);
	}
	
	private void sortList() { 
		Collections.sort(this.arrNumList);
		Collections.sort(this.arrStrList);
		
	}
	
	private <T> boolean checkExists(ArrayList<T> arr, T obj) {
		return arr.contains(obj);
	}
	
	private void addInStrList(String str, int pos) { 
		if(pos >= 0) {
			this.arrStrList.add(pos, str);
			
		}
		else {
			this.arrStrList.add(str);
		}
		
	}
	
	private void showStrListData(ArrayList<String> inputStr) {
		for(String str:inputStr) {
			System.out.println(str);
		}
		System.out.print("\n");
		
	}
	
	private void delFromNumList(Integer num) {
		this.arrNumList.remove(num);
	}
	
	private void showListData(ArrayList<Integer> inputList) {
		//System.out.println(inputList);
		for(Integer num:inputList) {
			System.out.print(num + ",");
		}
		System.out.print("\n");
	}
	
	
	private void addInList(Integer num, int pos) {
		if(pos >= 0) {
			this.arrNumList.add(pos, num);
		}
		else {
			this.arrNumList.add(num);
		}
	}
	
	
	private void replaceNumList(int index, Integer element) {
		this.arrNumList.set(index, element);
	}
	
	
	

}
