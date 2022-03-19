package homeworks.hw4;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Fruit {
    private float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {
    static final float weight = 1.0f;

    public Apple() {
        super(weight);
    }
}

class Orange extends Fruit {
    static final float weight = 1.5f;

    public Orange() {
        super(weight);
    }
}

class Box<T extends Fruit> {
    private ArrayList<T> aList;

    public Box() {
        this.aList = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.aList = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        if (aList.size() == 0) return 0.0f;
        return aList.get(0).getWeight() * aList.size();
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void add(T fruit) {
        aList.add(fruit);
    }

    public void replace(Box<T> another) {
        if (this == another) return;
        another.aList.addAll(this.aList);
        this.aList.clear();
    }

    public void info() {
        String type;
        if (aList.size() == 0) type = "empty";
        else type = aList.get(0).getClass().getSimpleName();
        System.out.println("Type: " + type + " quantity: " + aList.size() + " weight: " + getWeight());
    }
}

