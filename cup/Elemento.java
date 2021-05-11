class Elemento {
    private String tipo;
    private Integer valor;
    private String elemento;
    private Coordenada [] coordenadas;

    public Elemento (String tipo, Integer valor, String elemento, Coordenada [] coordenadas){
        this.tipo=tipo;
        this.valor=valor;
        this.elemento=elemento;
        this.coordenadas=coordenadas;
    }

    public void setValor(Integer valor){
        this.valor = valor;
    }

    public void setNombre(String elemento){
        this.elemento=elemento;
    }

    public void setCoordenada(Coordenada [] coordenadas){
        this.coordenadas=coordenadas;
    }

    public Integer getValor(){
        return this.valor;
    }

    public String getElemento(){
        return this.elemento;
    }

    public Coordenada [] getCoordenadas(){
        return this.coordenadas;
    }
}