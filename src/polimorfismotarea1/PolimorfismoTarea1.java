/*
Diseñe e implemente un algoritmo, que permita crear una clase llamada 
CalculoResistencia, el cual contenga como atributos: voltaje tanto de tipo 
decimal como de tipo entero; intensidad tanto de tipo decimal como de tipo 
entero, los cuales estarán sobrecargando a las clases MAP, MAF, sensorCombustion,
sensorSalida . Imprima solo el valor de la resistencia de los sensores de entrada 
(MAP Y MAF).
 */
package polimorfismotarea1;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
class CalculoResistencia{
    double Resistencia(double voltaje, double intensidad){
        return voltaje/intensidad;
    }
    int Resistencia(int voltaje, int intensidad){
        return voltaje/intensidad;
    }
}

class MAP extends CalculoResistencia{
    public void Resistencia(){
        System.out.println("La resistencia para el sensor MAP");
    }
}
class MAF extends CalculoResistencia{
    public void Resistencia(){
        System.out.println("La resistencia para el sensor MAF");
    }
}
class sensorCombustion extends CalculoResistencia{
    public void Resistencia(){
        System.out.println("La resistencia para el sensor combustión");
    }
}
class sensorSalida extends CalculoResistencia{
    public void Resistencia(){
        System.out.println("La resistencia para el sensor de salida");
    }
}
public class PolimorfismoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE ");
        System.out.println("\t\tSEDE LATACUNGA");
        System.out.println("Estudiante: William Taco");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Asignatura: Programación [7450]");
       
        System.out.println("*****************************************");
        
        CalculoResistencia Objeto1 = new CalculoResistencia();
        CalculoResistencia Objeto2 = new CalculoResistencia();
        
        double resistencia1;
        Objeto1.Resistencia(12.25, 1.02);
        resistencia1 = Objeto1.Resistencia(12.25, 1.02);
        System.out.println("Valor de la Resistencia: "+resistencia1);
        
        int resistencia2;
        Objeto2.Resistencia(12, 1);
        resistencia2 = Objeto2.Resistencia(12, 1);
        System.out.println("Valor de la Resistencia: "+resistencia2);
        
        CalculoResistencia Objeto3=new MAP();
        CalculoResistencia Objeto4=new MAF();
        
        System.out.println("Resistencia para el sensor: MAP ");
        System.out.println(resistencia1);
       
        System.out.println("Resistencia para el sensor: MAF ");
        System.out.println(resistencia2);
    }
    
}
