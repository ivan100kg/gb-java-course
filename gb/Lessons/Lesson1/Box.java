package Lessons.Lesson1;

public class Box {
    String color;
    int size;

    Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Box anotherBox)) return false;
        return size == anotherBox.size && color.equals(anotherBox.color);
    }

    @Override
    public int hashCode() {
        return color.length()*13+size*71;
    }

}
