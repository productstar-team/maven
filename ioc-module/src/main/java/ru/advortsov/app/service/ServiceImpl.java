package ru.advortsov.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.advortsov.app.dao.IDao;

/**
 * ServiceImpl.
 *
 * @author Aleksandr_Dvortsov
 */
@Component
public class ServiceImpl implements IService {

    @Autowired
    private IDao dao;


    //    public ServiceImpl(IDao dao) {
//        this.dao = dao;
//    }

    @Override
    public String interactWithDaoString() {
        String s = dao.findString();
        return s + " Hello from ServiceImpl!";
    }
}
