package furniture;

import furniture.metalFurniture;
import furniture.woodenFurniture;

public class ChairTable {
    public static void main(String[] args) {
     woodenFurniture wf= new woodenFurniture();
     metalFurniture mt= new metalFurniture();
     wf.fireTest();
     wf.stressTest();
     mt.fireTest();
     mt.stressTest();
    }
}
