public class Student
{
    private static final int initialYear = 1;

    private final String name;
    private final int id;
    private int yearOfStudy;

    public Student(String nameValue, int idValue)
    {
        if (nameValue == null || nameValue.isBlank())
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (idValue <= 0)
        {
            throw new IllegalArgumentException("Id must be positive");
        }

        this.name = nameValue;
        this.id = idValue;
        this.yearOfStudy = initialYear;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    public int getYear()
    {
        return this.yearOfStudy;
    }

    public void incrementYear()
    {
        this.yearOfStudy++;
    }
}