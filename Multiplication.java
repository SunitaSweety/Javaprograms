package Arrayutil;

import java.util.Arrays;

public class Multiplication {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{3,4,5},
				{4,3,4}
		};
		// calling the method
		inputArray(arr);

	}
	//method 
    static void inputArray(int[][] arr) {
    	for(int i =  0;i<arr.length ;i++) {
    		for(int j = 0; j<arr.length ;j++) {
    			for(int k = 0; k<arr.length ;k++) {
                        arr[i][j] = arr[i][k]*arr[k][j];
    			}
    		}
    		System.out.println(Arrays.deepToString(arr));
    	}
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
  	
    


