package furniture;

abstract class furniture {
    public void stressTest(){}
    public void fireTest(){}

}
class woodenFurniture extends furniture{
    public void stressTest(){
        System.out.println("wooden chair table pass the stress test!!");
    }
    public void fireTest(){
        System.out.println("wooden chair table fail the fire test!!");
    }
}

class metalFurniture extends furniture{
    public void stressTest(){
        System.out.println("metal chair table pass the stress test!!");
    }
    public void fireTest(){
        System.out.println("metal chair table pass the fire test!!");
    }
}
