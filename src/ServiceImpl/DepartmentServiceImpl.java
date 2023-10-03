package ServiceImpl;

import DaoService.DepartmentDao;
import Database.Dao;
import Service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    private Dao dao;
    public DepartmentDao departmentDao;

    public DepartmentServiceImpl(Dao dao, DepartmentDao departmentDao) {
        this.dao = dao;
        this.departmentDao = departmentDao;
    }
}
