package at.fhj.msd.swdesign.demo.lsp;

public class LSPSquare implements Shape {

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int calculateArea() {
        return size * size;
    }
}
