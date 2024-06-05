package builderDesignPattern2;

public class Mobile {
   
	private String name;
	private String color;
	private String processor;
	private String ram;
	
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getProcessor() {
		return processor;
	}
	public String getRam() {
		return ram;
	}
	
	private Mobile(MobileBuilder mb) {
		this.name=mb.name;
		this.color=mb.color;
		this.processor=mb.processor;
		this.ram = mb.ram;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", processor=" + processor + ", ram=" + ram + "]";
	}
	
	public static class MobileBuilder{
		// Required Parameter
		private String name;
		private String color;
		// Optional parameter
		private String processor;
		private String ram;
		
		public MobileBuilder(String name, String color) {
			this.name = name;
			this.color = color;
		}
		
		public MobileBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public MobileBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		
		public Mobile build() {
			return new Mobile(this);
		}
		
	}
	
}
