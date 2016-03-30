package aviaTableX;

import java.sql.SQLException;

/**
 * Created by Артём on 30.03.2016.
 */
public interface ServiceType {
    public void addType(Type type) throws SQLException;
    public Type getInnerType() throws SQLException;
    public Type getWorldType() throws SQLException;
    public java.util.List<Type> getAllType() throws SQLException;
    public void deleteType(Type type) throws SQLException;
}
