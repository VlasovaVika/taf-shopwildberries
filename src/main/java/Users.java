import by.itacademy.vlasova.users.User;
import com.github.javafaker.Faker;

public class Users {
    public static User getUser() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), faker.internet().password());
    }
}
