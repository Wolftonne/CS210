public class Link
{
    String name;
    int age;
    String degree;
    int yearOfStudy;
    Link next; //pointer to the next node in the list

    public Link(String name, int age, String degree, int yearOfStudy) //constructor
    {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.yearOfStudy = yearOfStudy;
        this.next = null;
    }

    public String toString()
    {
        return name + ", " + age + ", " + degree + ", " + yearOfStudy;
    }
}
