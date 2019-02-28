public class NestedNonStaticClass {

    private String privateVariable = "private";

    public class NestedClass {
        public void demonstration() {
            System.out.println(privateVariable);
        }
    }
}
