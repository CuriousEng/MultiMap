import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class TestTest {
    @Test
    public void test(){
        Map<Integer, Integer> map = new MultiMap<>(3);
        for (int i = 0; i < 7; i++) {
            map.put(i, i);
        }

        Assert.assertEquals(map.put(5, 56), (Integer)5);
        Assert.assertEquals(map.put(5, 57), (Integer)56);
        Assert.assertEquals(map.put(5, 58), (Integer)57);

        System.out.println(map);                        // Expected: {0=0, 1=1, 2=2, 3=3, 4=4, 5=56, 57, 58, 6=6}
        Assert.assertEquals((Integer)map.size(), (Integer)9);
        Assert.assertEquals(map.remove(5), (Integer)56);

        System.out.println(map);                        // Expected: {0=0, 1=1, 2=2, 3=3, 4=4, 5=57, 58, 6=6}
        Assert.assertEquals((Integer)map.size(), (Integer)8);

        System.out.println(map.keySet());               // Expected: [0, 1, 2, 3, 4, 5, 6]
        System.out.println(map.values());               // Expected: [0, 1, 2, 3, 4, 57, 58, 6]

        Assert.assertTrue(map.containsKey(5));
        Assert.assertTrue(map.containsValue(57));
        Assert.assertFalse(map.containsValue(7));
    }
}