package Project40;

import java.util.Arrays;

public class Exponential_search_algorithm_p34 {
	public static  void main(String[] args){

	    int[] arr = {2,4,6,8,10};
	    int length= arr.length;
	    int value = 10;
	    int a = exponentialSearch(arr,length,value);

	    if(a<0){

	       System.out.println( "-- invalid element-- ");

	    }else {

	        System.out.println( "element is  present in the array at index :"+a);
	    }

	        }

	        public static int exponentialSearch(int[] arr ,int length, int value ){

	        if(arr[0]==value){
	            return 0;
	            }
	        int i=1;
	        while(i<length && arr[i]<=value){

	            i=i*2;
	        }
	        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
	        }


	}
