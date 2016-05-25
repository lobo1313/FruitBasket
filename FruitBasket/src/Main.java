

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> basket = new HashMap<String, Integer>() {{put("Bananas", 10); put("Oranges", 20); put("Apples", 30);  put("Lemons", 40); put("Peaches", 40);}};
		System.out.println("Total cost of fruit = " + basket.values().stream().mapToInt(i -> i).sum());

	}
}
