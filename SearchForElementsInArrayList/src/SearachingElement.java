import java.util.ArrayList;

public class SearachingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5,9,7,6,3,3};
		search(arr,0,3);
	    System.out.println("Elemens present in the index's: "+list);
	}
	static ArrayList<Integer> list = new ArrayList<>();
	static void search(int[]arr,int index,int target ) {
		if(index==arr.length) {
			return;
		}
		
		if(arr[index]==target) {
			list.add(index);
		}
		
		search(arr,index+1,target);
	}

}
