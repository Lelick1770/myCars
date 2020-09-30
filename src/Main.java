import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car(1, "Tesla", "S", 2012, "white", 100, "DK0102"),
                new Car(2, "BMW", "M", 2010, "black", 50, "NS0401"),
                new Car(3, "Mazda", "Z", 2014, "green", 60, "OK0312"),
                new Car(4, "BMW", "B", 2011, "grey", 55, "IK1305"),
                new Car(5, "BMW", "M", 2010, "pink", 50, "IF2607")
        );
        System.out.println("Filter the cars with manufacturer company");
        Filters.chooseCompany(cars, "BMW");
        System.out.println("Filter the cars with model and years of working");
        Filters.chooseModelAge(cars, "M", 8);
        System.out.println("Filter the cars with manufacture year and price");
        Filters.chooseYearPrice(cars, 2010, 49);
    }
}
