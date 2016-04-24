import static org.junit.Assert.*;

import org.junit.Test;


public class RandomizedQueueTest {

    @Test
    public void test() {
       RandomizedQueue<Integer> r = new RandomizedQueue<Integer>();
       assertEquals(0, r.size());
       assertEquals(true, r.isEmpty());
       r.enqueue(12);
       assertEquals(1, r.size());
       r.enqueue(1);
       r.enqueue(14);
       r.enqueue(13);
       r.enqueue(7);
       r.enqueue(100);
       r.enqueue(1);
       r.enqueue(14);
       r.enqueue(13);
       r.enqueue(7);
       r.enqueue(100);
       r.enqueue(1);
       r.enqueue(14);
       r.enqueue(13);
       r.enqueue(7);
       r.enqueue(100);
       r.enqueue(1);
       r.enqueue(14);
       r.enqueue(13);
       r.enqueue(7);
       r.enqueue(100);
       r.enqueue(1);
       r.enqueue(14);
       r.enqueue(13);
       r.enqueue(7);
       r.enqueue(100);
       r.enqueue(1);
       r.enqueue(14);
       r.enqueue(13);
       r.enqueue(7);
       r.enqueue(100);
       for (int i=0;i<31;i++){
           assertNotEquals(null, r.dequeue());
       }
       System.out.println(r.size());
//      assertEquals(5, r.size());
      
    }
    @Test 
    public void testTwo(){
        RandomizedQueue<Integer> r = new RandomizedQueue<Integer>();
        r.size();
        r.size();
        r.isEmpty();
        r.isEmpty();
        r.enqueue(172);
        r.enqueue(831);
        System.out.println(r.sample());
      
        assertNotEquals(null, r.dequeue());
        assertNotEquals(null, r.dequeue());

        
        
    }

}
