public class SingletonPattern {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

    }

    public static class Singleton {
        private static volatile Singleton uniqueInstance; // 객체가 완벽하기 만들어 지기 전에 값이 return 되는 경우를 방지

        private Singleton() {
        } // 외부에서 new 로 생성하는 것을 허용하지 않음

        public static Singleton getInstance() {
            if (uniqueInstance == null) { // Double check locking
                synchronized (Singleton.class) {
                    if (uniqueInstance == null)
                        uniqueInstance = new Singleton();
                }
            }
            return uniqueInstance;
        }
    }
}
