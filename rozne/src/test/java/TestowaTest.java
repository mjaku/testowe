import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by mjakubowicz on 2016-09-18.
 */
public class TestowaTest extends TestCase {

    @Test
    public void testZwrockot(){
        Testowa t = new Testowa();
        assertEquals("Kot", t.zwrockot());
    }

}