public class StackUsingLinkedlist {
    private Node top;
    private int size;

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    StackUsingLinkedlist(){
        this.top=null;
        this.size=0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next= top;
        top=newNode;
        size++;
        System.out.println("Node inserted " + top.val);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int topData= top.val;
        top=top.next;
        size--;
        return topData;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.val;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp= temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return top==null;
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        StackUsingLinkedlist stack = new StackUsingLinkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(50);
        stack.push(60);
        System.out.println(stack.pop());
        stack.push(70);
        System.out.println(stack.pop());
        stack.display();
        System.out.println("The size of the stack is " + stack.size());
    }
}
