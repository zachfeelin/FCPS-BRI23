/*
 * 
 * 
 * -------------------------COME AFTER YOU VIEWED Person.java-------------------------
 * 
 * 
 */

public class PersonTest {
    public static void main(String[] args){
        System.out.println();
        System.out.println();
        Person zach = new Person("zach", 100);
        if(zach.alive){
            System.out.println(zach.name + " is alive! Here's what they have to say:");
            System.out.println();
            zach.introduce();
        }
        else{
            System.out.println(zach.name + " is dead! So sad...");
        }
        System.out.println();
        System.out.println();
    }
}