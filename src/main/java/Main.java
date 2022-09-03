package jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

    //DBWork objesini oluştur.
    jdbc.DBWork db = new jdbc.DBWork();

    //Connection methodunu çağır.
    Connection con = db.connect_to_db("techproed","postgres","Postgresql_3544");

    //Yeni table oluşturma methodunu çağır.
    db.createTable(con,"employees");

    }
}
