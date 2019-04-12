package FirstPackage.carObject;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarService {

	private List<CarDetails> car= Arrays.asList(
			
			new CarDetails("car","Ford","Figo" ),
			new CarDetails("nocar","Honda","City" ),
			new CarDetails("noncar","Maruti","Swift" ));
	
	
	public List<CarDetails> getAllCar(){
		return car;
		
	}
	
	public CarDetails getCar(String id) {
		return car.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}
}
