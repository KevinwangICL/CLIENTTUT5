import java.io.Serializable;

public class Patient implements Serializable {
    private String name;
    private int id;
    private int phoneNumber;
    public Patient(String pname, int pid, int pphoneNumber) {
        this.name = pname;
        this.id = pid;
        this.phoneNumber = pphoneNumber;
    }

}
