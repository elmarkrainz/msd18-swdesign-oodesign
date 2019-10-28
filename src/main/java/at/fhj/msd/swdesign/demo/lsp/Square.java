package at.fhj.msd.swdesign.demo.lsp;

public class Square  extends  Rectangle{

    @Override
    public void setHeigth(int heigth) {
        super.setHeigth(heigth);
        this.width=heigth;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        this.heigth=width;
    }



}
