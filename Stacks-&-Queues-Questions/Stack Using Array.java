class StackUsingArray {
    private int arr[];
    private int top;
    private int capacity;

    public StackUsingArray(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Cannot Push " + data + " stack overflow");
            return;
        }
        arr[++top] = data;
        System.out.println("Data Pushed " + data);
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        }
        int temp = arr[top];
        top--;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        }

        return arr[top];

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(10);
        st.push(5);
        st.push(6);
        st.push(7);
        st.pop();
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        System.out.println("Size of the stack is "+ st.size());
        st.display();
        System.out.println("Is Stack full " + st.isFull());
        System.out.println("Is Stack empty " + st.isEmpty());
    }
}