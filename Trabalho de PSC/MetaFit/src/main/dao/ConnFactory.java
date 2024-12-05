package main.dao;

import java.sql.*;

public  class ConnFactory
{   private static final String URL  =   "jdbc:mysql://localhost:3306/metafit"; // nome do bd
    private static final String USER =   "root";
    private static final String PASS =   "drift4life";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String ERROBD = "Erro na conexão com o Banco de Dados: "; 

    public static Connection getConn()
    {   try
        {   Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }
        catch(ClassNotFoundException | SQLException e) 
        {   throw new RuntimeException(ERROBD + e);
        }
    }

    public static void closeConn(Connection conn)
    {   try
        {   if(conn != null) 
            {   conn.close();
            }
        } 
        catch(SQLException e) 
        {   throw new RuntimeException(ERROBD + e);
        }
    }
    public static void closeConn(Connection conn, PreparedStatement stmt) 
    {   closeConn(conn);
        try
        {   if(stmt != null) 
            {   stmt.close();
            }
        } 
        catch(SQLException e) 
        {   throw new RuntimeException(ERROBD + e);
        }
    }
    public static void closeConn(Connection conn, PreparedStatement stmt, ResultSet rs) 
    {   closeConn(conn, stmt);
        try
        {   if(rs != null) 
            {   rs.close();
            }
        } 
        catch(SQLException e) 
        {   throw new RuntimeException(ERROBD + e);
        }
    }
}
