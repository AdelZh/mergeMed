import DaoService.DepartmentDao;
import DaoService.DoctorDao;
import DaoService.HospitalDao;
import DaoService.PatientDao;
import DaoServiceImpl.DaoDepartmentImpl;
import DaoServiceImpl.DaoDoctorImpl;
import DaoServiceImpl.DaoHospitalImpl;
import DaoServiceImpl.DaoPatientImpl;
import Database.Dao;
import Service.DepartmentService;
import Service.DoctorService;
import Service.HospitalService;
import Service.PatientService;
import ServiceImpl.DepartmentServiceImpl;
import ServiceImpl.DoctorServiceImpl;
import ServiceImpl.HospitalServiceImpl;
import ServiceImpl.PatientServiceImpl;


public class Main {
    public static void main(String[] args) {

        Dao dao=new Dao();
        PatientDao patientDao=new DaoPatientImpl(dao);
        PatientService patientService=new PatientServiceImpl(dao, patientDao);


        HospitalDao hospitalDao=new DaoHospitalImpl(dao);
        HospitalService hospitalService=new HospitalServiceImpl(dao, hospitalDao);

        DoctorDao doctorDao=new DaoDoctorImpl(dao);
        DoctorService doctorService=new DoctorServiceImpl(dao, doctorDao);

        DepartmentDao departmentDao=new DaoDepartmentImpl(dao);
        DepartmentService departmentService=new DepartmentServiceImpl(dao, departmentDao);


    }
}