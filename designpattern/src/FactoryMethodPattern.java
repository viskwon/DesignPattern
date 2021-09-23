public class FactoryMethodPattern {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza();

    }

    public static abstract class PizzaStore { // Cretor

        abstract Pizza createPizza(String type);

        public void orderPizza() {
            Pizza pizza = createPizza("type1");
            // pizza. framework

            pizza.step1();
            pizza.step2();
            pizza.step3();
            pizza.step4();

        }

    }

    public static class ChicagoPizzaStore extends PizzaStore { //Concrete Cretor

        @Override
        Pizza createPizza(String type) {   //Factory Method Pattern Creator
            if (type.equals("type1"))
                return new BulgogiPizza();
            else return new BulgogiPizza();
        }

    }


    public abstract static class Pizza { //Product
        public void step1() {
        }

        public void step2() {
        }

        public void step3() {
        }

        public void step4() {
        }


    }

    public static class BulgogiPizza extends Pizza { // Concrete Product

    }


}
