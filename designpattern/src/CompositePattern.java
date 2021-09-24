import java.util.ArrayList;

public class CompositePattern {
    public static void main(String[] args) {
        Component component = new Composite();
        Component component1 = new Composite();

        component.add(new Leaf());
        component.add(new Leaf());
        component.add(new Leaf());
        component.add(component1);
        component1.add(new Leaf());

        component.print();

    }

    public static class Component{

        void function1(){
            throw new UnsupportedOperationException();
        }
        void function2(){
            throw new UnsupportedOperationException();
        }
        void function3(){
            throw new UnsupportedOperationException();
        }
        public void add(Component component){
            throw new UnsupportedOperationException();
        }
        public void remove(Component component){
            throw new UnsupportedOperationException();
        }

        void print(){
            throw new UnsupportedOperationException();
        }
    }

    public static class Leaf extends Component{
        @Override
        void print() {
            System.out.println("leaf");
        }
    }
    public static class Composite extends Component{
        ArrayList<Component> compositeorLeaf = new ArrayList<>();
        public void add(Component component){
            compositeorLeaf.add(component);
        }
        public void remove(Component component){
            compositeorLeaf.remove(component);
        }

        @Override
        void print() {
            for(Component con : compositeorLeaf){
                con.print();
            }
        }
    }
}
