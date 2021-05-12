import java.util.ArrayList;

class Elemento {
    private String tipo;
    private Integer valor;
    private String elemento;
    private ArrayList<Coordenada> coordenadas;

    public Elemento (String tipo, Integer valor, String elemento, ArrayList<Coordenada> coordenadas){
        this.tipo=tipo;
        this.valor=valor;
        this.elemento=elemento;
        this.coordenadas=coordenadas;
    }

    public Elemento (String tipo, String elemento, Integer valor){
        this.tipo=tipo;
        this.valor=valor;
        this.elemento=elemento;
    }

    public Elemento (String tipo, ArrayList<Coordenada> coordenadas){
        this.tipo=tipo;
        this.coordenadas=coordenadas;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setValor(Integer valor){
        this.valor = valor;
    }

    public void setNombre(String elemento){
        this.elemento=elemento;
    }

    public void setCoordenada(ArrayList<Coordenada> coordenadas){
        this.coordenadas=coordenadas;
    }

    public String getTipo(){
        return this.tipo;
    }
    public Integer getValor(){
        return this.valor;
    }

    public String getElemento(){
        return this.elemento;
    }

    public ArrayList<Coordenada> getCoordenadas(){
        return this.coordenadas;
    }
}