package org.medmota.demo.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.medmota.demo.entities.Car;
import org.medmota.demo.repositories.ICarRepository;


@Named
@ViewScoped
public class CarManagedBean implements Serializable {

	@Inject
	private ICarRepository carRepository;

	private List<Car> cars;

	@PostConstruct
	public void init() {
		cars = carRepository.findAll();
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
