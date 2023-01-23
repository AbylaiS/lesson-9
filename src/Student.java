public class Student {
    private String name;
    private String id;
    private String years;

    public Student() {
        name = "Алиса";
        id = "24";
        years = "2020";
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public String getYears() {
        return years;
    }

    public void SetName(String newName) {
        this.name = newName;
    }

    public void setId(String newId) {
        this.id = id;
    }

    public void SetYears(String newYears) {
        this.years = years + 1;
    }
}
