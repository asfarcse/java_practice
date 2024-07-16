package stringExample;

class MyClass {
    private int value;

    public MyClass setValue(int value) {
        this.value = value;
        return this; // Return reference to the object itself
    }

    public MyClass add(int increment) {
        this.value += increment;
        return this;
    }

    public int getValue() {
        return this.value;
    }
}

public class FunctionChaining {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Function chaining
        int result = obj.setValue(10).add(5).getValue();
        System.out.println("Result: " + result); // Output: Result: 15
    }
}

