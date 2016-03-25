package aviaTableX;

import javax.persistence.*;

/**
 * Created by Артём on 01.03.2016.
 */
@Entity
@Table(name = "user")
public class UserImpl implements User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nameUser")
    private String nameUser;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    public UserImpl(){}

    public UserImpl(String nameUser, String password, String email){
        this.email = email;
        this.password = password;
        this.nameUser = nameUser;
    }

    public int getId() {
        return id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
