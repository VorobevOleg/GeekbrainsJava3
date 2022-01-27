package task3;

public class Main {
    public static void main(String[] args) {

        Box<Apple> boxApple1 = new Box<>();     // коробка 1
        Box<Apple> boxApple2 = new Box<>();     // коробка 2
        Box<Orange> boxOrange1 = new Box<>();   // коробка 3

        boxApple1.putFruitInBox(new Apple());
        boxApple1.putFruitInBox(new Apple());
        boxApple1.putFruitInBox(new Apple());

        boxApple2.putFruitInBox(new Apple());
        boxApple2.putFruitInBox(new Apple());

        boxOrange1.putFruitInBox(new Orange());
        boxOrange1.putFruitInBox(new Orange());

        System.out.println("Вес нетто в коробке 1: " + boxApple1.getWeight());
        System.out.println("Вес нетто в коробке 2: " + boxApple2.getWeight());
        System.out.println("Вес нетто в коробке 3: " + boxOrange1.getWeight());

        System.out.println("Вес нетто в коробках 1 и 3 равный: " + boxApple1.compare(boxOrange1));

        System.out.println("Пересыпаем из 1 коробки во 2: " + boxApple1.pourInBox(boxApple2));

        System.out.println("Вес нетто во 2 коробке после пересыпания в нее из 1: " + boxApple2.getWeight());
        System.out.println("Вес нетто в 1 коробке после пересыпания из нее во 2: " + boxApple1.getWeight());

    }
}
