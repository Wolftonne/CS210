public class Link
{
    public int data;
    public Link next;

    public String name;
    public int age;
    public String degree;
    public int yearOfStudy;

    public Link(String name, int age, String degree, int yearOfStudy)
    {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.yearOfStudy = yearOfStudy;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

    public void setDegree(String degree)
    {
        this.degree = degree;
    }
    public String getDegree()
    {
        return degree;
    }

    public void setyearOfStudy(int year)
    {
        yearOfStudy = year;
    }
    public int getyearOfStudy()
    {
        return yearOfStudy;
    }
}
