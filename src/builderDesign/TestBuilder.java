package builderDesign;

public class TestBuilder {
    public static void main(String[] args) {
    	
        Employee employee = new Employee.EmployeeBuilderClass("Rahul", "Moglix").build();
        System.out.println(employee.toString());

    }
}
