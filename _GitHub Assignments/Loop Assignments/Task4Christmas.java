public class Task4Christmas {
    public static void main(String[] args){
        //setting up the loop
        for(int x = 1; x <= 12; x++){
            //pausing for 2 seconds between days
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
            }
            //printing the day
            if(x == 1){
                System.out.println("On the first day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 2){
                System.out.println("On the second day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 3){
                System.out.println("On the third day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 4){
                System.out.println("On the fourth day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 5){
                System.out.println("On the fifth day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 6){
                System.out.println("On the sixth day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 7){
                System.out.println("On the seventh day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 8){
                System.out.println("On the eighth day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 9){
                System.out.println("On the ninth day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 10){
                System.out.println("On the tenth day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 11){
                System.out.println("On the eleventh day of Christmas, my true love gave to me:");
                daylines(x);
            }
            else if(x == 12){
                System.out.println("On the twelfth day of Christmas, my true love gave to me:");
                daylines(x);
            }
        }
    }
    public static void pause(){
        //pausing for a second between lines
        try {
            Thread.sleep(1000);
        }
        catch(Exception e){
        }
    }
    public static void daylines(int day){
        //making the lines for the days
        String day1 = "A partridge in a pear tree.";
        String day2 = "Two turtle doves, and";
        String day3 = "Three French hens,";
        String day4 = "Four calling birds,";
        String day5 = "**Five golden rings,**";
        String day6 = "Six geese a-laying,";
        String day7 = "Seven swans a-swimming,";
        String day8 = "Eight maids a-milking,";
        String day9 = "Nine ladies dancing,";
        String day10 = "Ten lords a-leaping,";
        String day11 = "Eleven pipers piping,";
        String day12 = "Twelve drummers drumming,";
        //pausing for 2 seconds between days
        pause();
        pause();
        //setting up loop to print the lines and pause depending on the day
        if(day == 12){
            System.out.println(day12);
            pause();
        }
        if(day >= 11){
            System.out.println(day11);
            pause();
        }
        if(day >= 10){
            System.out.println(day10);
            pause();
        }
        if(day >= 9){
            System.out.println(day9);
            pause();
        }
        if(day >= 8){
            System.out.println(day8);
            pause();
        }
        if(day >= 7){
            System.out.println(day7);
            pause();
        }
        if(day >= 6){
            System.out.println(day6);
            pause();
        }
        if(day >= 5){
            System.out.println(day5);
            pause();
            pause();
        }
        if(day >= 4){
            System.out.println(day4);
            pause();
        }
        if(day >= 3){
            System.out.println(day3);
            pause();
        }
        if(day >= 2){
            System.out.println(day2);
            pause();
        }
        if(day >= 1){
            System.out.println(day1);
        }
        //making a new line after each set
        System.out.println();
    }
}