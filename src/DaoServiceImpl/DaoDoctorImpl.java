package DaoServiceImpl;

import DaoService.DoctorDao;
import Database.Dao;

public class DaoDoctorImpl implements DoctorDao {

    private Dao dao;

    public DaoDoctorImpl(Dao dao) {
        this.dao = dao;
    }
}
