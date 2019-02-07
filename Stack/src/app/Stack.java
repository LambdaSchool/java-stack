package app;

import java.util.ArrayList;
import java.util.List;
public class Stack
{
    private List<String> stack = new ArrayList<String>();
    private int length = 0;
    private final int MAX;

    public Stack(int limit)
    {
        this.MAX = limit;
    }

    public String pop()
    {
        length -= 1;
        int index = stack.size() - 1;
        String item = stack.get(index);
        stack.remove(index);
        return item;
    }

    public void push(String item)
    {
        stack.add(item);
        length += 1;
    }

    public String numOfItems()
    {
        return length < 1 ? "There are no items in your Stack" : "" + length;
    }

}
