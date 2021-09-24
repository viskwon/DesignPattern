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
        public void add(Component component){ // transparency 를 위한 구현 .. 동일한 pointer 로 사용 그러나 safety 를 보장하지 않음
            //safety 를 위해 Composite 로 이동시키는 방법이 있음 하지만 같은 형으로 사용이 불가능함
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
