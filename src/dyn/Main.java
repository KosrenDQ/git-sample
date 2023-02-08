package dyn;

public class Main {

    public static void main(String[] args) {
        // I want to create a dynamic string array
        DynArray<String> lines = new DynArray<>();

        // I want to add 100 elements and print them
        for (int i = 0; i < 100; i++) {
            lines.add("Hello");
            System.out.println(lines.get(i));
        }

        System.out.println();

        // I want to remove that 100 elements
        for (int i = 0 ; i < 100; i++) {
            lines.remove(i);
        }

        System.out.println();
    }
}
