import java.util.Calendar;
import java.util.List;

public class Filters {

    public static void chooseCompany(List<Car> cars, String company) {
        for (Car car : cars) {
            if (car.getCompany().equals(company)) {
                System.out.println(car);
            }
        }
    }


    public static void chooseModelAge(List<Car> cars, String model, int yearsOfWorking) {
        for (Car car : cars) {
            if ((car.getModel().equals(model)) && ((Calendar.getInstance().get(Calendar.YEAR) - car.getYear()) > yearsOfWorking)) {
                System.out.println(car);
            }
        }
    }

    public static void chooseYearPrice(List<Car> cars, int manufactureYear, double price) {
        for (Car car: cars) {
            if ((car.getYear() == manufactureYear) && (car.getPrice() > price)) {
                System.out.println(car);
            }
        }
    }
}