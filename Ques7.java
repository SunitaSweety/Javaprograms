package Arrayutil;

public class Ques7 {
	public static int[] merge(int[] arr1,int[] arr2) {
			int leng1 = arr1.length;
			int leng2 = arr2.length;
			int[] result = new int[leng1+leng2];
			int i = 0;
			int j = leng2-1;
			int k = 0;
			while(i<leng1 && j>=0) {
				if(arr1[i]<arr2[j]) {             
					result[k]=arr1[i];                
					i++;
				}
				else {
					result[k]=arr2[j];
				    j--;
				}
				k++;
			}
			while(i<leng1) {
				result[k]=arr1[i];
			    i++;
			    k++;
			}
		    while(j>=0) {
		    	result[k]=arr2[j];
		        j--;
		        k++;
		    }
			return result;
		}
		    public static void main(String[] args) {
			int[] arr1 = {1,3,5,7,9};
			int[] arr2 = {9,8,6,4,2,1,1};
			
			int[] result = merge(arr1,arr2);
			for(int k=0;k<result.length;k++) {
				System.out.print(result[k] + " ");
			}
	   }
	}


