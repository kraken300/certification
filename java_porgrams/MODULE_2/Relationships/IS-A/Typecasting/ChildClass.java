public class ChildClass extends ParentClass{
    
    // @Override
    // public ChildClass captaincy(){
    //     System.out.println("KOHLI is KING");
    //     return new ChildClass();
    // }

    @Override
    public GrandChildClass captaincy(){
        System.out.println("KOHLI is KING");
        return new GrandChildClass();
    }

    // For non-primitve typecasting, there must be an IS-A Relationship between classes

    // @Override
    // public ParentClass captaincy(){
    //     System.out.println("KOHLI is KING");
    //     return new ParentClass();
    // }
}
