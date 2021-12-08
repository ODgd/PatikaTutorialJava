package PatikaÖdevleri.Class.OBS;

public class Teacher {

    private String name;
    private String branch;

    Teacher() {
    }

    Teacher(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}