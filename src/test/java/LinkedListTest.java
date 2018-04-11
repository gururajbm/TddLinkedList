import LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void initialListIsEmpty() {
        LinkedList list = new LinkedList();
        Assert.assertEquals(0, list.size());
    }
}
