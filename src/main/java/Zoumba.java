import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *  Main class
 *
 */

public class Zoumba {

    static private int objCount = 0;
    private String name = "";
    private int size = 0;


    public Zoumba(String name, int size) {
        this.size = size;
        this.name = name;
        Zoumba.objCount++;
    }

    @Override
    public String toString() {
        return "Zoumba{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Zoumba zoubaObj = new Zoumba("Zom Coco", 12);
        System.out.println(" Object == " + zoubaObj.toString());
    }

}
