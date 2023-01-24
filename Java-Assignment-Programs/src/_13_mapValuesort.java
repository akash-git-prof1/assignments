import java.util.*;
import java.util.Map.Entry;

public class _13_mapValuesort {

	public static void main(String[] args) {
		
	        HashMap<String, String> map = new HashMap<>();
	        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
	        ArrayList<String> list = new ArrayList<>();
	        map.put("1", "B");
	        map.put("2", "A");
	        map.put("3", "D");
	        map.put("4", "F");
	        map.put("5", "W");
	        map.put("6", "J");
	        map.put("7", "Z");
	        for (Map.Entry<String, String> entry : map.entrySet()) {
	            list.add(entry.getValue());
	        }
	        Collections.sort(list, new Comparator<String>() {
	            public int compare(String str, String str1) {
	                return (str).compareTo(str1);
	            }
	        });
	        for (String str : list) {
	            for (Entry<String, String> entry : map.entrySet()) {
	                if (entry.getValue().equals(str)) {
	                    sortedMap.put(entry.getKey(), str);
	                }
	            }
	        }
	        System.out.println(sortedMap);
	    }

	

}
