package OOTechnieken.Week5.BoekOpdrachten.OpdrachtTwee;

public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private double weight;
    private int length;

    public Person(String firstName, String lastName, String gender, int age, double weight, int length) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // functions

    @Override
    public String toString(){
        return String.format("Naam: %s %s Gender: %s Leeftijd: %d Lengte: %d Gewicht %f",getFirstName(),getLastName(),getGender(),getAge(),getLength(),getWeight());
    }

    @Override
    public int hashCode() {
        int hash = 31;
        for (int i = 0; i < firstName.length(); i++) {
            hash = hash *31 + (int)firstName.charAt(i);
        }
        for (int i = 0; i < lastName.length(); i++) {
            hash = hash * 31 + (int)lastName.charAt(i);
        }
        for (int i = 0; i < gender.length(); i++) {
            hash = hash * 31 + (int)gender.charAt(i);
        }
        hash = hash * age * length * (int)weight;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.hashCode() == this.hashCode()) return true;
        else return false;
    }
}
