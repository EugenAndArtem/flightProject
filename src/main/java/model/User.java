package model;

/**
 * Created by Артём on 01.03.2016.
 */
public interface User {
    int getId();
    String getNameUser();
    String getPassword();
    String getEmail();
    void setId(int id);
    void setNameUser(String nameUser);
    void setPassword(String password);
    void setEmail(String email);
}
