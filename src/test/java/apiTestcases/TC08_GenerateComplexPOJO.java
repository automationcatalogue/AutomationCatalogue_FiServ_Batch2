package apiTestcases;

import pojos.Address;
import pojos.Contacts;
import pojos.Customer;

import java.util.ArrayList;
import java.util.List;

public class TC08_GenerateComplexPOJO {
    public static void main(String[] args) {
        Customer ob1 = new Customer();
        ob1.setName("John Doe");
        ob1.setAge(30);

        Address ob2 = new Address();
        ob2.setStreet("123 Main St");
        ob2.setCity("Cityville");
        ob2.setZipcode("12345");
        ob1.setAddress(ob2);

        Contacts ob3 = new Contacts();
        ob3.setType("email");
        ob3.setValue("john.doe@example.com");

        Contacts ob4 = new Contacts();
        ob4.setType("phone");
        ob4.setValue("123-456-7890");

        List<Contacts> ob5 =new ArrayList<>();
        ob5.add(ob3);
        ob5.add(ob4);

        ob1.setContactsList(ob5);

        System.out.println(ob1.getName());
        System.out.println(ob1.getAge());
        System.out.println(ob1.getAddress().getCity());
        System.out.println(ob1.getContactsList().get(1).getValue());
    }
}
