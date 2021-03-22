package pl.zzpj2021.solid.lsp.shape.violation;

public class Square extends Rectangle{
    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        super.setWidth(height);
    }
    @Override
    public void setWidth(float width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}
