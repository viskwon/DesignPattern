public class BridgePattern {

    public static void main(String[] args) {

    }


    abstract static class Logger { // Abstraction
        Writer writer;

        public Logger(Writer _writer) {
            writer = _writer;
        }

        abstract protected void log(String message);
    }

    public static class TextLogger extends Logger { //RefinedAbstration
        public TextLogger(Writer _writer) {
            super(_writer);
        }

        @Override
        protected void log(String message) {
            writer.write();

        }
    }


    abstract public static class Writer { //Implementor
        abstract void write();

    }

    public static class DirectWriter extends Writer { //ConcreteImplementor

        @Override
        void write() {

        }
    }

    public static class BufferedWriter extends Writer { //ConcreteImplementor

        @Override
        void write() {

        }
    }

}
