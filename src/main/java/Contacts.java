import java.io.File;
import java.io.IOException;

public class Contacts {



    private final String name;
    private final String number;



    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
