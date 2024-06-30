import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String birthDate;
    private String gender;
    private List<Human> children;

    public Human(String name, String birthDate, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public List<Human> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }
}


