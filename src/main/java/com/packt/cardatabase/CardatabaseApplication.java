package com.packt.cardatabase;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {

		SpringApplication.run(CardatabaseApplication.class, args);
		System.out.println("Hello World!");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			//	Place your code here...
			//	Save demo data to database
			carRepository.save(new Car("Ford","Focus","Silver", "SD10ODT", 2010,8600 ));
			carRepository.save(new Car("Volkswagen", "Golf Mark IV", "Black","SH51OTX", 2001, 2000));
			carRepository.save(new Car("Honda", "Civic 1.3", "Silver", "SD61AVJ", 2011, 9000));
			carRepository.save(new Car("Subaru", "XV", "Silver", "SA14CZU", 2014, 11500));
		};
	}


}
