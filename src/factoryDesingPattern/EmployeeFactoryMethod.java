package factoryDesingPattern;

class CustomeException extends Exception{
	
	CustomeException(String msg){
		super(msg);
	}
}


public class EmployeeFactoryMethod {
      
	public static Employee getEmployee(String empType) throws NullPointerException, CustomeException{
		
		if(empType==null) {
			throw new NullPointerException("Employee type can not be null. ");
		}else if(empType.equalsIgnoreCase("BackendDeveloper")) {
			return new BackendDeveloper();
		}else if(empType.equalsIgnoreCase("FrontedDeveloper")) {
			return new FrontedDeveloper();
		}else {
			 throw new CustomeException("You have entered the wrong empType. ");
		}
		
	}
	
}
