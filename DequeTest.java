import static org.junit.Assert.*;

import org.junit.Test;


public class DequeTest {

    @SuppressWarnings("rawtypes")
    @Test
    public void test() {
        Deque d = new Deque();
        assertEquals(true, d.isEmpty());
        assertEquals(0, d.size());
    }
    @Test 
    public void testAddingStuff(){
        Deque<String> d = new Deque<String>();
        d.addFirst("yo");
        d.addFirst("what");
        d.addFirst("is");
        d.addFirst("up");
        assertEquals(4, d.size());
        assertEquals(false, d.isEmpty());
        assertEquals("yo", d.removeLast());
        assertEquals(3, d.size());
        assertEquals("up", d.removeFirst());
        assertEquals(2, d.size());
        assertEquals("is", d.removeFirst());
        assertEquals(1, d.size());
        assertEquals(false, d.isEmpty());
        assertEquals("what", d.removeLast());
        assertEquals(0, d.size());
        assertEquals(true, d.isEmpty());
    }
    @Test
    public void testAddingStuffAtEnd(){
        Deque<String> d = new Deque<String>();
        d.addLast("yo");
        assertEquals("yo", d.removeLast());
        assertEquals(0, d.size());
        d.addLast("yo");
        d.addLast("what");
        d.addLast("is");
        d.addLast("up");
        assertEquals("up", d.removeLast());
        assertEquals(3, d.size());
        assertEquals("is", d.removeLast());
        assertEquals(2, d.size());
        assertEquals("what", d.removeLast());
        assertEquals(1, d.size());
        assertEquals("yo", d.removeFirst());
        assertEquals(0, d.size());
    }
    @Test 
    public void moreTests(){
        Deque<String> d = new Deque<String>();
        d.addFirst("yo");
        assertEquals("yo", d.removeLast());
        assertEquals(true, d.isEmpty());
        d.addLast("yo");
        assertEquals(false, d.isEmpty());
        assertEquals("yo", d.removeFirst());
        assertEquals(true, d.isEmpty());
        d.addFirst("yo");
        d.addLast("?");
        d.addFirst("what is up");
        d.addLast("!");
        assertEquals(false, d.isEmpty());
        assertEquals(4, d.size());
        assertEquals("!", d.removeLast());
        assertEquals("what is up", d.removeFirst());
        assertEquals("?", d.removeLast());
        assertEquals(false, d.isEmpty());
        assertEquals("yo", d.removeFirst());
        assertEquals(true, d.isEmpty());
    }
    @Test
    public void testOrder(){
        Deque<Integer> d = new Deque<Integer>();
        d.addFirst(1);
        d.addFirst(2);
        assertEquals((Integer) 2, d.removeFirst());
        assertEquals((Integer) 1, d.removeFirst());
    }

}
