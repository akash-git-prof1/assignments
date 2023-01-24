import java.util.ArrayList;
import java.util.List;

public class _10_addLists {

	public static void main(String[] args) {
		

		        List<Integer> list1 = new ArrayList<Integer>();
		        list1.add(1);
		        list1.add(2);
		        List<Integer> list2 = new ArrayList<Integer>();
		        list2.add(3);
		        list1.add(4);
		        List<Integer> final1 = new ArrayList<Integer>();

		        final1.addAll(list1);
		        final1.addAll(list2);

		        
		        System.out.println("final: " + final1);

		    

	}

}
