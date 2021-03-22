package pl.zzpj2021.solid.lsp.shape.solution;

import com.sun.org.apache.bcel.internal.Const;

public class Circle implements Shape {
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        float radius = getRadius();
        return radius * radius * (float) Math.PI;
    }

    public float getRadius() {
        return radius;
    }


}
