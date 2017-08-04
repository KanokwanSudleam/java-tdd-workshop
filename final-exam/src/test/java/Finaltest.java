/**
 * Created by kanokwan.sud on 8/4/2017.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Finaltest {
    /**
     * Created by kanokwan.sud on 8/4/2017.
     */

        @Test
        public void should_return_is_8() {
            long Number = new Exam().getNumber(8);
            assertEquals(8,Number );

        }

    @Test
    public void should_return_is_9() {
        long Number = new Exam().getNumber(10);
        assertEquals(9,Number );

    }
    @Test
    public void should_return_is_20() {
        long Number = new Exam().getNumber(20);
        assertEquals(19,Number );

    }
    @Test
    public void should_return_is_129() {
        long Number = new Exam().getNumber(132);
        assertEquals(129,Number );

    }

    @Test
    public void should_return_is_1111() {
        long Number = new Exam().getNumber(11111111111L);
        assertEquals(129,Number );

    }





}
