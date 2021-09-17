public class StrategyPattern {

    public static void main(String[] args) {
        System.out.println("strategyPattern");
    }


    interface FlyBehavior{ // 변하는것 Strategy
        void fly();
    }

    public static class FlyWithWing implements FlyBehavior{ //ConcreteStrategy
        @Override
        public void fly() {
            System.out.println("flywithWing");
        }
    }

    public static class NoFly implements FlyBehavior{ //ConcreteStrategy
        @Override
        public void fly() {
            System.out.println("no fly");
        }
    }

    public static class FlyusingRocket implements FlyBehavior{ //ConcreteStrategy
        @Override
        public void fly() {
            System.out.println("FlyusingRocket");
        }
    }


    interface QuackBehavior{// 변하는 것  //strategy
        void quack();
    }

    public static class Quack implements QuackBehavior{  //ConcreteStrategy

        @Override
        public void quack() {
            System.out.println("Quack");
        }
    }

    public static class NoQuack implements QuackBehavior{ //ConcreteStrategy

        @Override
        public void quack() {
            System.out.println("No Quack");
        }
    }
    public abstract static class Duck{

        FlyBehavior flyBehavior; // object composition 변하는 것들
        QuackBehavior quackBehavior;

        public void setFlyBehavior(FlyBehavior behavior){
            flyBehavior = behavior;  //changeable
        }

        public void setQuackBehavior(QuackBehavior behavior){
            quackBehavior = behavior;  //changeable
        }

        // Delegation
        public void swim(){} // 변하지 않는 것 .. 공통적임

        public void performFly(){
            flyBehavior.fly(); // delegation 동작을 위임함..
        }
        public void performQuack(){
            quackBehavior.quack();
        }
    }

    public class MallardDuck extends Duck {
        public MallardDuck() {
            flyBehavior = new NoFly();
            quackBehavior = new Quack();
        }

    }


}
