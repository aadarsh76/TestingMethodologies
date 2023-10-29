package trio;
import java.util.*;


public class Strr {

	
		public static void main(String args[]) {
		try {
			int arr[]=new int[5];
			int b=30/0;
			System.out.println(arr[10]);
			}
		catch(Exception e){
			System.out.println("error");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("task1 is completed");
			} 
	}
}
