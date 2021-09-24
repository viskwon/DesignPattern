import java.util.Observable;
import java.util.Observer;

public class MVC {  //Architect pattern

    public static void main(String[] args) {

    }

    public static class Model extends Observable { // 잦은 UI 의 변화가 Model 에 파급되지 않아야 한다.


        void change(){
            setChanged();
            notifyObservers();

        }
    }

    public static class View implements Observer {

        public Controller controller;

        public Model model;
        View(Model m){
            model = m;
            model.addObserver(this);
        }

        @Override
        public void update(Observable o, Object arg) {

        }
    }

    public static class Controller {
        Model model = new Model();
        View view = new View(model);
        public Controller(Model m , View v){
            model = m;
            view = v;
            view.controller = this;
            model.addObserver(view);
        }

    }

}
