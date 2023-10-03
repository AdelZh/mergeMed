package ServiceImpl;

import DaoService.PatientDao;
import Database.Dao;
import Model.Hospital;
import Model.Patient;
import Service.PatientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PatientServiceImpl implements PatientService {

    private Dao dao;

    public PatientDao patientDao;

    public PatientServiceImpl(Dao dao, PatientDao patientDao) {
        this.dao = dao;
        this.patientDao = patientDao;
    }


    @Override
    public List<Patient> sortPatientsByAge(String ascOrDesc) {
        List<Patient> patients = new ArrayList<>();
        for (Hospital hospital : dao.getHospitals()) {
            patients.addAll(hospital.getPatients());
            patients.sort((o1, o2) -> ascOrDesc.equals("1") ? o1.getAge() - o2.getAge() : o2.getAge() - o1.getAge());

        }
        return patients;
    }

    @Override
    public Map<Integer, Patient> getPatientByAge() {
        return patientDao.getPatientByAge();
    }

    @Override
    public String addPatientsToHospital(Long id, List<Patient> patients) {
        return patientDao.addPatientsToHospital(id, patients);
    }

    @Override
    public void removePatientById(Long id) {
        patientDao.removePatientById(id);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientDao.getPatientById(id);
    }
}
