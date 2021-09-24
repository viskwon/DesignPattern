import java.util.Enumeration;
import java.util.Iterator;

public class AdapterPattern {
    // Enumeration 을 Iterator 로 Adapter
    public static class IteratorAdatper implements Iterator{ // Iterator 이 Targetinterface
        Enumeration enumeration;

        @Override
        public boolean hasNext() {
            return enumeration.hasMoreElements();
        }

        @Override
        public Object next() {
            return enumeration.nextElement();
        }
    }
}
