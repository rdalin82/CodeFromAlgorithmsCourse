import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class Subset {

    
    public static void main(String[] args) {
       RandomizedQueue<String> r = new RandomizedQueue<String>();
       while (!StdIn.isEmpty()){
           String[] s = StdIn.readAllStrings();
           for (int i=0; i< s.length; i++) {
               r.enqueue(s[i]);
           }   
       }
       int count = Integer.parseInt(args[0]);
       for (int i = 0; i< count;i++){
           StdOut.println(r.dequeue());
       }
    }

}
