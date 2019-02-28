public class Main {
    public static void main(String[] args) {
        NestedStaticClass.StaticNestedClass nestedObject = new NestedStaticClass.StaticNestedClass();
        nestedObject.display();

        NestedNonStaticClass.NestedClass inner = new NestedNonStaticClass().new NestedClass();
        inner.demonstration();


    }
}


