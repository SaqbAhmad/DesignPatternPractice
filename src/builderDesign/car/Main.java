package builderDesign.car;

public class Main {

	public static void main(String[] args) {
        
		CarBuilder builder = new CarBuilderImpl();
		CarDirector director = new CarDirector(builder);
		
		Car sportsCar = director.constructSportsCar();
		
		System.out.println("The sports car is : " +sportsCar);
		
		Car suvCar = director.constructSUV();
		
		System.out.println("The SUV car is : " + suvCar);
		
		Car i20 = director.constructI20();
		
		System.out.println("The I20 car is : " +i20);
		
		
		
		
	}

}
