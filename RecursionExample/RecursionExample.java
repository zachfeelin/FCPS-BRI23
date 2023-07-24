public class RecursionExample{
    public static void main(String[] args){
        myMethod0(1);
    }
    public static void myMethod(int times){
        times++;
        System.out.println("Hello World! " + times);
        //since myMethod() is called in myMethod(), it is a recursive method
        //this will cause an infinite loop until the stack overflows
        myMethod(times);
    }
        public static void myMethod0(int times){
        times++;
        System.out.println("Hello World! " + times);
        //this time we will detect for a number and stop the recursion
        if(times > 1000){
            return;
        }
        myMethod0(times);
    }
}