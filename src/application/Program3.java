package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program3 {
    public static void main(String[] args) {

        DepartmentDao depDao = DaoFactory.createDepartmentDao();
        Department department = depDao.findById(1);
        department.setName("Teste");
        depDao.insert(department);
        System.out.println("Insert completed.");

    }
}