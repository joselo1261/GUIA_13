
public class Excepciones{

    public static void main(String[] args) {
    try {
     int resultado = 3/0;
    
    } catch (Exception e) {
        System.err.println("No se puede dividir por cero");   
    }
        

    int edades[]= {10,20,30,40};
    try {
       System.out.println("La edad en posicion 4 es:"+ edades[4]);   
    } 
    catch (Exception e) {
        System.out.println("Fuera de Rango");    
    }
}

    @Override
    public String toString() {
        return "Excepciones []";
    }

}