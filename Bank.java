import java.util.Objects;

public class Bank {
    private String name;
    private String location;
    private int numberOfBranches;

    public Bank(String name, String location, int numberOfBranches) {
        this.name = name;
        this.location = location;
        this.numberOfBranches = numberOfBranches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(int numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numberOfBranches=" + numberOfBranches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return numberOfBranches == bank.numberOfBranches &&
                Objects.equals(name, bank.name) &&
                Objects.equals(location, bank.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, numberOfBranches);
    }

    public static void main(String[] args) {
        Bank bank1 = new Bank("ABC Bank", "City A", 10);
        Bank bank2 = new Bank("XYZ Bank", "City B", 15);

        System.out.println(bank1.toString());
        System.out.println("Are the banks equal? " + bank1.equals(bank2));
    }
}
