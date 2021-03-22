package pl.zzpj2021.solid.lsp.shape.violation;

public class Rectangle {
    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float area()
    {
        return height*width;
    }
}
