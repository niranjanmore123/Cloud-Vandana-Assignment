
// 1.	Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.


import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7};
		
		Random rObj=new Random();
		
		for(int i=0;i<array.length;i++) {
			
			int rValue=rObj.nextInt(array.length);
			int currentValue=array[rValue];
			array[rValue]=array[i];
			array[i]=currentValue;
		}
		System.out.println(Arrays.toString(array));

	}

}
