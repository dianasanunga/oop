package figures;

public class RectanguleTriangule {
    private int num;

    public RectanguleTriangule() {
    }

    public RectanguleTriangule(int num) {
        this.num = num;
    }
    public void printRectanguleTriangule(){
        System.out.println("----------Printing Rectangule Triangule " + num +"----------");
        for(int height = 0; height < num; height++){
            for(int weight = 0; weight < num; weight++){
                if(weight<=height) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
