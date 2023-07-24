//We are going to define what makes an object, in this case a person
public class Person {
    //Usually we set up main(String[] args), but we don't need it here.
    /*instance variables (fields) define what info we want to store */
    public String name;
    public int age;
    public boolean alive;

    //We are going to use a constructor
    //The constructor describes how to initialize a new Person object
    public Person(String nName, int nAge){
        name = nName;
        age = nAge;
        if(age <= 69420){
            alive = true;
        }
        else{
            alive = false;
        }
    }

    //Instance methods must be called on a specific instance
    /*Note: they do NOT have "static" in the name */
    public void introduce(){
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

/*
 * 
 * 
 * --------------------GO TO PersonTest.java--------------------
 * 
 * 
 */