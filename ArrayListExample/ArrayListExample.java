import java.util.ArrayList;
public class ArrayListExample{
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

        System.out.println();
        for(int i=0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
    }
}