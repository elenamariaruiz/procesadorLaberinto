public class Directiva {
    private String nombreLaberinto;
    private Integer tiempo;
    private char unidad;

    public Directiva(String nombreLaberinto, Integer tiempo, char unidad){
        this.nombreLaberinto=nombreLaberinto;
        this.tiempo=tiempo;
        this.unidad=unidad;
    }

    public String getNombreLaberinto(){
        return this.nombreLaberinto;
    }

    public Integer getTiempo(){
        return this.tiempo;
    }
    public char getUnidad(){
        return this.unidad;
    }
    
}
