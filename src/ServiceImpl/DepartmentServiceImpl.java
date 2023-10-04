package ServiceImpl;

import DaoService.DepartmentDao;
import Database.Dao;
import Model.Department;
import Service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private Dao dao;
    public DepartmentDao departmentDao;

    public DepartmentServiceImpl(Dao dao, DepartmentDao departmentDao) {
        this.dao = dao;
        this.departmentDao = departmentDao;
    }

    @Override
    public void deleteDepartmentById(Long id) {
        deleteDepartmentById(id);
    }

    @Override
    public String updateDepartmentById(Long id, Department department) {
        return updateDepartmentById(id, department);
    }

    @Override
    public List<Department> getAllDepartmentByHospital(Long id) {
        return departmentDao.getAllDepartmentByHospital(id);
    }

    @Override
    public Department findDepartmentByName(String name) {
        return departmentDao.findDepartmentByName(name);
    }

    @Override
    public String addDepartmentToHospital(Long id, Department... departments) {
        return departmentDao.addDepartmentToHospital(id, departments);
    }
}
