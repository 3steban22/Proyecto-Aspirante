
package nuevoagente;
import javax.swing.*;
public class vacante {

    private String nombre;
    private String genero;
    private String seleccion;
    private int edad ;
    private double altura;
    public vacante(){
        nombre = ""; genero = ""; seleccion = ""; 
        edad  = 0; altura = 0.0;
    } 
    public void pedirdatosAspirante(){
        nombre = JOptionPane.showInputDialog("Aspirante ingresa tu nombre:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu Edad."));
        genero = JOptionPane.showInputDialog("Ingresa su genero: \n ¿Eres Hombre o Mujer?: ").toUpperCase();
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura"));
    }   
    public String calcularseleccion(){
        if("MUJER".equals(genero)){
        }   if((edad >= 18 && edad <= 25 )&&(altura >= 1.68))
        {
        seleccion = ("Aceptada");
        }   if((edad >= 18 && edad <= 25 )&&(altura >= 1.75))
        {
            seleccion = ("Aceptado");
    }else{
            seleccion = ("No Aceptado");
    }
  return (seleccion);
    }
       public void seleccion(){
            JOptionPane.showMessageDialog(null, "Nombre: " +nombre+"\n Aspirante: "+ seleccion );
    }
}
    
      