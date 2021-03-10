package ie.gmit;

public class Employee {

    private String name;
    private long phone;
    private long employeeNum;
    private int age;

    public Employee(String name, long phone, long employeeNum, int age){

        if((name.length()>3) && (name.length() < 25)){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("invalid name error");
        }

        if (String.valueOf(phone).length() >= 8){
            this.phone = phone;
        }
        else{ throw new IllegalArgumentException("invalid phone number error");}

        this.employeeNum = employeeNum;

        if(age > 16) {
            this.age = age;
        }
        else{ throw new IllegalArgumentException("Age must be over 16");}

    }
}
