
public class CopyConstructor {
    private int intValue;
    private String stringValue;

    // Constructor
    public CopyConstructor(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // Copy Constructor
    public CopyConstructor(CopyConstructor other) {
        this.intValue = other.intValue;
        this.stringValue = other.stringValue;
    }

    // Getter methods
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static void main(String[] args) {
        // Create an object
    	CopyConstructor original = new CopyConstructor(10, "Original String");

        // Create a copy using the copy constructor
    	CopyConstructor copy = new CopyConstructor(original);

        // Output the values of the original and copied objects
        System.out.println("Original: " + original.getIntValue() + ", " + original.getStringValue());
        System.out.println("Copy: " + copy.getIntValue() + ", " + copy.getStringValue());
    }
}
