public class StatePattern {


    public static class GumballMachine { // Context
        State noQuarterState = new NoQuarterState(this);
        State soldOutState = new SoldoutState(this);
        State soldState = new SoldState(this);
        State hasQuarterState = new HasQuarterState(this);
        State currentState = new NoQuarterState(this);

        public void setState(State state){
            currentState = state;
        }


        public void insertQuarterEvent() {
            currentState.insertQuarter();
        }

        public void dispense(){
            currentState.dispense();
        }


        public State getHasQuarterState (){
            return hasQuarterState;
        }


        public State getSoldState (){
            return soldState;
        }


    }


    interface State {
        void insertQuarter();

        void ejectQuarter();

        void turnCrank();

        void dispense();
    }

    public static class NoQuarterState implements State {  // concrete class
        GumballMachine gumballMachine;

        public NoQuarterState(GumballMachine g) {
            gumballMachine = g;
        }

        @Override
        public void insertQuarter() {
            gumballMachine.setState(gumballMachine.getHasQuarterState());



        }

        @Override
        public void ejectQuarter() {

        }

        @Override
        public void turnCrank() {

        }

        @Override
        public void dispense() {

        }
    }

    public static class HasQuarterState implements State {
        GumballMachine gumballMachine;

        public HasQuarterState(GumballMachine g) {
            gumballMachine = g;
        }

        @Override
        public void insertQuarter() {

        }

        @Override
        public void ejectQuarter() {

        }

        @Override
        public void turnCrank() {
            gumballMachine.setState(gumballMachine.getSoldState());
            gumballMachine.dispense();
        }

        @Override
        public void dispense() {

        }
    }

    public static class SoldState implements State {
        GumballMachine gumballMachine;

        public SoldState(GumballMachine g) {
            gumballMachine = g;
        }

        @Override
        public void insertQuarter() {

        }

        @Override
        public void ejectQuarter() {

        }

        @Override
        public void turnCrank() {

        }

        @Override
        public void dispense() {

        }
    }

    public static class SoldoutState implements State {
        GumballMachine gumballMachine;

        public SoldoutState(GumballMachine g) {
            gumballMachine = g;
        }

        @Override
        public void insertQuarter() {

        }

        @Override
        public void ejectQuarter() {

        }

        @Override
        public void turnCrank() {

        }

        @Override
        public void dispense() {

        }
    }

}
