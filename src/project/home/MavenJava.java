package project.home;

public class MavenJava {

    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MavenJava(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }


}
