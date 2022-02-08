import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String []args){
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);
        Car car1 = new Car("Honda", 200);
        Car car2 = new Car("Highlander", 3000);
        Car car3 = new Car("Batmobile", 12000);
        Car car4 = new Car("Jeep", 50000);
        Car[] carsArray = {car1, car2, car3, car4};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.println(carList);
    }

}
