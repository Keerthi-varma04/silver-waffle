import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
public class QueueImplementation{
    private ArrayList<Integer> queue = new ArrayList<>();
    public void enqueue(int value){
        queue.add(value);
    }
    public int dequeue(){
        if(queue.isEmpty()){
            throw new IllegalStateException("Queue id empty");
        }
        return queue.remove(0);
    }
    public int peek(){
        if(queue.isEmpty()){
            throw new IllegalStateException("queue is Empty");
        }
        return queue.get(0);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }
    public static void main(String[] args){
        QueueImplementation q=new QueueImplementation();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no.of elements that u want to add in queue:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            q.enqueue(value);
        }
        System.out.println("enter your choice: 1.dequeue 2.peek 3.size 4.empty");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
            q.dequeue();
            System.out.println("dequeue element:"+q.dequeue());
            break;
            case 2:
            q.peek();
            System.out.println("peek element:"+q.peek());
            break;
            case 3:
            q.size();
            System.out.println("queue size:"+q.size());
            break;
            case 4:
            q.isEmpty();
            System.out.println("is queue empty....?:"+q.isEmpty());
            break;
            default:
            System.out.println("invalid choice!");
        }
        sc.close();
    }
}