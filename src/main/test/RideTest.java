import com.contigo.util.RideHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by nithin on 7/17/2016.
 */
public class RideTest {

    @Test
    public void testRide() {
        String rideName = RideHelper.getRuideName();
        assertTrue(rideName.equals("commerce"));
    }

    @Test
    public void testAddition() {
      /*  int res = RideHelper.add(1, 2);

        assertEquals(res, -1);
        assertNotEquals(res, -1);*/
    }
}
