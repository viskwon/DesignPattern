package solidPrinciple;

import java.util.Comparator;

public class SRP {

    public static class StudentBad implements Comparable{
        public String name;
        public String SSN;

        @Override //  Domain class 인데 다른 성질의 것을 Return 하는 compareTo 가 들어감
        public int compareTo(Object o) { // 이질적인 기능인 이 기능을 독립된 class 로 만들어 주는 방법으로 해결가능
            //
            return 0;
        }
    }

    public static class StudentGood{
        public String name;
        public String SSN;
    }

    public static class SortByStudentSSN implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    public static class AClient {
        public static void main(String[] args) {
            StudentGood a= new StudentGood();
            StudentGood b = new StudentGood();

            new SortByStudentSSN().compare(a,b);


        }
    }









}
