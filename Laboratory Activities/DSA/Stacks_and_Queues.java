import java.util.Scanner;

public class Stacks_and_Queues {
    static class Stack {
	private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int s) {
		maxSize = s;
		stackArray = new char[s];
		this.top = -1;
    }

    public void push(char item) {
		if(top == maxSize - 1) {
            System.out.println("Stack is full, cannot insert.");
        }
		else {
			++top;
			stackArray[top] = item;
		}
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack is empty, cannot pop element.");
            return '\0'; // Return null character if stack is empty
        }
		else {
			return stackArray[top--];
		}
    }

    public boolean empty() {
        return top == -1;
    }
    public boolean full() {
        return top == stackArray.length - 1;
    }		
    }

static class Queue {
    private int maxSize;
    private char[] queueArray;
    private int front;
    private int rear;
    private int numItems;

    public Queue(int s) {
        maxSize = s;
        queueArray = new char[s];
        front = 0;
        rear = -1;
        numItems = 0;
    }

    public char peek(){
        return queueArray[front];
    }

    public boolean empty() {
        return numItems == 0;
    }

    public boolean full() {
        return numItems == maxSize;
    }


    public void enqueue(char item) {
        if (full()) {
            System.out.println("Queue is full, cannot enqueue.");
            return;
        }

        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = item;
        numItems++;
    }

    public char dequeue() {
        if (empty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return '\0'; 
        }

        char item = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        numItems--;
        return item;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;

        System.out.println("+--------------------------+");
        System.out.println("|     Palindrome Checker   |");
        System.out.println("+--------------------------+");
        System.out.println("Examples to try: racecar, level, madam");
        System.out.print("Check word: ");

        // read user input and convert to lowercase
        String startInput = sc.nextLine();
        startInput = startInput.toLowerCase();

 // push each character of startInput into a stack
    Stack stack = new Stack(startInput .length());
    for (int i = 0; i < startInput.length(); i++) {
        stack.push(startInput.charAt(i));
        }

        // push each character of startInput into a queue
    Queue queue = new Queue(startInput.length());
    for (int i = 0; i < startInput.length(); i++) {
        queue.enqueue(startInput.charAt(i));
    }

        // print the reversed word using stringbuilder
        String reversedWord = new StringBuilder(startInput).reverse().toString();
        System.out.println("Reversed word: " + reversedWord);

        // compare characters from stack and queue
        while (!stack.empty()) {
            char stackChar = stack.pop();
            char queueChar = queue.dequeue();

            if (stackChar != queueChar) {
                System.out.println("The word \"" + startInput + "\" is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word \"" + startInput + "\" is a palindrome.");
        }
        
        sc.close();
        }
    }
}

