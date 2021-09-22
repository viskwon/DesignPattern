public class TemplateMethodPattern {

    public static void main(String[] args) {

        CaffeineBeverage coffee = new Coffee();
        coffee.tempateMethodSkeleton();
    }

    public abstract static class CaffeineBeverage{
        boolean condimentalHook = false;

        final void  tempateMethodSkeleton() { //templete method block skeleton 골격function 하위에서 이부분은 수정을못하게 하기 위함
            step1();
            step2();
            step3();
            step4();
            if(condimentalHook) step5();
        }
        public void step1(){
            System.out.println("common 1");
        }

        abstract void step2();
        abstract void step3();
        public void step4(){
            System.out.println("common 4");

        }
        public void step5(){
            System.out.println("common 5");
        }



    }

    public static class Coffee extends CaffeineBeverage{  //concrete class low level conponent
        @Override
        void step2() {
            System.out.println("Coffee 2");

        }

        @Override
        void step3() {
            System.out.println("Coffee 3");
        }
    }

    public static class Tea extends CaffeineBeverage{

        @Override
        void step2() {

        }

        @Override
        void step3() {

        }
    }


}
