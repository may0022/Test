package practice;
import java.util.*;
public class one {
	    public static double findMedianSortedArrays(int merge[], int o) {
	        Arrays.sort(merge);
	        
	        if(o % 2 !=0) 
	            return (double)merge[o/2];
	        return (double)(merge[(o-1)/2] + merge[o/2])/2.0;
	    }
	    
	    public static void main(String args[]){
	      
	        
	        int m, n;
	        Scanner user = new Scanner(System.in);
	        System.out.println("What is the size of the first array?");
	        m = user.nextInt();
	        
	        int[] nums1 = new int[m];
	        
	        System.out.println("Enter numbers: ");
	        for(int i = 0; i < m; i++){
	            nums1[i] = user.nextInt();
	        }
	       
	        System.out.println("What is the size of the second array?");
	        n = user.nextInt();
	        
	        int[] nums2 = new int[n];
	        
	        System.out.println("Enter numbers: ");
	        for(int i = 0; i < n; i++){
	            nums2[i] = user.nextInt();
	        }
	        
	        
	        int o = m + n;
	        
	        int [] merge = new int [o]; 
	        
	        
	        for (int i = 0; i < m; i = i +1){
	            merge[i] = nums1[i];
	        }
	        for (int i = 0; i < n; i = i +1){
	            merge[m+i] = nums2[i];
	        } 
	       
	        for (int i = 0; i < o; i = i +1){
	          System.out.print(merge[i] + ", ");
	        }
	        System.out.println("median is " + findMedianSortedArrays(merge, o));
	    }
	}