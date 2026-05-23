import java.util.Scanner;
public class metodos {
    Scanner scanner = new Scanner(System.in);
    Vehiculo vehiculo = new Vehiculo();
    Vehiculo[] registro = new Vehiculo[200];
    int TotalVehiculos = 0;
    public metodos () {
    }

    public void RegistrarVehiculo(){

        System.out.println("=========================================");
        System.out.println("          .::REGISTRAR VEHICULO::.       ");
        System.out.println("=========================================");

        System.out.println("-----------------------------------------");
        System.out.println("Ingrese la Marca del vehiculo: ");
        String nombre = scanner.nextLine();
        vehiculo.setMarca(nombre);

        System.out.println("Ingrese el Modelo del vehiculo: ");
        String modelo = scanner.nextLine();
        vehiculo.setModelo(modelo);

        System.out.println("Ingrese la Placa del vehiculo: ");
        String placa = scanner.nextLine();
        vehiculo.setPlaca(placa);

        System.out.println("Ingrese el Año del vehiculo: ");
        String año = scanner.nextLine();
        vehiculo.setAño(año);

        System.out.println("Ingrese el Color del vehiculo: ");
        String color = scanner.nextLine();
        vehiculo.setColor(color);

        System.out.println("Ingrese el Precio del vehiculo: ");
        String precio = scanner.nextLine();
        vehiculo.setPrecio(precio);

        System.out.println("-----------------------------------------");

        registro[TotalVehiculos] = vehiculo;
        TotalVehiculos++;

        return;

    }

    public void MostrarVehiculos(){
        for(int i = 0; i < TotalVehiculos; i++){
            registro[i].MostrarVehiculo();
        }
    }

    public void BuscarVehiculo() {
        System.out.println("========================================");
        System.out.println("      .::BASE DE DATOS VEHICULAR::.     ");
        System.out.println("========================================");
        
        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        for(int i = 0; i <  TotalVehiculos; i++){
            if(registro[i].getPlaca().equals(placa)){
                registro[i].MostrarVehiculo();
                return;
            }
        }

         System.out.println("Vehiculo no encontrado en los Registros");
    }

    public void MostrarMarca(){
        System.out.println("=====================================");
        System.out.println("    .::BASE DE DATOS VEHICULAR::.    ");
        System.out.println("=====================================");

        System.out.println("Marca");
        String Marca = scanner.nextLine();

        System.out.println("===================================");
        System.out.println("        .::" + Marca + "::.          ");
        System.out.println("===================================");

        for(int i = 0; i <  TotalVehiculos; i++){
            if(registro[i].getMarca().equals(Marca)){
                registro[i].MostrarVehiculo();
            }
        }

         System.out.println("Vehiculo no encontrado en los Registros");
    }

}
