
package practica.pkg01c.mendoza.reyes.angel.emanuel;

public class Deportivo extends Auto{
    private String marca, placa, modelo;
    private int precio; 
    
     public Deportivo(String color , int NumCilindros , int NumAsientos ,int Kilometros) {
        super(color,NumCilindros , NumAsientos,Kilometros );
    }
    
    public Deportivo (String color, int NumCilindros, int NumAsientos, int Kilometros, String marca, String modelo, String placa, int precio) {
       super(color,NumCilindros , NumAsientos,Kilometros );
        this.marca= marca;
        this.modelo = modelo;
        this.placa = placa;
        this.precio= precio;

    }
    public Deportivo(){
        super();
        this.marca= "Audi";
        this.modelo = "R8";
        this.placa = "JRM-123";
        this.precio= 1000000;
    }    
    //Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //Getters

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }
    
}
