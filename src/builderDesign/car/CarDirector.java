package builderDesign.car;

public class CarDirector {

	public CarBuilder builder;
	
	public CarDirector(CarBuilder builder) {
		this.builder = builder;
	}
	
	public Car constructSportsCar() {
		return builder.setEngine("V8")
				      .setWheels("18 inch")
				      .setSeats("Leather")
				      .setPaint("Red")
				      .build();
	}
	
	public Car constructSUV() {
		return builder.setEngine("V6")
				      .setWheels("20 inches")
				      .setSeats("Fabric")
				      .setPaint("Black")
				      .build();
	}
	
	public Car constructI20() {
		return builder.setEngine("v7")
				      .setWheels("15 inches")
				      .setPaint("Blue")
				      .build();
	}
	
	
	
	
}
