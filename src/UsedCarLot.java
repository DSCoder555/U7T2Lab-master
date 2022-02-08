import java.util.ArrayList;

/**
 * This class represents a usedCarLot object
 *
 * @author Darius Saadat
 */
public class UsedCarLot {
    /** The inventory of the usedCarLot */
    private ArrayList<Car> inventory;

    /** Instantiates a UsedCarLot object */
    public UsedCarLot(){
        this.inventory = new ArrayList<Car>();
    }

    /** Returns the current inventory of the usedCarLot
     *
     * @return the inventory of the UsedCarLot
     */
    public ArrayList<Car> getInventory(){
        return inventory;
    }

    /** Adds a new car to the end of the inventory
     *
     * @param newCar The new car added to the end of the inventory
     */
    public void addCar(Car newCar){
        inventory.add(newCar);
    }

    /** Swaps the positions of two cars in the inventory (if possible)
     *
     * @param index1 The original index of the first car to be replaced with the second car
     * @param index2 The original index of the second car to be replaced with the first car
     * @return true if the indexes are within the ArrayList and false if at least one of the indexes are outside the ArrayList
     */
    public boolean swap(int index1, int index2){
        if(index1 >= inventory.size() || index2 >= inventory.size() || index1 < 0 || index2 < 0){
            return false;
        }
        Car temp = inventory.set(index1, inventory.get(index2));
        inventory.set(index2, temp);
        return true;
    }

    // ADD THESE FOUR NEW METHODS TO UsedCarLot

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */

    /** Adds a car to a given index and move all cars to the right up one index
     *
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd the position in the inventory where the new car is added
     * @param carToAdd the new car added into the given position
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        /* IMPLEMENT ME */
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /** Removes a car from inventory and shifting all cars on the right one index down
     *
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell the index of the car that is removed
     * @return the removed car
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        return(inventory.remove(indexOfCarToSell));
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */
    /** Removes a car from inventory and replaces it will a null object
     *
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell the index of the car that is removed
     * @return the removed car
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        return (inventory.set(indexOfCarToSell, null));
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /** Moves a car to a new position within the inventory
     *
     * PRECONDITION: indexOfCarToMove &lt; inventory.size()
     * PRECONDITION: destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove The index of the initial position of the moved car
     * @param destinationIndex The index of the final position of the moved car
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        /* IMPLEMENT ME */
        Car temp = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, temp);
    }

}
