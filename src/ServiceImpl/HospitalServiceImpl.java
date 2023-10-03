package ServiceImpl;

import DaoService.HospitalDao;
import Database.Dao;
import Service.HospitalService;

public class HospitalServiceImpl implements HospitalService {

    private Dao dao;
    public HospitalDao hospitalDao;

    public HospitalServiceImpl(Dao dao, HospitalDao hospitalDao) {
        this.dao = dao;
        this.hospitalDao = hospitalDao;
    }
}
