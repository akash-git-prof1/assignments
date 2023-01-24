import java.util.*;

public class _6_addArrays {
	public static void main(String[] args) {

		int arr1[] = {1,2,3,4};
		int arr2[] = {5,6,7,8};
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		int size3 = size1+size2;
		int arr3[] = new int[size3];
		
		for(int i = 0; i < size1; i++)
		{
			arr3[i] = arr1[i]; 
		}
		for(int i = 0; i < size2; i++)
		{
			arr3[size1 + i] = arr2[i]; 
		}
		System.out.println("Final Array:");
		for(int j: arr3)
			System.out.print(j + " ");

	}
}
