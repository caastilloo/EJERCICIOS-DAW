package bbdd;

import java.sql.*;
import java.time.LocalDate;

public class Main {

    static void main() {

        Connection bd = conexion();
        System.out.println("Realizando consultas ...");
        consulta(bd);
        desconectar(bd);

    }

    private static Connection conexion() {
        Connection conexion;
        String host = "jdbc:mariadb://localhost:3307/";
        String user = "root";
        String psw = "";
        String bd = "prueba";
        System.out.println("Conectando...");

        try {
            conexion = DriverManager.getConnection(host+bd,user,psw);
            System.out.println("Conexión realizada con éxito.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;
    }

    private static void desconectar(Connection conexion) {
        System.out.println("Desconectando...");

        try {
            conexion.close();
            System.out.println("Conexión finalizada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void consulta(Connection conexion){

        String query = "SELECT * FROM estudiante";
        Statement stmt;

        try {

            stmt = conexion().createStatement();
            ResultSet resultados = stmt.executeQuery(query);

            while (resultados.next()){

                Integer nia = resultados.getInt("nia");
                String nombre = resultados.getString("nombre");
                LocalDate fecha = resultados.getDate("fecha_nacimento").toLocalDate();

                System.out.println("Estudiante con nia " + nia + " nombre: " + nombre +  " fecha de nacimiento: " + fecha);



            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void modificar(Connection conexion){

        String update = "UPDATE estudiante SET nombre = 'Isma' WHERE nombre = 'Ismael';";
        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeQuery(update);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
