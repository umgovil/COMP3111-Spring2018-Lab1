package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static void main(String args[]) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum+=arr[i];
		}
		
		int minVal=arr[0];
		for(int i=1;i<arr.length;i++){ 
		      if(arr[i] < minVal){ 
		    	  	minVal = arr[i]; 
		      } 
		}
		
		int maxVal=arr[0];
		for(int i=1;i<arr.length;i++){ 
		      if(arr[i] > maxVal){ 
		    	  	maxVal = arr[i]; 
		      } 
		}
		
		
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("Min = " + minVal);
		System.out.println("Max = " + maxVal);
	}

}
