import java.util.Locale;
import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return String.format(Locale.US,"Actor{name='%s', surname='%s', gender=%s, height=%.1f}",
                name, surname, gender, height);
    }

    public void printActor() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;

        return (Double.compare(height, actor.height) == 0) &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                Objects.equals(gender, actor.gender);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash = hash + name.hashCode();
        }
        hash = hash * 31;

        if (surname != null) {
            hash = hash + surname.hashCode();
        }
        hash = hash * 31;

        if (gender != null) {
            hash = hash + gender.hashCode();
        }
        hash = hash * 31 + Double.hashCode(height);

        return hash;
    }
}
