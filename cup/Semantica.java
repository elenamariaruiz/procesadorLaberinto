import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
public class Semantica {
    public static void comprobarLaberinto(Laberinto laberinto) throws ElementoDuplicadoException, CoordenadaNoValidaException, ElementoNoDeclaradoException,
        CoordenadaRepetidaException{
        declaracionUnica(laberinto.getMonedas(), laberinto.getEnemigos());
        coordenadaValida("Declaración de inicio: ",laberinto.getDimension(), laberinto.getInicio());
        coordenadaValida("Declaración de meta: ",laberinto.getDimension(), laberinto.getMeta());
        //Comprobar que inicio y meta no están en la misma coordenada
        comprobarLocalizaciones(laberinto.getInicio(), laberinto.getMeta(), laberinto.getDimension(), laberinto.getEnemigos(), laberinto.getMonedas(), laberinto.getLocalizaciones());
    }
    public static void declaracionUnica(ArrayList<Elemento> monedas, ArrayList<Elemento> enemigos) throws ElementoDuplicadoException{
        monedas.addAll(enemigos);
        List<Elemento> duplicates = new ArrayList<Elemento>();
        Set<Elemento> elementoSet = new TreeSet<Elemento>();
        
        for(Elemento e : monedas)
        {
            if(!elementoSet.add(e))
            {
                throw new ElementoDuplicadoException(e.getTipo());
            }
        }
        
        
    }

    public static void comprobarLocalizaciones(Coordenada inicio, Coordenada meta,Integer[] dimensionLaberinto, ArrayList<Elemento> monedas, ArrayList<Elemento> enemigos,
     ArrayList<Elemento> localizaciones) throws ElementoNoDeclaradoException, CoordenadaRepetidaException, CoordenadaNoValidaException{
        int cont=0;
        Set<Coordenada> coordSet = new TreeSet<Coordenada>();
        monedas.addAll(enemigos);
        //coordSet.add(inicio);
        //if(!coordSet.add(meta)){
          //  throw new CoordenadaRepetidaException(meta);
        //}        
        //Elemento declarado anteriormente(llevar a otro metodo)
        for(Elemento e : localizaciones){
            for(Elemento m: monedas){
                if(e.getTipo().equals(m.getTipo())){
                    cont++;
                }                    
            }
            if(cont==0){
                throw new ElementoNoDeclaradoException(e.getTipo());
            }
            cont=0;
        }
        //Comprobar que las coordenadas son únicas y válidas
        for(Elemento e:localizaciones){
            System.out.println(e.getCoordenadas());
            for(Coordenada c: e.getCoordenadas()){
                System.out.println(c.getCoordX()+", "+c.getCoordY());
                if(!coordSet.add(c)){
                    throw new CoordenadaRepetidaException(c);
                }
                coordenadaValida(dimensionLaberinto, c);
            }
        }
    }
    public static void coordenadaValida(Integer[] dimensionLaberinto, Coordenada coord) throws CoordenadaNoValidaException{
        coordenadaValida("", dimensionLaberinto, coord);
    }
    public static void coordenadaValida(String msg, Integer[] dimensionLaberinto, Coordenada coord) throws CoordenadaNoValidaException{
        if(coord.getCoordX()>=dimensionLaberinto[0] || coord.getCoordY()>=dimensionLaberinto[1])
            throw new CoordenadaNoValidaException(msg, dimensionLaberinto, coord.getCoordX(), coord.getCoordY());

    }
 
    /*public static localizacionUnica(){}
    public static elementoConLocalizacion(){}
    public static coordenadaValida(){}*/
    

}


/**
 * Excepciones
 */

class ElementoDuplicadoException extends Exception{
    public ElementoDuplicadoException(String identElemento){
        super("El identificador "+identElemento+" está declarado más de una vez.");
    }
}

class CoordenadaNoValidaException extends Exception{
    public CoordenadaNoValidaException(String msg, Integer[] dimensionLaberinto, Integer x, Integer y){
        super(msg+"Las coordenadas x:"+x+" y:"+y+" exceden los limites del laberinto. Tamaño del laberinto: "+dimensionLaberinto[0]+", "+dimensionLaberinto[1]+".");
    }
}

class ElementoNoDeclaradoException extends Exception{
    public ElementoNoDeclaradoException(String nameElement){
        super("El elemento "+nameElement+" debe ser declarado antes de añadir su posicionamiento.");
    }
}

class CoordenadaRepetidaException extends Exception{
    public CoordenadaRepetidaException(Coordenada c){
        super("Existen dos elementos localizados en la misma coordenada con los valores x= "+c.getCoordX()+" e y="+c.getCoordY()+".");
    }
}