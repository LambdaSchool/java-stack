package app;

public class Main
{
    public static void main(String[] args)
    {
        Stack stack = new Stack(1000);
        System.out.println(stack.numOfItems());
        stack.push("first");
        stack.push("second");
        stack.push("third");
        System.out.println(stack.numOfItems);
    }
}
