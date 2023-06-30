package st.ny.collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Challenge {
	// @Test
	public void swap() {

		int a = 5;
		int b = 10;

		a = a + b; // 15
		b = a - b;// 10
		a = b - a; // 5

	}

//	@Test
	public void mergeArrays() {

		Integer[] a = { 10, 17, 20, 56 };							//I am declaring  2 arrays with given values
		Integer[] b = { 12, 54, 2, 6, 799 };

		List<Integer> candy = new ArrayList<>(Arrays.asList(a));	//Passing the 1st array as list		//Passing the 1st array storing into arrayList obj.
		candy.addAll(Arrays.asList(b));								//adding 2nd array into the arraylist obj using addAll method

	//	Object[] flavor = candy.toArray();
		System.out.println(Arrays.toString(candy.toArray()));

	}
	
	@Test
	public void mergeArrays1() {
		Integer[] a= {12,44,56};
		Integer[] b= {13,4,68,8};
		
		List<Integer> obj=  new ArrayList<>(Arrays.asList(a));
		obj.addAll(Arrays.asList(b));
		
		Object [] c = obj.toArray();
		
		System.out.println(Arrays.toString(c));
	}
	
	
	
	
	
}