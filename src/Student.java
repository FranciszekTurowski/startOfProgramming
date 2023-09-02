import java.util.Objects;

public class Student {

    String name;
    int wiek;

    public Student(String name, int wiek) {
        this.name = name;
        this.wiek = wiek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wiek);
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj)
           return true;
       if(obj == null)
           return false;
       return false;

    }
}
