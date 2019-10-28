package at.fhj.msd.swdesign.demo.lsp;

public class LSP_Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeigth(4);
        rectangle.setWidth(6);
        System.out.print("Rectangle 4x6, area:");
        System.out.println(rectangle.calculateArea());


        Rectangle square = new Square();
        square.setWidth(4);
        System.out.print("Square 4x4, area:");
        System.out.println(square.calculateArea());


        // PROBLEM - violation of LSP

        Rectangle someRectangle = square;
        someRectangle.setWidth(4);
        someRectangle.setHeigth(6);

        System.out.print("Some rectangle 4x6, area:");
        System.out.println(someRectangle.calculateArea());


        // Solution - interface

        LSPRectangle newRectangle = new LSPRectangle();
        newRectangle.setHeigth(4);
        newRectangle.setWidth(6);

        LSPSquare newSquare = new LSPSquare();
        newSquare.setSize(4);

        Shape lspShape = newRectangle;
        System.out.println("LSP rectangle: " + lspShape.calculateArea());

        lspShape = newSquare;
        System.out.println("LSP square: " + lspShape.calculateArea());


    }
}
