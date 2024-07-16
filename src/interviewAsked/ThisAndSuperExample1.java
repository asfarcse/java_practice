package interviewAsked;

class GrandParent {
    GrandParent() {
        System.out.println("Constructor of GrandParent class");
    }
}

class Parent1 extends GrandParent {
    Parent1() {
        System.out.println("Constructor of Parent1 class");
    }
}

class Son extends Parent1 {
	Son() {
        this(10); 
        System.out.println("Constructor of Child class");
    }

	Son(int x) {
        super(); 
        System.out.println("Parameterized Constructor of Child class with x = " + x);
    }
}

public class ThisAndSuperExample1 {
    public static void main(String[] args) {
    	Son son = new Son();
    }
}

