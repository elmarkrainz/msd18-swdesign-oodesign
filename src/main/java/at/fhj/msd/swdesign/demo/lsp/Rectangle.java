package at.fhj.msd.swdesign.demo.lsp;

public class Rectangle {

    protected int width;
    protected int heigth;


    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public  int calculateArea()
    {
        return heigth * width;
    }



}
