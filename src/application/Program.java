package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import model.dao.DaoFactory;

import java.util.Date;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(2);

        System.out.println(seller);

    }
}