package model;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class UserData {
    Faker faker =  new Faker();
    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = fakeValuesService.bothify("?????###@mail.com");
    String userBirthDay = "31";
    String userBirthMonth = "31";
    String userBirthYear = "1960";
    String userCitizenship = "Индия";

    public String getUserBirthMonth() {
        return userBirthMonth;
    }

    public String getUserCitizenship() {
        return userCitizenship;
    }

    public String getUserBirthDay() {
        return userBirthDay;
    }

    public String getUserBirthYear() {
        return userBirthYear;
    }

    public String getUserPhone() {
        return userPhone;
    }

    String userPhone = fakeValuesService.regexify("[0-9]{8}");

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
