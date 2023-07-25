public class driver{
    public static void main(String[] args){
        Animal a = new Animal();
        Animal b = new Wolf();
        //Wolf c = new Animal();
        Wolf d = new Wolf();

        a.MakeNoise(); // Animal noise
        b.MakeNoise(); // Wolf noise
        d.MakeNoise(); // Wolf noise

        //((Wolf) a).runFreelyInTheForest(); 
        /*--------These lines failed with casting because Wolf is a subclass of Animal, so Animal's do not have accsess to run in the forest------------*/
        ((Wolf) b).runFreelyInTheForest();
        /*--------This line works with casting because B is labeled as a Wolf, so it can run in the forest----------*/
        d.runFreelyInTheForest();

        a.name = "Angus";
        b.name = "Wolfgang";
        d.name = "Wolfie";

        //a.wolfSpiritAnimal = 1;
        ((Wolf) b).wolfSpiritAnimal = 2;
        d.wolfSpiritAnimal = 3;
    }
}