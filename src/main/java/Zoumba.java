import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *  Main class
 *
 */

public class Zoumba {

    static private int objCount = 0;
    private String name = "";
    private int size = 0;
    private int nType = 1;


    public Zoumba(String name, int size, int type) {
        Zoumba.objCount++;

        this.size = size;
        this.name = name;
        this.nType = type;
    }

    @Override
    public String toString() {
        return "Zoumba{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", nType=" + nType +
                '}';
    }

    public static void main(String[] args) {
        Zoumba zoubaObj = new Zoumba("Zom Coco", 12, 150);
        System.out.println(" Object == " + zoubaObj.toString());
    }

}
