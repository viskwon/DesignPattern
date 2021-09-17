package solidPrinciple;

public class LSP {

    public static class BadParent{

    }

    public static class BadSubClass extends BadParent{

    }


    public interface List{
        List list = null;
    }

    public static class Queue{

    }
    public static class Client  implements List{

        public static void main(String[] args) {

        }
    }


}
