package base_de_datos;

import java.util.List;
import logico.MateriaPrima;

public class DAOMateriaPrima implements DAO<MateriaPrima>{
    
    ConexionBD conexion;

    @Override
    public void create(MateriaPrima object) throws Exception {
        
    }

    @Override
    public void update(MateriaPrima object) throws Exception {
    }

    @Override
    public void delete(MateriaPrima object) throws Exception {
    }

    @Override
    public List<MateriaPrima> findAll() throws Exception {
        return null;
    }
    
    
}
