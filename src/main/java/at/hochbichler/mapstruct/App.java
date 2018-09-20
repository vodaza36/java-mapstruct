package at.hochbichler.mapstruct;
import org.mapstruct.factory.Mappers;

public class App {
    public static void main(String[] args) {
        Car car = createCar();
        CarDTO carDTO = convert(car);
        System.out.println("Car: " + carDTO);
    }

    private static CarDTO convert(Car car) {
        CarMapper mapper = Mappers.getMapper(CarMapper.class);
        return mapper.carToCarDto(car);
    }

    private static Car createCar() {
        Car car= new Car();
        car.setMake("VW");
        car.setNumberOfSeats(5);
        car.setType(CarType.COMBI);
        return car;
    }
}
