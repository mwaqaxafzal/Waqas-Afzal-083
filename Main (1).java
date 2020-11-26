package dsalabassignment;

public class DsaLabAssignment {
    Node front;
    Node rear;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
        
    }
   
    public void enqueue(int data){
        Node n= new Node (data);
        if (front == null) 
        {
            front = rear = n;
            return;
        }
                
        rear.next = n;
        rear = n;  
    }

    public void dequeue(){
        if (isempty())
        {
            System.out.println("Queue is Empty!");
            return;
        }
        
        front = front.next;
        
        if (front == null)
        {
            rear = null;
        }
    }
     
    public boolean isempty(){
        return front == null;
    }
   
     public void display ()
    {
        Node t = front;
        
        while (t != null)
        {
            System.out.println("data = " +t.data);
            t = t.next;
        }
        
    }
 
    public static void main(String[] args) {
      
        DsaLabAssignment queue = new DsaLabAssignment();
        System.out.println("BEFORE Dequeue");   
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
         
        System.out.println("AFTER Dequeue");     
        queue.dequeue();
        queue.display();    
    }
    
}