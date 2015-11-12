 

/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int hora;
    
    private int minuto;

    /**
         * Constructor for objects of class Reloj
         */
        public ClockDisplay ()
          {
           hora = 00;
           minuto = 00; 
          }
         
    /**
     * Metodo para introducir valores al reloj
     */
    public void setTime (int h, int min)
    {
      if (h <= 23){
        hora = h;
     } else {
        System.out.println("Hora incorrecta");
         }    
     if (min <= 59){
        minuto = min;
        } else {
        System.out.println("minuto incorrecto");
         }    
        }
    /**
     * Metodo para aumentar un minuto el reloj
     */
    public void timeTick (){
       if (minuto == 59){
           if ( hora == 23 && minuto == 59){
             hora = 00;
             minuto = 00;
            } else {
           hora = hora + 01;
           minuto = 00;
          }
      }
       else {
          minuto = minuto + 01;
      } 
      }    
      /**
         * Metodo que muestra la hora por pantalla
         */
        public String getTime ()
          { 
        String time = hora + ":" + minuto;
          if (minuto < 10 & hora < 10){
           time = ("0" + hora + " : "+ "0" + minuto);
        }  else {
              if (minuto < 10){
                      time =( hora + " : "+ "0" + minuto);
              }
              if (hora < 10){
                      time = ("0" + hora + " : "+  minuto);
              }
              if (minuto >= 10 & hora >= 10){
                      time = ( hora + " : " + minuto);
              }
        }
        return time;
    }
}
