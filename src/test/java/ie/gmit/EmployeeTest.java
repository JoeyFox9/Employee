package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee e1;

//    @BeforeEach
//    void init(){e1 = new Employee("Joey", 07676767676, 12345,21);}


    @Test
    void testConstructorNameFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("j",55554444, 12345,21));
        assertEquals("invalid name error", e.getMessage());
    }

    @Test
    void testConstructorPhoneNumFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Joey",554, 12345,21));
        assertEquals("invalid phone number error", e.getMessage());
    }

    @Test
    void testConstructorEmployeeNumFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Joey",74674699, 124456,21));
        assertEquals("Employee Number should be 5 digits", e.getMessage());
    }

    @Test
    void testConstructorAgeFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Joey",12345678, 12345,14));
        assertEquals("Age must be over 16", e.getMessage());
    }
}
