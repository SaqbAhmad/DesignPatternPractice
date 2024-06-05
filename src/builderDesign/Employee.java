package builderDesign;

public class Employee {
       
	private String name;
    private String company;
    private boolean hasCar;//optional
    private boolean hasBike;//optional
	public Employee(String name, String company, boolean hasCar, boolean hasBike) {
		super();
		this.name = name;
		this.company = company;
		this.hasCar = hasCar;
		this.hasBike = hasBike;
	}
	public Employee(EmployeeBuilderClass employeeBuilderClass) {
		this.name = employeeBuilderClass.name;
		this.company = employeeBuilderClass.company;
		this.hasBike = employeeBuilderClass.hasBike;
		this.hasCar = employeeBuilderClass.hasCar;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public boolean isHasCar() {
		return hasCar;
	}
	public boolean isHasBike() {
		return hasBike;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + ", hasCar=" + hasCar + ", hasBike=" + hasBike + "]";
	}

	public static class EmployeeBuilderClass {
		private String name;
	    private String company;
	    private boolean hasCar;//optional
	    private boolean hasBike;//optional
	    
	    
		public EmployeeBuilderClass(String name, String company) {
			super();
			this.name = name;
			this.company = company;
		}
		public void setHasCar(boolean hasCar) {
			this.hasCar = hasCar;
		}
		public void setHasBike(boolean hasBike) {
			this.hasBike = hasBike;
		}
	    
        public Employee build() {
            return new Employee(this);
        }

	    
	}
	
}
