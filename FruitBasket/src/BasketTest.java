import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class BasketTest {

	@Test
	public void test() {
		Map<String, Integer> basket = new HashMap<String, Integer>() {{put("Bananas", 10); put("Oranges", 20); put("Apples", 30);  put("Lemons", 40); put("Peaches", 40);}};

        assertTrue(!basket.isEmpty());
        assertTrue(basket.containsKey("Bananas"));
        assertFalse(basket.containsKey("Plums"));
        assertEquals(5, basket.size());        
        assertNotNull(basket.toString());

	}

}
