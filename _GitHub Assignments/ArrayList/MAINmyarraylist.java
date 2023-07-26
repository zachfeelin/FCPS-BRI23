import java.util.ArrayList;
public class MAINmyarraylist{
    public static void main(String[] args){
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("barbie");
        mylist.add("girl");
        mylist.add("in");
        mylist.add("a");
        mylist.add("barbie");
        mylist.add("world");
        mylist.add("life");
        mylist.add("in");
        mylist.add("plastic");
        mylist.add("it's");
        mylist.add("fantastic");

        MyArrayList thisList = new MyArrayList();
        // MyArrayList constructor: Tells us how to initialize an empty list 

        // get: Retrieves and returns the element at position 'index' 

        // resizeIfNeeded: A helper method we use to avoid having to copy-paste all the array resizing code

        // add: Add the specified element to the end of the array. Automatically resizes the array if it runs out of space by doubling the amount of available slots. 

        // size: Return the number of elements stored in the array not counting the blank slots 

        /* remove: Delete the item at the specified index. 
                All entries after that index will be shifted by 1, and the length will be decreased by 1 to accurately reflect the number of elements. */

        // set: Overwrite the String toAdd in the slot index of the array. Throws an exception if the index is negative or greater than the length 

        // removeAll: Remove everything from the list 

        // insert: Insert a String at the specified position. The String previously at that location is shifted forward one slot, along with everything after it. 
        
    }
}