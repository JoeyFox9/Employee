package ie.gmit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    List<Employee> employeeList ;

    public EmployeeList(){
            employeeList = new ArrayList<Employee>();
    }


    public void addEmployee(Employee obj) throws Exception{
        boolean unique = true;
        for (Employee employee: employeeList) {
            if (obj.getEmployeeNum() == employee.getEmployeeNum()){
                unique = false;
                throw new Exception("Duplicate Employee details found, no object added");
            }
        }
        if(unique) {
            employeeList.add(obj);
        }
    }

    public int getListSize(){
        return employeeList.size();
    }
}
