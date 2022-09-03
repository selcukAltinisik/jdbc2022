package jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        //DBWork objesini oluştur.
        jdbc.J7_DBWork db = new jdbc.J7_DBWork();

        //Connection methodunu çağır.
        Connection con = db.connect_to_db("techproed","postgres","Postgresql_3544");

        //Yeni table oluşturma methodunu çağır.
        db.createTable(con,"employees");

    }
}
