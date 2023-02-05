public class Student {
    private String name;
    private String id;
    private int years;

    public Student() {
        name = "Алиса";
        id = "24";
        years = Integer.parseInt("2020");
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public int getYears() {
        return years;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setId(String newId) {
        this.id = id;
    }
    public void incrementYears(){
        this.years++;
    }
}
