public class BuilderPattern {
    public static void main(String[] args) {

    }
    public static class Director {
        AbstractBuilder builder;

        public void setBuilder(AbstractBuilder builder){
            this.builder = builder;
        }

    }

    public static class   AbstractBuilder {

    }

    public static class ConcreteBuilder extends AbstractBuilder{

    }
}
