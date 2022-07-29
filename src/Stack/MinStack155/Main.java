package Stack.MinStack155;

public class Main {
    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(3);
        ms.push(1);
        ms.push(5);
        ms.pop();;
        ms.pop();;
        ms.push(-8);
        ms.push(0);;
        System.out.println(ms.getMin());
        System.out.println(ms.top());
    }
}
