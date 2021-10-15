package agh.ii.prinjava.lab02.lst02_08;

class C6 {
    void doStuff() {
        System.out.println("C6.doStuff");
    }
}

/**
 * An example of a tight coupling. In most cases a VERY bad design decision <br>
 * (interfaces, as contracts, should be used instead -> loose coupling)
 */
class C7 {
    private final C6 c6 = new C6(); // (very) tight coupling

    void doC7Stuff() {
        System.out.println("C7.doStuff");
        c6.doStuff();
    }
}

/**
 * Refactoring of the above (<a href="https://www.baeldung.com/solid-principles">see SOLID principles</a>)
 */
interface IC8 {
    void doStuff();
}

class C8Impl1 implements IC8 {
    @Override
    public void doStuff() {
        System.out.println("C8Impl1.doStuff");
    }
}

class C8Impl2 implements IC8 {
    @Override
    public void doStuff() {
        System.out.println("C8Impl2.doStuff");
    }
}

class C8Impl3 implements IC8 {
    @Override
    public void doStuff() {
        System.out.println("C8Impl3.doStuff");
    }
}

class C9 {
    private final IC8 ic8; // IC8 as the contract

    void doC9Stuff() {
        System.out.println("C9.doStuff");
        ic8.doStuff(); // calling "doStuff" through IC8 interface
    }

    /**
     * The implementing class is given as the argument of the constructor
     */
    public C9(IC8 ic8) {
        this.ic8 = ic8;
    }
}