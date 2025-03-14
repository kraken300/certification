public class Student {
    private int id;
    private String name;
    private int age;
    static String scholl = "St.Joseph Convent School";

    public Student() {

    }

    public Student(int id, String name, int age) throws StudentAgeException {
        setID(id);
        setName(name);
        setAge(age);
    }

    // GETTERS
    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // SETTERS
    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws StudentAgeException {

        // DATA VALIDATION
        if (age > 0) {
            this.age = age;
        } 
        else {
            throw new StudentAgeException();
        }
    }

    public void study() {
        System.out.println(this.name + " is studying");
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
}
