public class Student{
    private String name;
    private int rollno;
    private int standard; 

    public Student(){

    }
    
    public Student(String name, int rollno, int standard){
        // this.name = name;
        // this.rollno =  rollno;
        // this.standard = standard;

        setName(name);
        setRollNo(rollno);
        setStandard(standard);
    }
    
    // GETTERS
    public String getName(){
        return this.name;
    }

    public int getRollNo(){
        return this.rollno;
    }

    public int getStandard(){
        return this.standard;
    }

    // SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setRollNo(int rollno){
        this.rollno = rollno;
    }

    public void setStandard(int standard){
        this.standard = standard;
    }
}