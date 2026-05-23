import java.util.Scanner;
public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        metodos Metodos = new  metodos();
        int op = 0;

        do{
            System.out.println("=========================================");
            System.out.println("        .::REGISTRO DE VEHICULOS::.      ");
            System.out.println("=========================================");

            System.out.println("-----------------------------------------");
            System.out.println("1. Registrar Vehiculo");
            System.out.println("2. Mostrar Vehiculos");
            System.out.println("3. Buscar vehiculo por placa");
            System.out.println("4. Mostrar vehiculos por marca");
            System.out.println("5. Salir");
            System.out.println("-----------------------------------------");

            System.out.print("Elija la opcion deseada: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    Metodos.RegistrarVehiculo();
                    break;
                case 2:
                    Metodos.MostrarVehiculos();
                    break;
                case 3:
                    Metodos.BuscarVehiculo();
                    break;
                case 4:
                    Metodos.MostrarMarca();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida. Vuelva a intentarlo");
                    break;
            }
        }while(op != 5);
    }
}