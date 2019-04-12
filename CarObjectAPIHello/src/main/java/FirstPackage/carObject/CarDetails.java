package FirstPackage.carObject;

public class CarDetails {

	private String id;
	private String manufacturer;
	private String name;

	
	public CarDetails() {
		
	}
	
	
	public CarDetails(String id, String manufacturer, String name) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
