public class ClassInMethod {

        void outerMethod() {
            System.out.println("Метод внешнего класса");
            // Внутренний класс является локальным для метода outerMethod()
            class Inner {
                public void innerMethod() {
                    System.out.println("Метод внутреннего класса");
                }
            }
            Inner inner = new Inner();
            inner.innerMethod();
        }

        public static void main(String[] args) {

        }
    }
