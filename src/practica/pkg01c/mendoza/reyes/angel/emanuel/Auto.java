package practica.pkg01c.mendoza.reyes.angel.emanuel;

public class Auto {
    //Atributos
    protected String color;
    protected int NumCilindros, NumAsientos, Kilometros;
    
    //constructor

    public Auto(String color, int NumCilindros, int NumAsientos, int Kilometros) {
        this.color = color;
        this.NumCilindros = NumCilindros;
        this.NumAsientos = NumAsientos;
        this.Kilometros = Kilometros;
    }
  
       public Auto(){
        this.color="Negro";
        this.NumCilindros= 8;
        this.NumAsientos = 2;
        this.Kilometros = 80000;  
       }
       
       //Setters

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumCilindros(int NumCilindros) {
        this.NumCilindros = NumCilindros;
    }

    public void setNumAsientos(int NumAsientos) {
        this.NumAsientos = NumAsientos;
    }

    public void setKilometros(int Kilometros) {
        this.Kilometros = Kilometros;
    }
    //Getters

    public String getColor() {
        return color;
    }

    public int getNumCilindros() {
        return NumCilindros;
    }

    public int getNumAsientos() {
        return NumAsientos;
    }

    public int getKilometros() {
        return Kilometros;
    }
    
}
