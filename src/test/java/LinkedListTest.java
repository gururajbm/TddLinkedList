import LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList list;

    @Before
    public void setUp() {
        list = new LinkedList<String>();
    }

    @Test
    public void testSize_initialListIsEmpty() {
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_oneElement_sizeIsOne() {
        list.add("a");
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testGet_oneElement() {
        list.add("a");
        Assert.assertEquals("a", list.get(0));
    }
}
