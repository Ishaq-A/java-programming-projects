public class Main {

    public static void main(String[] args) {
        new ConSub(4);
    }
}

class ConSuper {
    protected ConSuper() {
        this(2);
        System.out.print("1");
    }

    protected ConSuper(int a) {
        System.out.print(a);
    }
}

