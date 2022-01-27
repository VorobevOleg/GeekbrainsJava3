package task3;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    ArrayList<T> fruitsInBox;

    public Box() {
        this.fruitsInBox = new ArrayList<>();
    }

    public float getWeight () {
        float boxWeight = 0.0f;
        for (int i = 0; i < fruitsInBox.size(); i++) {
            boxWeight += fruitsInBox.get(i).getWeight();
        }
        return boxWeight;
    }

    public boolean compare (Box boxCompare) {
        return Math.abs(this.getWeight()) - boxCompare.getWeight() < 0.001;
    }

    public void putFruitInBox(T fruit) {
        fruitsInBox.add(fruit);
    }

    public void pourInBox (Box<T> boxIn) {
        boxIn.fruitsInBox.addAll(this.fruitsInBox);
        this.fruitsInBox.clear();
    }

}
