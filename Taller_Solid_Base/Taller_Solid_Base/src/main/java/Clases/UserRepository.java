package Clases;
import Interfaces.Database;

public class UserRepository {
    private Database database;

    public UserRepository(Database database) {
        this.database = database;
    }

    public void insertUser(User user) {
        //codigo para insertar al usuario en la Database
    }
}
