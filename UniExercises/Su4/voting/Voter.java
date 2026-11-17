package Su4.voting;

public class Voter {
    private final String name;
    private final String city;
    private final String egn;

    public Voter(String name, String city, String egn) {
        this.name = name;
        this.city = city;
        this.egn = egn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", egn='" + egn + '\'' +
                '}';
    }
}
