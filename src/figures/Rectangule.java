package figures;

public class Rectangule {
    private int width;
    private int height;

    public Rectangule() {
    }

    public Rectangule(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printRectangule(){
        System.out.println("-----Printing Rectangule " + width + " x " + height + " -----");
        for(int i = 0; i < height; i++){
            for(int h = 0; h < width; h++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void  printPerimeter(){
        double perimeter = (width * 2) * (height * 2);
        System.out.println("Rectangule Perimeter: " + perimeter + "[cm]");
    }
    public void printArea(){
        double area = width * height;
        System.out.println("Rectangule Area: " + area + "[cm2]");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
