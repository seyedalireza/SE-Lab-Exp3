public class Rectangle implements Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int computeArea() {
        return height * width;
    }

    public Rectangle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getWidth() {
        return width;
    }
}
