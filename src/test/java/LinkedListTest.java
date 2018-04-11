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

    private void getListOfGivenElement(String... elements) {
        for (String s : elements) {
            list.add(s);
        }
    }

    @Test
    public void testSize_initialListIsEmpty() {
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_oneElement_sizeIsOne() {
        getListOfGivenElement("a");
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testGet_oneElement() {
        getListOfGivenElement("a");
        Assert.assertEquals("a", list.get(0));
    }

    @Test
    public void testSize_addSecondElement() {
        getListOfGivenElement("a", "b");
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testGet_getFirstElement_inTwoElementList() {
        getListOfGivenElement("a", "b");
        Assert.assertEquals("a", list.get(0));
    }

    @Test
    public void testGet_getSecondElement_inTwoElementList() {
        getListOfGivenElement("a", "b");
        Assert.assertEquals("b", list.get(1));
    }
}