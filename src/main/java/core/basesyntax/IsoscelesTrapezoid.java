package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private int lowerSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int lowerSide, int topSide, int height) {
        this.color = color;
        this.lowerSide = lowerSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public int getTopSide() {
        return topSide;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
