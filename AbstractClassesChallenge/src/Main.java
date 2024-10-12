public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        // Create a string data array to avoid typing loads of addItem instructions.
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" "); // Separates each item (space is needed).
        for (String s : data) {
            tree.addItem(new Node(s));
        }
        // Returns a string array of all the individual items in the list.

        tree.traverse(tree.getRoot());
        System.out.println("==================================");
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
        System.out.println("==================================");

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());
        System.out.println("==================================");

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());
        System.out.println("==================================");

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        System.out.println("==================================");
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        System.out.println("==================================");
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        System.out.println("==================================");
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        System.out.println("==================================");
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}
