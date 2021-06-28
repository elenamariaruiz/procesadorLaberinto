import java.util.ArrayList;

public class Laberinto {
    private String nombre;
    private Directiva directiva;
    private Integer[] dimension;
    private ArrayList<Elemento> definicion;
    private ArrayList<Elemento> localizaciones;
    private Coordenada inicio;
    private Coordenada meta;

    public Laberinto (String nombre, Integer[] dimension, ArrayList<Elemento> monedas, ArrayList<Elemento> enemigos, ArrayList<Elemento> localizaciones,
        Coordenada inicio, Coordenada meta){
        this.nombre=nombre;
        this.localizaciones=localizaciones;
        this.dimension=dimension;
        monedas.addAll(enemigos);
        this.definicion=monedas;
        this.inicio=inicio;
        this.meta=meta;
    }


    public Laberinto (Coordenada inicio, Coordenada meta){
        this.inicio=inicio;
        this.meta=meta;
    }
    public Laberinto (ArrayList<Elemento> localizaciones,
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

    public ArrayList<Elemento> getDefinicion(){
        return this.definicion;
    }


    public Coordenada getInicio(){
        return this.inicio;
    }
    
    public Coordenada getMeta(){
        return this.meta;
    }

    public ArrayList<Elemento> getLocalizaciones(){
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

    public void setDefinicion(ArrayList<Elemento> definicion){
        this.definicion=definicion;
    }


    public void setInicio(Coordenada inicio){
        this.inicio=inicio;
    }
    
    public void setMeta(Coordenada meta){
        this.meta=meta;
    }

    public void setLocalizaciones(ArrayList<Elemento> localizaciones){
        this.localizaciones=localizaciones;
    }    

    public String definicionToString(){
        String str="";
        for (int i = 0; i<this.definicion.size(); i++){
            str = str +"\t<definicion>\n\t"+ this.definicion.get(i)+ "</definicion>\n";
        }
        return str;
    }

    public String localizacionesToString(){
        String str = "";
        for (int i = 0; i<this.localizaciones.size(); i++){
            str = str + this.localizaciones.get(i).toStringLocalizacion();
        }
        return str;
    }


    public String toString(){
        
        String salida="<laberinto>\n<nombre>"+this.nombre+"</nombre>\n";
        salida = salida+"<vida>"+this.directiva.getVida()+"</vida>\n"+
            "<tiempo>"+this.directiva.getTiempo()+"</tiempo>\n"+
            "<unidadTiempo>"+this.directiva.getUnidad()+"</unidadTiempo>\n"+
            "<dimension><alto>"+this.dimension[0]+"</alto>\n<ancho>"+this.dimension[1]+"</ancho>\n</dimension>\n"+
            "<inicio>\n\t\t\t"+this.inicio.toString()+"\n</inicio>\n<final>\n\t\t\t"+this.meta.toString()+"\n</final>\n";
            if(this.definicion!=null){
                salida+="<definiciones>\n"+definicionToString()+"</definiciones>\n";
            }            

            if(this.localizaciones!=null){
                salida+="<localizaciones>\n"+localizacionesToString()+"</localizaciones>\n";
            }
            
        
        salida=salida+"</laberinto>\n";        
        return salida;
    }


    
}
