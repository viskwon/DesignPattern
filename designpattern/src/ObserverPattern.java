import java.util.ArrayList;

public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new WeatherData();

        Observer observer1 = new CurrentConditionDisplay(subject);

        subject.notifyObservers();

    }

    public interface Subject{
        void registerObserver(Observer o);
        void removeObserver(Observer o);
        void notifyObservers();
    }

    public interface Observer{
        void update(float t, float h, float p);
    }
    public interface displayElement{  // Observer Pattern 과 연관은 없는 interface
        void display();
    }

    public static class WeatherData implements Subject{ // ConcreteSubject
        private ArrayList<Observer> observerArrayList;
        private float t;
        private float h;
        private float p;

        @Override
        public void registerObserver(Observer o) {
            observerArrayList.add(o);

        }

        @Override
        public void removeObserver(Observer o) {
            observerArrayList.remove(o);

        }

        @Override
        public void notifyObservers() {
            for(Observer o : observerArrayList){
                o.update(1f,2f,3f);
            }

        }
    }

    public static class CurrentConditionDisplay implements Observer ,displayElement{ //concreteObserver

        private Subject weatherSubject;
        public CurrentConditionDisplay(Subject subject){
            weatherSubject = subject;
            weatherSubject.registerObserver(this);
        }
        @Override
        public void update(float t, float h, float p) {

        }

        @Override
        public void display() {

        }
    }
}
