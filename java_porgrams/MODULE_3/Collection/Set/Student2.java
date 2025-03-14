public class Student2 implements Comparable {
    private int roll;
    private String name;

    public Student2() {

    }

    public Student2(int roll, String name) {
        setRoll(roll);
        setName(name);
    }

    // GETTERS
    public int getRoll() {
        return this.roll;
    }

    public String getName() {
        return this.name;
    }

    // SETTERS
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roll;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Student2 other = (Student2) obj;
        if (roll != other.roll)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Student2 s = (Student2) o;

        if (this.getRoll() < s.getRoll()) {
            return -1;
        } else if (this.getRoll() == s.getRoll()) {
            return 0;
        } else {
            return 1;
        }
    }
}
