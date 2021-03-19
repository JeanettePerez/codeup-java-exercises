package animals;
public interface Describable {
    // For all animals, we want to make sure a method is implemented that can print its details
    void printDetails();
}
//
//TODO: Pick a new animal family (feline, some family of reptiles, your choice!)
//        TODO: Implement at least two concrete classes of that family representing unique animals
//        -> Give each of the animals properties
//        -> Think about similarities between the two and differences
//        -> Implement methods that represent an action each animal can take
//        TODO: Create an abstract class that can be used to group the two animal together via inheritance
//    -> [Your animal class] extends [Your abstract class]
//        -> Take similar properties and methods from the concrete classes and put them in the abstract class
//    -> Fulfill the abstract classes contracts using 'super()' and implementing abstract methods (if you have any)
//        TODO: Have the abstract class inherit from the interface Describable
//    -> Decide if you will fulfill Describable's contract in the abstract class (both new animals will have the same method implementation), or
//            -> Will you decide to place the implementation in each unique concrete animal class
//TODO: Finally, tie in your new animal family to our existing AnimalTools class
//    -> The user should be able to pick an animal family, THEN decide if they want details on a specific animal in that family
//            TODO: Lastly, HAVE FUN WITH THIS! Use your imagination. If you want to do something unique or different, go for it!
//            TODO: BONUS -> Create another abstract class that will umbrella both Canine and your new animal family's abstract class
//        -> Could we use this as a way to further simplify our code? Could it make our logic that decides what animal to print out a little easier?