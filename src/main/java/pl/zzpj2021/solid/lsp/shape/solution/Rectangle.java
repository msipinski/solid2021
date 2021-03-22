package pl.zzpj2021.solid.lsp.shape.solution;

public class Rectangle implements Shape {
    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float area() {
        return getWidth()*getHeight();
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

}
