package pl.zzpj2021.solid.lsp.shape.violation;

public class Circle extends Square{
    @Override
    public float area() {
        return super.area() * (float) Math.PI;
    }
}
