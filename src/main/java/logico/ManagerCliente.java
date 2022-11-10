package logico;
import base_de_datos.DAOCliente;
import java.util.List;

public class ManagerCliente {
    private static ManagerCliente manager;
    private DAOCliente dao;
    
    public ManagerCliente(){
        dao = new DAOCliente();
    }
    
    public static ManagerCliente getInstance() {
        if (manager == null)
            manager = new ManagerCliente();

        return manager;
    }
    
    public List<Cliente> consultar_todos() throws Exception{
        return dao.findAll();
    }
}


