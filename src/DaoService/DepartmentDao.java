package DaoService;

import Model.Department;

import java.util.List;

public interface DepartmentDao {

    List<Department> getAllDepartmentByHospital(Long id);
    Department findDepartmentByName(String name);
    void deleteDepartmentById(Long id);
    public String addDepartmentToHospital(Long id, Department... departments);

    String updateDepartmentById(Long id, Department department);


}
