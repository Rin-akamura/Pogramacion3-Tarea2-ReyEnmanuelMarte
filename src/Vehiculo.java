public class Vehiculo {
    private String Marca;
    private String Placa;
    private String Modelo;
    private String Año;
    private String Color;
    private String Precio;

    public Vehiculo() {
        this.Marca = "";
        this.Placa = "";
        this.Modelo = "";
        this.Año = "";
        this.Color = "";
        this.Precio = "";
    }

    public Vehiculo(String Marca, String Placa, String Modelo, String Año, String Color, String Precio){
        this.Marca = Marca;
        this.Placa = Placa;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Color = Color;
        this.Precio = Precio;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public String getMarca(){
        return Marca;
    }
    
    public void setPlaca(String Placa){
        this.Placa = Placa;
    }

    public String getPlaca(){
        return Placa;
    }

    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }

    public String getModelo(){
        return Modelo;
    }

    public void setAño(String Año){
        this.Año = Año;
    }

    public String getAño(){
        return Año;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public String getColor(){
        return Color;
    }

    public void setPrecio(String Precio){
        this.Precio = Precio;
    }

    public String getPrecio(){
        return Precio;
    }

    public void MostrarVehiculo(){
        System.out.println("========================================");
        System.out.println("             .::VEHICULO::.             ");
        System.out.println("========================================");

        System.out.println("----------------------------------------");
        System.out.println("Marca: " + Marca);
        System.out.println("Placa: " + Placa);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Año: " + Año);
        System.out.println("Color: " + Color);
        System.out.println("Precio: " + Precio);
        System.out.println("----------------------------------------");
    }
    
}
