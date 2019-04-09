package google18;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {10, 5, 2, 7, 8, 7};
		int num = 4;
		
		compute(array , num);

	}

	private static void compute(int[] array, int num) {
		
		int count = 0;
		
		while(count < array.length-num+1 ) {
			
			int[] subArray = new int[num];
			
			for(int x = 0; x < num; x++) 
				subArray[x] = array[x+count];
			
			Arrays.sort(subArray);
			System.out.println(subArray[subArray.length-1]);
						
			count++;
		}						
	}

}
