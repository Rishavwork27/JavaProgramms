package Inheritance;

public class Programs {
    int car = 90;
    int bike=5;
    int cycle=5;
}

class Add extends Programs{
    static String cars="";
    public static void main(String[] args){
        Add add = new Add();
        //System.out.println(add.car+add.bike+add.cycle);
        cars= String.valueOf(add.car + add.bike + add.cycle);
        System.out.println(cars);
    }


}