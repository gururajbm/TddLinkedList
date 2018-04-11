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

    private void getListWithOneElement(String value) {
        list.add(value);
    }

    @Test
    public void testSize_initialListIsEmpty() {
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_oneElement_sizeIsOne() {
        getListWithOneElement("a");
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testGet_oneElement() {
        getListWithOneElement("a");
        Assert.assertEquals("a", list.get(0));
    }

    @Test
    public void testSize_addSecondElement() {
        getListWithOneElement("a");
        list.add("b");
        Assert.assertEquals(2, list.size());
    }
}
