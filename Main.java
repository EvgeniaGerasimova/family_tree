import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        // Добавление людей в древо
        Human human1 = new Human("Максим", "01-01-1980", "Мужской");
        Human human2 = new Human("Алиса", "01-01-1985", "Женский");
        Human human3 = new Human("Михаил", "01-01-1975", "Мужской");
        Human human4 = new Human("Эмилия", "01-01-1990", "Женский");
        Human human5 = new Human("Давид", "01-01-1995", "Мужской");

        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        familyTree.addHuman(human4);
        familyTree.addHuman(human5);

        // Добавление детей
        Human child1 = new Human("Никита", "01-01-2010", "Мужской");
        Human child2 = new Human("Кристина", "01-01-2012", "Женский");
        Human child3 = new Human("Петр", "01-01-2015", "Мужской");
        Human child4 = new Human("София", "01-01-2017", "Женский");
        Human child5 = new Human("Яков", "01-01-2019", "Мужской");
        Human child6 = new Human("Милана", "01-01-2020", "Женский");
        Human child7 = new Human("Егор", "01-01-2022", "Мужской");

        human1.addChild(child1);
        human1.addChild(child2);
        human1.addChild(child3);
        human2.addChild(child4);
        human2.addChild(child5);
        human2.addChild(child6);
        human3.addChild(child7);

        // Пользовательский ввод имени человека
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя человека: ");
        String name = scanner.nextLine();

        // Поиск человека и вывод всех его детей
        Human human = familyTree.findHuman(name);
        if (human != null) {
            List<Human> children = human.getChildren();
            if (children.isEmpty()) {
                System.out.println(name + " не имеет детей.");
            } else {
                System.out.println("Дети " + name + ":");
                for (Human child : children) {
                    System.out.println("Имя: " + child.getName() + ", Дата рождения: " + child.getBirthDate() + ", Пол: " + child.getGender());
                }
            }
        } else {
            System.out.println("Человек не найден в генеалогическом древе.");
        }
    }
}
