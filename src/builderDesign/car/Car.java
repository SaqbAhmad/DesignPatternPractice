package builderDesign.car;

public class Car {
	private String engine;
	private String wheels;
	private String seats;
	private String paint;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getWheels() {
		return wheels;
	}
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getPaint() {
		return paint;
	}
	public void setPaint(String paint) {
		this.paint = paint;
	}
	@Override
	public String toString() {
		return "Product [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats + ", paint=" + paint + "]";
	}
	
	
}
