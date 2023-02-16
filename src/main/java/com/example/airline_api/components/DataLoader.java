package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;
    //Inject The Two Repositories.

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //Passengers
        Passenger passenger1 = new Passenger("Samantha", "sam@gmail.com");
        passengerRepository.save(passenger1);

        Passenger passenger2 = new Passenger("Erin", "erin@gmail.com");
        passengerRepository.save(passenger2);

        Passenger passenger3 = new Passenger("Alice", "alice@gmail.com");
        passengerRepository.save(passenger3);

        Passenger passenger4 = new Passenger("Joe", "joe@gmail.com");
        passengerRepository.save(passenger4);



        //Flights
        Flight flight1 = new Flight("Scotland", 400, "17-02-2023", "10:00");
        flight1.addPassenger(passenger1);
        flightRepository.save(flight1);

        Flight flight2 = new Flight("Barcelona", 100, "19-07-2023", "22:30");
        flight2.addPassenger(passenger1);
        flightRepository.save(flight2);

        Flight flight3 = new Flight("Marrakech", 200, "26-07-2024", "09:45");
        flight3.addPassenger(passenger2);
        flightRepository.save(flight3);

        Flight flight4 = new Flight("Bangladesh", 800, "28-06-2023", "13:00");
        flight4.addPassenger(passenger2);
        flightRepository.save(flight4);

    }

    //Other Notes
    //Data Loader - objects are automatically created and inserted into the database.
}
