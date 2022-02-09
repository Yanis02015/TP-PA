public class Etudiant {
    private String name;
    private String lastname;

    public Etudiant(String name, String lastname) {
        setName(name);
        setLastname(lastname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String fullName() {
        return name + " " + lastname;
    }
}
