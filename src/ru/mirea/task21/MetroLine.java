package ru.mirea.task21;

public class MetroLine {
    private final int numberOfLine;

    private final String name;

    public MetroLine(int numberOfLine, String name) {
        this.numberOfLine = numberOfLine;
        this.name = name;
    }

    public int getNumberOfLine() {
        return numberOfLine;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MetroLine{" +
                "numberOfLine=" + numberOfLine +
                ", name='" + name + '\'' +
                '}';
    }
}
