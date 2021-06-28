public class Directiva {
    private Integer vida;
    private Integer tiempo;
    private char unidad;

    public Directiva(Integer vida, Integer tiempo, char unidad){
        this.vida=vida;
        this.tiempo=tiempo;
        this.unidad=unidad;
    }

    public Integer getVida(){
        return this.vida;
    }

    public Integer getTiempo(){
        return this.tiempo;
    }
    public char getUnidad(){
        return this.unidad;
    }
    
}
