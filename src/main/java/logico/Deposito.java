package logico;

public class Deposito {
    private int id;
    private static Deposito deposito;
    
    private Deposito(int id){
        this.id= id;
    }
    public static Deposito getSinglentonInstance(int id){
        if(deposito == null) deposito = new Deposito(id);
        return deposito;   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public Deposito clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase Deposito");
        }
        return null;
    }
}
