package Test.com.company;

import model.Address;
import model.Teacher;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    Teacher teacher;

    @org.junit.Before
    public void setUp() throws Exception {
        Address address1 = new Address("Дмитриева", 8);
        Teacher teacher1 = new Teacher("Nik", 36, "Ivanov", address1);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    @Test
    public void  getAmount() {
        Address address1 = new Address("Дмитриева", 8);
        Teacher teacher1 = new Teacher("Nik", 36, "Ivanov", address1);
        int amount = 3;
        int hours = 20;

        teacher1.setAmount(amount);
        teacher1.setHorses(hours);

        int resault = amount * hours;
        int realres = teacher1.getAmount();
        assertEquals(resault, realres);
    }
    @Test
    public void setAgeWithZero() {
        int age = 0;
        Address address1 = new Address("Дмитриева", 8);
        Teacher teacher1 = new Teacher("Nik", 36, "Ivanov", address1);
        teacher1.setAge(0);
        assertTrue(teacher1.getAge() == 36);
    }

        @Test
        public void setAge() {
            int age = 28;
            Address address1 = new Address("Дмитриева", 8);
            Teacher teacher1 = new Teacher("Nik", 36, "Ivanov", address1);
            teacher1.setAge(age);
            assertTrue(teacher1.getAge() == age);

        }

    }

