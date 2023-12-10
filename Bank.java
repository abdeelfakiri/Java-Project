import java.util.Objects;

public class Bank implements Cloneable , Comparable<Bank> {
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
    public Bank clone() {
        try {
            return (Bank) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should not happen since Bank implements Cloneable
            throw new InternalError(e);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, numberOfBranches);
    }
    @Override
    public int compareTo(Bank otherBank) {       
        return Integer.compare(this.numberOfBranches, otherBank.numberOfBranches);      
    }
    
    public static void main(String[] args) {
        Bank bank1 = new Bank("ABC Bank", "City A", 10);
        Bank bank2 = new Bank("XYZ Bank", "City B", 15);

        System.out.println(bank1.toString());
        System.out.println("Are the banks equal? " + bank1.equals(bank2));
        
        int result = bank1.compareTo(bank2);

        if (result < 0) 
            System.out.println(bank1.getName() + " is less than " + bank2.getName());
        if (result > 0) 
            System.out.println(bank1.getName() + " is greater than " + bank2.getName());
        if(result == 0)
            System.out.println(bank1.getName() + " is equal to " + bank2.getName());
        
    }
}