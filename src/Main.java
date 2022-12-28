public class Main {
    public static void main(String[] args) {
        Extended thing = new Extended("Roger", 25, "Manager");
        thing.getDetails();

        ExtendAbstract thing2 = new ExtendAbstract();
        System.out.println();
        thing2.doStuff();
    }


}