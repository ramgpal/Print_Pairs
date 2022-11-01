// Java program to print pairs in Array
import java.util.*;
public class Main
{
//declaration
	public static void Print_Pairs(int arr[]) {
	    for(int i=0;i<arr.length;i++) {
	        int current=arr[i]; 
	        for (int j=i+1;j<arr.length;j++) {
	            System.out.print("(" + current + "," + arr[j] + ")");
	        }
	        System.out.println();
	    }
	}
//definition
	public static void main(String[] args) {
	    int arr[]={2,4,6,8,10};
		Print_Pairs(arr);
	}
}
//to find total numbers of pairs, you can apply formula- TP=n(n-1)/2;
