package striver_sorting_techniques;

public class BubbleSort {
	
	    public static void bubbleSort(int[] arr, int n) {
	       
	       for(int i=0;i<n-1;i++){
	           for(int j=1;j<n-i;j++){
	               if(arr[j]<arr[j-1]){
	                   int temp=arr[j];
	                   arr[j]=arr[j-1];
	                   arr[j-1]=temp;
	               }
	           }
	       }
	    }
	    public static void main(String[] args){
	        int[] arr = {30,
	        		48 ,196 ,294, 91, 31 ,577, 702 ,503,217 ,168, 409, 233, 
	        		23 ,152 ,578 ,399, 863, 25, 489, 718, 454 ,798 ,164 ,182,
	        		498 ,731, 271, 899, 936 ,897 };
	        
	        int n = arr.length;
	        bubbleSort(arr,n);
	        for(int i:arr){
	            System.out.print(i+" ");
	        }
	    }

	}

