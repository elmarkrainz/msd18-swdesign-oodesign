package at.fhj.msd.swdesign.demo.lsp;

public class LSPRectangle implements Shape {

    private int width;
    private int heigth;


    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int calculateArea() {
        return width * heigth;
    }
}
