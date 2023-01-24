import java.util.*;;

public class _11_ArrayList__Array {

	public static void main(String[] args) {

		List <Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(21);
		intArrayList.add(41);
		intArrayList.add(51);
		intArrayList.add(91);
		
		System.out.println("ArrayList: "+ intArrayList);
	
		Object[] arrayListArray ;
		arrayListArray = intArrayList.toArray();
		
		System.out.println("ArrayList to Array: "+ Arrays.toString(arrayListArray));
		
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		List <Integer> arraytoList = new ArrayList<Integer>();
		
		for (int i=0;i<intArray.length;i++) {
			arraytoList.add(intArray[i]);
		}
		
		System.out.println("Array: "+Arrays.toString(intArray));
		System.out.println("Array to ArrayList: "+ arraytoList);
	}

}
