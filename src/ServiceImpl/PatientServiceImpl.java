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
    public Map<Integer, Patient> getPatientByAge() {
        return getPatientByAge();
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
    public String addPatientsToHospital(Long id, Patient patients) {
        return addPatientsToHospital(id, patients);
    }

    @Override
    public String updatePatientById(Long id, Patient patientsNewInfo) {
        return updatePatientById(id, patientsNewInfo);
    }

    @Override
    public void removePatientById(Long id) {
        removePatientById(id);
    }

    @Override
    public Patient getPatientById(Long id) {
        return null;
    }
}
