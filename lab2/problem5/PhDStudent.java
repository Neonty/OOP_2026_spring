package problem5;

public class PhDStudent extends Student {
    private final String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);

        if (researchTopic == null || researchTopic.isBlank()){
            throw new IllegalArgumentException("Research Topic cannot be empty");
        }

        this.researchTopic = researchTopic;
    }

    @Override
    protected boolean canHavePet(Animal pet){
        return !(pet instanceof Dog);
    }

    @Override
    public String getOccupation(){
        return "PhD Student (" + researchTopic + ")";
    }
}