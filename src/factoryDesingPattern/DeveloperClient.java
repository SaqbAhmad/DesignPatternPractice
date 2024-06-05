package factoryDesingPattern;

public class DeveloperClient {

	public static void main(String[] args) {
        try {
        	Employee emp1 = EmployeeFactoryMethod.getEmployee("FrontedDeveloper");
    		System.out.println(emp1.salary());
    		Employee emp2 = EmployeeFactoryMethod.getEmployee("BackendDeveloper");
    		System.out.println(emp2.salary());
    		Employee emp4 = EmployeeFactoryMethod.getEmployee(null);
    		System.out.println(emp4.salary());
    		Employee emp3 = EmployeeFactoryMethod.getEmployee("FullStack");
    		System.out.println(emp3.salary());
    		

        }catch(NullPointerException e) {
        	System.out.println("NullPointerException is caught: " + e.getMessage());
        }catch(CustomeException e) {
        	System.out.println("CustomeException is caught: " + e.getMessage());
        }
		

	}

}
