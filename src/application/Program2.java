package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        System.out.println("==== TESTE 1: department findById =====");
        DepartmentDao depDao = DaoFactory.createDepartmentDao();
        Department dep = depDao.findById(1);
        System.out.println(dep.getName());

        System.out.println("\n==== TESTE 2: department findAll =====");
        for (Department department : depDao.findAll()) {
            System.out.println(department);
        }
    }
}