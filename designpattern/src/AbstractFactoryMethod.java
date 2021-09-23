public class AbstractFactoryMethod {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        //factory 를 delegation 해서 생성자로 씀
        factory.createProductA();
        factory.createProductB();

    }
    interface AbstractFactory{
        AbstractProduct createProductA();
        AbstractProductType2 createProductB();

    }
    public static class ConcreteFactory implements AbstractFactory{
        @Override
        public AbstractProduct createProductA() {
            return new ConcreteProduct();

        }

       @Override
        public AbstractProductType2 createProductB() {
           return new ConcreteProductType2_1();
       }
    }

    public static class ConcreteFactory1 implements AbstractFactory{

        @Override
        public AbstractProduct createProductA() {
            return new ConcreteProduct1();

        }

        @Override
        public AbstractProductType2 createProductB() {
            return new ConcreteProductType2_2();
        }
    }
    interface AbstractProduct{

    }
    public static class ConcreteProduct implements AbstractProduct{


    }

    public static class ConcreteProduct1 implements AbstractProduct{

    }

    public static class ConcreteProduct2 implements AbstractProduct{

    }
    interface AbstractProductType2{

    }

    public static class ConcreteProductType2_1 implements AbstractProductType2{

    }
    public static class ConcreteProductType2_2 implements AbstractProductType2{

    }

}
