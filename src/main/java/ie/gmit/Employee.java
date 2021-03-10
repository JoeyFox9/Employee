package ie.gmit;

public class Employee {

    private String name;
    private long phone;
    private long employeeNum;
    private int age;

    public Employee(String name, long phone, long employeeNum, int age){

        setName(name);
        setPhone(phone);
        setEmployeeNum(employeeNum);
        setAge(age);

    }
    private void setName(String name){
        if((name.length()>3) && (name.length() < 25)){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("invalid name error");
        }
    }
    private void setPhone(long phone){
        int phoneLength = String.valueOf(phone).length();
        if (phoneLength >= 8){
            this.phone = phone;
        }
        else{ throw new IllegalArgumentException("invalid phone number error");}
    }

    private void setEmployeeNum(long employeeNum){
        int employeeNumLength = String.valueOf(employeeNum).length();
        if(employeeNumLength == 5) {
            this.employeeNum = employeeNum;
        }
        else { throw new IllegalArgumentException("Employee Number should be 5 digits");}
    }

    private void setAge(int age){
        if(age > 16) {
            this.age = age;
        }
        else{ throw new IllegalArgumentException("Age must be over 16");}
    }

    public long getEmployeeNum(){
        return employeeNum;
   }
}
