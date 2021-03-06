package Callable_Statement_F_P_C.CS;

import Callable_Statement_F_P_C.CS.datos.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Test_Funtion {
    public static void main(String[] args) {
        int empleadoId= 100; //identificador a recuperar salario
        try{
            Connection con = Conexion.getConnection();
            CallableStatement cstmt = null;
            double salarioMensual;

            cstmt = con.prepareCall("{ ? = call get_employee_salary(?) }");
            // Una funcion regresa un valor
            // por lo que lo registramos como el parametro 1
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2,empleadoId);
            cstmt.execute();
            salarioMensual =  cstmt.getDouble(1);
            cstmt.close();
            System.out.println("empleadoId = " + empleadoId);
            System.out.println("salarioMensual = " + salarioMensual);
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
