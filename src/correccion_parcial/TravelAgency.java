
package correccion_parcial;

public class TravelAgency {
    private String name;
    private Hotel[] hoteles;
    private Travel[] travels;
    private Airport[] airports;
    
public TravelAgency(String name){
    this.name = name;
    this.hoteles = new Hotel[5];
    this.travels = new Travel[10];
    this.airports = new Airport[4];
}

    public String getName() {
        return name;
    }

public void ListarViajes(int viajeingresado, BookedFlight reserva, Airport llegada, Airport salida ){
   
    for(int i = 1; i < viajeingresado+1; i++){
    System.out.println("Vuelo " + i + "\nNumero de vuelo reserva salida:"+ reserva.getFlightNumbers()
            +"\nAeropuerto Salida: "+ salida.getDescription());
        System.out.println("Numero de vuelo reserva llegada:" +reserva.getFlightNumberl()
            +"\nAeropuerto Llegada: " + llegada.getDescription());
    }
}
}
