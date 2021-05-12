import java.util.ArrayList;

public class Laberinto {
    private String nombre;
    private Directiva directiva;
    private Integer[] dimension;
    private ArrayList<Elemento> monedas;
    private ArrayList<Elemento> enemigos;
    private ArrayList<Coordenada> localizaciones;
    private Coordenada inicio;
    private Coordenada meta;

    public Laberinto (String nombre, Integer[] dimension, ArrayList<Elemento> monedas, ArrayList<Elemento> enemigos, ArrayList<Coordenada> localizaciones,
        Coordenada inicio, Coordenada meta){
        this.nombre=nombre;
        this.localizaciones=localizaciones;
        this.dimension=dimension;
        this.monedas=monedas;
        this.enemigos=enemigos;
        this.inicio=inicio;
        this.meta=meta;
    }


    public Laberinto (Coordenada inicio, Coordenada meta){
        this.inicio=inicio;
        this.meta=meta;
    }
    public Laberinto (ArrayList<Coordenada> localizaciones,
    Coordenada inicio, Coordenada meta){
        this.localizaciones=localizaciones;
        this.inicio=inicio;
        this.meta=meta;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Directiva getDirectiva(){
        return directiva;
    }

    public Integer[] getDimension(){
        return this.dimension;
    }

    public ArrayList<Elemento> getMonedas(){
        return this.monedas;
    }

    public ArrayList<Elemento> getEnemigos(){
        return this.enemigos;
    }

    public Coordenada getInicio(){
        return this.inicio;
    }
    
    public Coordenada getMeta(){
        return this.meta;
    }

    public ArrayList<Coordenada> getLocalizaciones(){
        return this.localizaciones;
    }


    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDirectiva(Directiva directiva){
        this.directiva=directiva;
    }

    public void setDimension(Integer[] dimension){
        this.dimension=dimension;
    }

    public void setMonedas(ArrayList<Elemento> monedas){
        this.monedas=monedas;
    }

    public void setEnemigos(ArrayList<Elemento> enemigos){
        this.enemigos=enemigos;
    }

    public void setInicio(Coordenada inicio){
        this.inicio=inicio;
    }
    
    public void setMeta(Coordenada meta){
        this.meta=meta;
    }

    public void setLocalizaciones(ArrayList<Coordenada> localizaciones){
        this.localizaciones=localizaciones;
    }    



}
