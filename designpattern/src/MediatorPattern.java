public class MediatorPattern {

    public static void main(String[] args) {

    }
    abstract class Mediator {
        abstract void changed(College college);


    }

    public class ConcreteMediator extends Mediator {
        ConcreteCollege college1 = new ConcreteCollege(this);
        ConcreteCollege2 college2 = new ConcreteCollege2(this);

        @Override
        void changed(College college) {
            if (college instanceof ConcreteCollege) {
                college1.getCState();
            }

        }
    }

    abstract class College {
        Mediator mediator;

        public College(Mediator medi) {
            mediator = medi;
        }

        public void widgetChanged() {
            mediator.changed(this);
        }

    }

    public class ConcreteCollege extends College {
        public ConcreteCollege(Mediator medi) {
            super(medi);
        }

        public int getCState() {
            return 1;
        }

    }

    public class ConcreteCollege2 extends College {
        public ConcreteCollege2(Mediator medi) {
            super(medi);
        }

        public int getC2State() {
            return 2;
        }
    }

}
