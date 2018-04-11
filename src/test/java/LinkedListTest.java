import LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void initialListIsEmpty() {
        LinkedList list = new LinkedList();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_addFirstElementListSizeIsOne() {
        LinkedList list = new LinkedList();
        list.add("a");
        Assert.assertEquals(1, list.size());
    }
}
