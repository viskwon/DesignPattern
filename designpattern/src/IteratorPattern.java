import java.util.ArrayList;

public class IteratorPattern {
    public static void main(String[] args) {


    }
    interface Iterator{
        boolean hasNext();
        Object next();
    }

    public class Menu{
        String name;
        int cost;
    }

    public static class PancakeHouseMenu{
        Menu[] menus;

        public Iterator createPancakeHouseIterator(){
            return new PancakeHouseIterator(menus);

        }
    }

    public static class PancakeHouseIterator implements Iterator{
        Menu[] menus;
        int position = 0;

        public PancakeHouseIterator(Menu[] menu){
            menus = menu;
        }

        @Override
        public boolean hasNext() {
            return menus.length > position;
        }

        @Override
        public Object next() {
            if(hasNext()){
                Menu menu = menus[position];
                position++;
                return menu;
            }
            return null;
        }
    }

    public static class StakeHouseMenu{
        ArrayList<Menu> menus = new ArrayList<>();

        public Iterator createStakeHouseIterator(){
            return new StakeHouseIterator(menus);

        }
    }

    public static class StakeHouseIterator implements Iterator{
        ArrayList<Menu> menus = new ArrayList<>();
        int position = 0;

        public StakeHouseIterator(ArrayList<Menu> menu){
            menus = menu;
        }

        @Override
        public boolean hasNext() {
            return menus.size() > position;
        }

        @Override
        public Object next() {
            if(hasNext()){
                Menu menu = menus.get(position);
                position++;
                return menu;
            }
            return null;
        }
    }




}
