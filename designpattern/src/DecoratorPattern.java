public class DecoratorPattern {


    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent = new ConcreteDecorator(concreteComponent);
        concreteComponent = new ConcreteDecorator(concreteComponent);
        concreteComponent = new ConcreteDecorator2(concreteComponent);

        System.out.println(concreteComponent.cost());
    }
    public static abstract class Component {
        public abstract int cost();

    }

    public static class ConcreteComponent extends Component {

        @Override
        public int cost() {
            return 10;
        }
    }


    public static abstract class Decorator extends Component {
        protected Component component;

    }

    public static class ConcreteDecorator extends Decorator {
        public ConcreteDecorator(Component com){
            component = com;

        }


        @Override
        public int cost() {
            return 5+component.cost();
        }
    }

    public static class ConcreteDecorator2 extends Decorator {
        public ConcreteDecorator2(Component com){
            component = com;

        }


        @Override
        public int cost() {
            return 1+component.cost();
        }
    }
}
