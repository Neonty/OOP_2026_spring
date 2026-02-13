package Lab1;

enum Gender{
    boy,
    girl
}

class Person{
    private Gender gender;
    public Person(Gender gender){
        this.gender = gender; 
    }

    public Gender getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return this.gender == Gender.boy ? "B" : "G";
    }
}