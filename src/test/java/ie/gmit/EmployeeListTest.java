package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeListTest {

    private EmployeeList employeeList;

    @BeforeEach
    void init(){employeeList = new EmployeeList();}

    @Test
    void testAddEmployee(){
        Employee employee = new Employee("Joey", 12345667, 12345, 23);
        try{
        employeeList.addEmployee(employee);}
        catch(Exception e){}
    }

    @Test
    void testAddNonUniqueEmployee(){
        Employee employee1 = new Employee("Joey", 123456789, 12345, 23);
        Employee employee2 = new Employee("Tommy", 567678789, 12345, 45);
        try{
            employeeList.addEmployee(employee1);
        }catch(Exception e){}

        Exception e = assertThrows(Exception.class, () -> employeeList.addEmployee(employee2));
        assertEquals("Duplicate Employee details found, no object added", e.getMessage());
    }
}
