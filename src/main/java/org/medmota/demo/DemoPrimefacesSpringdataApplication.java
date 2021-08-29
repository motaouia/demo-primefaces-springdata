package org.medmota.demo;

import org.medmota.demo.repositories.ICarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPrimefacesSpringdataApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(DemoPrimefacesSpringdataApplication.class);
	@Autowired
	private ICarRepository carRepostory;

	public static void main(String[] args) {
		SpringApplication.run(DemoPrimefacesSpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		//You can decoment this Save Instructions if you do no want use the data.sql file
		/*carRepostory.save(new Car("Audi", 1992, "Red"));
		carRepostory.save(new Car("Fiat", 2001, "White"));
		carRepostory.save(new Car("Mercedes", 1991, "Black"));
		carRepostory.save(new Car("Renault", 1997, "Brown"));
		carRepostory.save(new Car("Renault", 1967, "Maroon"));
		*/

		
		carRepostory.findAll().forEach(c -> {
			logger.info(c.getBrand());
		});
	}

}
