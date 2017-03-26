
package correccion_parcial;


public class Correccion_Parcial {

    public static void main(String[] args) {
        int viajeingresado = 1;
        TravelAgency aviatur = new TravelAgency("Aviatur");
        Hotel fon = new Hotel("Fontanar","Cra 21 a # 159 a - 28" );
        Travel rionegro = new Travel("22/03/2017", 30, fon);
        Airport salida = new Airport("Jose Maria Cordoba");
        Airport llegada = new Airport("El Dorado");
        BookedFlight reserva = new BookedFlight(1345, 1411, "22/03/2017", "22/03/2017",salida, llegada);
       aviatur.ListarViajes(viajeingresado, reserva, llegada, salida);
     
    }
    
}
