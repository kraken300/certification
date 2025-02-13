public class GrandChildClass extends ChildClass{

    @Override
    public GrandChildClass captaincy(){
        System.out.println("ROHIT is HITMAN");
        return new GrandChildClass();
    }
}
