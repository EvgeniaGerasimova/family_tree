import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humans;

    public FamilyTree() {
        humans = new ArrayList<>();
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public Human findHuman(String name) {
        for (Human human : humans) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }
}

