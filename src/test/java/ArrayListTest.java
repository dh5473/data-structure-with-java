import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import list.ArrayList;

public class ArrayListTest {
    @Test
    public void testAppend() {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(5);
        assertEquals(1, list.length());
        assertEquals(Integer.valueOf(5), list.getValue(0));
        list.append(3);
        assertEquals(Integer.valueOf(5), list.getValue(0));
        assertEquals(Integer.valueOf(3), list.getValue(1));
    }

    @Test
    public void testInsert() {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(5);
        assertEquals(1, list.length());
        assertEquals(Integer.valueOf(5), list.getValue(0));
        list.insert(0, 1);
        assertEquals(Integer.valueOf(1), list.getValue(0));
        list.insert(1, 2);
        assertEquals(Integer.valueOf(2), list.getValue(1));
        assertEquals(Integer.valueOf(5), list.getValue(2));
        assertEquals(3, list.length());
    }

    @Test
    public void testUpdate() {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(5);
        assertEquals(1, list.length());
        assertEquals(Integer.valueOf(5), list.getValue(0));
        list.update(0, 3);
        assertEquals(Integer.valueOf(3), list.getValue(0));
        assertEquals(1, list.length());
    }

    @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(5);
        list.append(10);
        list.remove(0);
        assertEquals(1, list.length());
        assertEquals(Integer.valueOf(10), list.getValue(0));
    }

    @Test
    public void testGetValue() {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(5);
        assertEquals(5, list.getValue(0));
    }

    @Test
    public void testClear() {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(5);
        assertEquals(1, list.length());
        assertEquals(Integer.valueOf(5), list.getValue(0));
        list.append(3);
        assertEquals(Integer.valueOf(5), list.getValue(0));
        assertEquals(Integer.valueOf(3), list.getValue(1));
        list.clear();
        assertEquals(0, list.length());
    }
}
