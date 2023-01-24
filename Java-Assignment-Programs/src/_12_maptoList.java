import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _12_maptoList {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "H");
        map.put(2, "E");
        map.put(3, "L");
        map.put(4, "L");
        map.put(5, "O");

        List<Integer> key = new ArrayList(map.keySet());
        List<String> value = new ArrayList(map.values());

        System.out.println("Key: " + key);
        System.out.println("Value: " + value);

	}

}
