package main.services;

import main.ConnectionSingleton;
import main.model.Tire;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TireService {

    public TireService() {

    }


    public List<Tire> getAllTires () {
        List<Tire> allTires = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM TIRES");
           while (resultSet.next()) {
               String model = resultSet.getString("model");
               String manufacturer = resultSet.getString("manufacturer");
               double price = resultSet.getDouble("price");
               allTires.add(new Tire(model, manufacturer, price));
           }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return allTires;
    }

    public void insertTire(Tire tire) {
        Connection connection = ConnectionSingleton.getInstance();


    }
}
