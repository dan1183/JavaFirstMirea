package ru.mirea.task19;

public class RectangularTriangle {
    private final int firstAngle;
    private final int secondAngle;
    private final int thirdAngle;

    public RectangularTriangle(int firstAngle, int secondAngle, int thirdAngle) throws TriangleBadAnglesException {
        if (firstAngle != 90 && secondAngle != 90 && thirdAngle != 90) {
            throw new TriangleBadAnglesException("A triangle is not right if it does not have an angle of 90");
        }
        if (firstAngle + secondAngle + thirdAngle != 180) {
            throw new TriangleBadAnglesException("The sum of the angles of a triangle must be 180");
        }
        if (firstAngle <= 0 || secondAngle <= 0 || thirdAngle <= 0) {
            throw new TriangleBadAnglesException("One of the angles is less than or equal to 0");
        }
        this.firstAngle = firstAngle;
        this.secondAngle = secondAngle;
        this.thirdAngle = thirdAngle;
    }

    public int getFirstAngle() {
        return firstAngle;
    }

    public int getSecondAngle() {
        return secondAngle;
    }

    public int getThirdAngle() {
        return thirdAngle;
    }
}
