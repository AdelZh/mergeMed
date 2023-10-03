package Service;

import Model.Patient;

import java.util.List;
import java.util.Map;

public interface PatientService {

    Map<Integer, Patient> getPatientByAge();

    List<Patient> sortPatientsByAge(String ascOrDesc);

    public String addPatientsToHospital(Long id, List<Patient> patients);

    void removePatientById(Long id);
    Patient getPatientById(Long id);


}
