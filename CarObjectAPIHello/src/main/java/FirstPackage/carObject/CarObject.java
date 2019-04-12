package FirstPackage.carObject;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarObject {
	
	@Autowired
	private CarService carService;
	
	
	@RequestMapping("/hello")
	public List<CarDetails> getAllCar() 
		{
		
		return carService.getAllCar();
		}
	
	@RequestMapping("/hello/{id}")
	public CarDetails getCar(@PathVariable String id) {
		return carService.getCar(id);
	}
	

}

