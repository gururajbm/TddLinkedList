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

    @Test
    public void testGet_getSecondElement_inThreeElementList() {
        getListOfGivenElement("a", "b", "c");
        Assert.assertEquals("b", list.get(1));
    }

    @Test
    public void testRemove_firstElementFromElementList_elementWasFirstElement() {
        getListOfGivenElement("a", "b");
        String result = (String) list.remove(0);
        Assert.assertEquals("a", result);
    }

    @Test
    public void testRemove_oneElement_inTwoElementList_sizeIsOne() {
        getListOfGivenElement("a", "b");
        list.remove(0);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testRemove_oneElement_inTwoElementList_secondElementIsFirstElement() {
        getListOfGivenElement("a", "b");
        list.remove(0);
        Assert.assertEquals("b", list.get(0));
    }

    @Test
    public void testRemove_oneElement_inThreeElementList_secondElementIsFirstElement() {
        getListOfGivenElement("a", "b", "c");
        list.remove(1);
        Assert.assertEquals("c", list.get(1));
    }
}