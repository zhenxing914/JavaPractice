package helloworld.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by song on 2018/7/9.
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue queue= new LinkedList<String>();
        queue.add("1");
        queue.add("2");

        for(int i=0;i<queue.size()-1;i++)
        {
            System.out.println(queue.poll());
        }

    }
}
