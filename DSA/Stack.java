class StackImplementation{
    int capacity = 5;
    int stack[] = new int[capacity];
    int top = 0;
    public void push(int data){
        if(isFull()){
            expandStack();
        }
        stack[top] = data;
        top++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int data ;
        top--;
        data = stack[top];
        stack[top] = 0;
        shrinkStack();
        return data;
    }

    public void show(){
        for(int n : stack){
            System.out.println(n);
        }
    }

    public int peek(){
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public boolean isFull(){
        return top==stack.length;
    }

    public void expandStack(){
        int length = size();
        int newStack[] = new int[length*2];
        for(int i=0;i<length;i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public void shrinkStack(){
        int length = size();
        if(length <= (capacity/2)/2){
            capacity = capacity/2;
        }
        int newStack[] = new int[capacity];
        for(int i=0;i<length;i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

}

public class Stack {
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.show();
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        stack.show();
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.show();
        System.out.println("Is stack full? " + stack.isFull());
        stack.push(70);
        stack.show();
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        stack.show();
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        stack.show();
    }
}
