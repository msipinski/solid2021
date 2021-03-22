package pl.zzpj2021.solid.lsp.shape.solution;

public class Square implements Shape {
    private final float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float area() {
        float side = getSide();
        return side*side;
    }

    public float getSide() {
        return side;
    }

}
