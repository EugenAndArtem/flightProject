package aviaTableX;


import model.Type;
import model.TypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Артём on 30.03.2016.
 */
@Service("TypeService")
public class TypeServiceImpl implements ServiceType {
    @Autowired
    TypeDAO typeDAO;

    @Transactional
    public void addType(Type type) throws SQLException {
        typeDAO.addType(type);
    }

    @Transactional
    public Type getInnerType() throws SQLException {
        return typeDAO.geInnerType();
    }

    @Transactional
    public Type getWorldType() throws SQLException {
        return typeDAO.getWorldType();
    }

    @Transactional
    public List<Type> getAllType() throws SQLException {
        return typeDAO.getAllType();
    }

    @Transactional
    public void deleteType(Type type) throws SQLException {
        typeDAO.deleteType(type);
    }
}
