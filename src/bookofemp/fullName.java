package bookofemp;

public class fullName {
    private String name;
    private String surname;
    private String midname;

    public fullName(String name, String surname, String midname) {
        this.name = name;
        this.surname = surname;
        this.midname = midname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getMidname() {
        return midname;
    }

    @Override
    public String toString() {
        return "fullName{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                '}';
    }
}
