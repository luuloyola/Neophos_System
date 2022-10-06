package logico;

import base_de_datos.DAOMateriaPrima;

public class Manager_MateriaPrima {
    
    public DAOMateriaPrima daoMatPrima;

    public Manager_MateriaPrima() {
        daoMatPrima = new DAOMateriaPrima();
    }
    
    public void cargarMateriaPrima() throws Exception{
        MateriaPrima materia_nueva = new MateriaPrima();
        Manager_StockMateria stock = new Manager_StockMateria();
        stock.cargarStockMateria(5,Deposito.getSinglentonInstance(0), materia_nueva);
        daoMatPrima.create(materia_nueva);
    }
    public void modificarMateriaPrima(MateriaPrima materia) throws Exception{
        daoMatPrima.update(materia);
    }
    public void eliminarMateriaPrima(MateriaPrima materia) throws Exception{
        daoMatPrima.delete(materia);
    }

    public void consultarMateriaPrima(){
        
    }
    
}
