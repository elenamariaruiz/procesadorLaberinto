import java.util.ArrayList;

class Elemento implements Comparable<Elemento>{
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

    public int compareTo(Elemento e2)
    {
        return tipo.compareTo(e2.getTipo());
    }


    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setValor(Integer valor){
        this.valor = valor;
    }

    public void setElemento(String elemento){
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

    public String toString(){
        String str = "\t<ident>"+this.tipo+"</ident>\n\t\t<elemento>"+this.elemento+"</elemento>\n\t\t<valor>"+this.valor+"</valor>\n\t";  
        return str;
    }

    public String toStringLocalizacion(){
        String str="";
        if(this.coordenadas!=null){
            for (int i=0;i<this.coordenadas.size(); i++){
                str = str+"\t<localizacion>\n\t\t<ident>"+this.tipo+"</ident>\n\t\t<coordenada>\n\t\t\t"+ coordenadas.get(i).toString()+"\t\t</coordenada>\n"+ "\t</localizacion>\n ";
            }
        }  
        return str;
    }
    
}