package Stack;

public class Main {
    public static void main(String[] args) {
        customStack Stack=new customStack(5);
//        stack.push(1);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        System.out.println(stack);
//        System.out.println(stack.pop());

        customDynamicStack dynamicStack=new customDynamicStack();
        dynamicStack.push(1);
        dynamicStack.push(3);
        dynamicStack.push(4);
        dynamicStack.push(5);
        dynamicStack.push(6);
        dynamicStack.push(7);
        System.out.println(dynamicStack.pointer);
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.peek());

    }
}
