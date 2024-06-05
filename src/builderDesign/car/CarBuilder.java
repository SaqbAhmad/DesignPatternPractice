package builderDesign.car;

public interface CarBuilder {
   
	CarBuilder setEngine(String engine);
	CarBuilder setWheels(String wheels);
	CarBuilder setPaint(String paint);
	CarBuilder setSeats(String seats);
	Car build();
	
}
