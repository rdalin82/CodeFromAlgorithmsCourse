import java.util.Iterator;
import edu.princeton.cs.algs4.StdRandom;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private int size; 
    private Item[] randomArray;
    
    @SuppressWarnings("unchecked")
    public RandomizedQueue(){
        this.size = 0;
        this.randomArray = (Item[]) new Object[1];
    }
    public boolean isEmpty(){
        boolean empty=false;
        if (size <= 0){ empty=true; }
        return empty;
    }
    
    public int size(){ 
        return size;
    }
    
    public void enqueue(Item item){
        if (item==null){ throw new NullPointerException(); }
        if (randomArray.length  == size) {
            resize(randomArray.length*2);
        }
        randomArray[size] = item;
        size++;
    }
    public Item dequeue(){
        if (isEmpty()){ throw new NoSuchElementException(); } 
        int randomNumber = StdRandom.uniform(size);
        Item item = randomArray[randomNumber];
        randomArray[randomNumber] = randomArray[size-1];
        randomArray[size-1] = null;
        size--;
        if (size >0 && size == (randomArray.length/4)){
            resizeDown(randomArray.length/2);
        }
        return item;
    }
    public Item sample(){
        if (isEmpty()){ throw new NoSuchElementException(); } 
        Item item=randomArray[StdRandom.uniform(size)];
        return item;
    }
    public Iterator<Item> iterator(){
        return new RandomArrayIterator<Item>();
    }
    @SuppressWarnings("unchecked")
    private void resize(int capacity){
        Item[] newrandomArray = (Item[]) new Object[capacity];
        for(int i=0; i < size; i++){
            newrandomArray[i]=randomArray[i];
        }
        this.randomArray = newrandomArray;
    }
    @SuppressWarnings("unchecked")
    private void resizeDown(int capacity){
        Item[] newrandomArray = (Item[]) new Object[capacity];
        for(int i=0; i < size; i++){
            newrandomArray[i]=randomArray[i];
        }
        this.randomArray = newrandomArray;
    }
    
    @SuppressWarnings("hiding")
    private class RandomArrayIterator<Item> implements Iterator<Item>{
        private int current;
        private Item[] q;
        @SuppressWarnings("unchecked")
        public RandomArrayIterator(){
            this.q = (Item[])new Object[size];
            System.arraycopy(randomArray, 0, this.q, 0, size);
            if(size > 0) StdRandom.shuffle(q, 0, size-1);
            this.current=0;   
        }
        public boolean hasNext() {
           if (isEmpty()) throw new NoSuchElementException();
           if (current >=size) return false;
           else return true;
        }
        @SuppressWarnings("unchecked")
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = (Item) q[current];
            this.current = current+1;
            return item;
        }
        public void remove(){ throw new UnsupportedOperationException(); }
    }
    
    public static void main(String[] args) {   
    }

}
