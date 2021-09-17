package solidPrinciple;

public class OCP { // abstraction 을 적극적으로 이용

    public static abstract class Employment{
        public abstract void incSalary();
    }
    public static class Staff extends Employment {
        @Override
        public void incSalary() {

        }
    }

    public static class Beginner extends Employment {
        @Override
        public void incSalary() {

        }
    }

    public static class Client{
        public static void main(String[] args) {
            Employment a = new Beginner();
            Employment b = new Staff();
            a.incSalary();
            b.incSalary();
            //다른 code 가 실행된다.
        }
    }
}
