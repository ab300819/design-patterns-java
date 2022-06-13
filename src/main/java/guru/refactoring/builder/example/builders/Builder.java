package guru.refactoring.builder.example.builders;

import guru.refactoring.builder.example.cars.CarType;
import guru.refactoring.builder.example.components.Engine;
import guru.refactoring.builder.example.components.GPSNavigator;
import guru.refactoring.builder.example.components.Transmission;
import guru.refactoring.builder.example.components.TripComputer;

/**
 * EN: Builder interface defines all possible ways to configure a product.
 *
 * RU: Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
