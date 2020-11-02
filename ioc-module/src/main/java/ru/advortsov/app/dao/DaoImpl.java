package ru.advortsov.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.advortsov.app.service.IService;

/**
 * DaoImpl.
 *
 * @author Aleksandr_Dvortsov
 */
@Component
public class DaoImpl implements IDao {

    private IService iService;

    @Autowired
    public void setiService(IService iService) {
        this.iService = iService;
    }

    @Override
    public String findString() {
        return "String from DaoImpl";
    }
}
