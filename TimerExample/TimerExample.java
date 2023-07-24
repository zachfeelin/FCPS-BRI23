//program would not run on vscode without adding this package
package TimerExample;

public class TimerExample{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        //code goes here
        int x = 1;
        for(int i=1; i<5270000; i++){
            x = x*i;
        }
        //code ends here
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);
    }
}