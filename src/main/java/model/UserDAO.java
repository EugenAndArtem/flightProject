package  model;

import java.sql.SQLException;

/**
 * Created by Артём on 02.03.2016.
 */
public interface UserDAO {
    public void addUser(User user) throws SQLException;
    public void updateUser(int userId, User user) throws SQLException;
    public User getUsertById(int userId) throws SQLException;
    public java.util.List<User> getAllUser() throws SQLException;
    public void deleteUser(User user) throws SQLException;
}
