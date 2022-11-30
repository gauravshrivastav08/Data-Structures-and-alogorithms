package dataStructure.BasicDataStructure;

public class AbstractDataType {
    private int counter;
    private String name;

    public AbstractDataType(String name)
    {
        this.name = name;
    }

    public int increment()
    {
        return counter++;
    }

    public int getCurrentValue()
    {
        return counter;
    }

    public String toString()
    {
        return name + ": " + counter;
    }
}

// Here basically class name as AbstractDataType implementation details are hidden from Class App.

class App {
    public static void main(String[] args) {
        AbstractDataType object1 = new AbstractDataType("adt");
        object1.getCurrentValue();
        object1.increment();
        System.out.println(object1);
    }
}
