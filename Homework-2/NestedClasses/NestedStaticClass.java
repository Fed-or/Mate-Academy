public class NestedStaticClass {

    static int outer_static_a = 10;

    int outer_non_static_a = 20;

    private static int outer_private_a = 30;

    public static class StaticNestedClass {
        void display() {
            System.out.println("outer_x = " + outer_static_a);

            System.out.println("outer_private = " + outer_private_a);
        }
    }
}
