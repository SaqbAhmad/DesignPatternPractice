package builderDesign.car;

public class CarBuilderImpl implements CarBuilder {
	private Car car;

	public CarBuilderImpl() {
		this.car = new Car();
	}

	@Override
	public CarBuilder setEngine(String engine) {
		car.setEngine(engine);
		return this;
	}

	@Override
	public CarBuilder setWheels(String wheels) {
		car.setWheels(wheels);
		return this;
	}

	@Override
	public CarBuilder setPaint(String paint) {
		car.setPaint(paint);
		return this;
	}

	@Override
	public CarBuilder setSeats(String seats) {
		car.setSeats(seats);
		return this;
	}

	@Override
	public Car build() {
		// TODO Auto-generated method stub
		return this.car;
	}

}
