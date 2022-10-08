package base_de_datos;

import java.util.List;

public interface DAO <T>{
    public void create(T object) throws Exception;
    public Object read(int id) throws Exception;
    public void update(T object, int id) throws Exception;
    public void delete(int id) throws Exception;
    public List<T> findAll()throws Exception; 
    //agregamos la funcion consulta?
}
