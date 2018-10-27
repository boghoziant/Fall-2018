import java.util.*;
/*
 * From useQueue, print out
 * [Strawberries, Whipped Cream, Blueberries, Whipped Cream, Strawberries, Whipped Crean, Powdered Choclolate]
 * 
 * From useDeque, print out
 * [Pineapple Cake, Whipped Cream, Strawberries, Whipped Cream, Powdered Choclolate]
 *
 * From usePque, print out
 * [Bananas, Vanilla Wafers, Whipped Cream]
 * 
 * Do not remove or modify the code below.
 * You can add code where indicated.
 */
public class MyQues{
    public static void main(String[] args){
        System.out.println();
        useQueue();
        System.out.println();
        useDeque();
        System.out.println();
        usePque();
        System.out.println();
    }

    public static void useQueue(){
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Blueberries");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.poll();
        myQueue.poll();
        myQueue.offer("Whipped Cream");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.offer("Powdered Choclolate");
        // Add code below
        
        // Add code above
        System.out.print(myQueue);
    }

    public static void useDeque(){
        Deque<String> myQueue = new LinkedList<>();
        myQueue.offer("Blueberries");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.poll();
        myQueue.poll();
        myQueue.offer("Whipped Cream");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.offer("Powdered Choclolate");
        // Add code below
        
        // Add code above
        System.out.print(myQueue);
    }

    public static void usePque(){
        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.offer("Blueberries");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.poll();
        myQueue.poll();
        myQueue.offer("Whipped Cream");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.offer("Powdered Choclolate");
        // Add code below
        
        // Add code above
        System.out.print(myQueue);
    }

}

