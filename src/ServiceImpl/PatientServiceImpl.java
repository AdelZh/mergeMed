package ServiceImpl;

import DaoService.PatientDao;
import Database.Dao;
import Service.PatientService;

public class PatientServiceImpl implements PatientService {

    private Dao dao;

    public PatientDao patientDao;

    public PatientServiceImpl(Dao dao, PatientDao patientDao) {
        this.dao = dao;
        this.patientDao = patientDao;
    }
}
