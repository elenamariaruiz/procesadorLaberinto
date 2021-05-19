import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
public class Semantica {
    public static void comprobarLaberinto(Laberinto laberinto) throws ElementoDuplicadoException, CoordenadaNoValidaException{
        System.out.print("Dentro");
        declaracionUnica(laberinto.getMonedas(), laberinto.getEnemigos());
        coordenadaValida("Declaración de inicio: ",laberinto.getDimension(), laberinto.getInicio());
        coordenadaValida("Declaración de meta: ",laberinto.getDimension(), laberinto.getMeta());
        comprobarLocalizaciones(laberinto.getDimension(), laberinto.getEnemigos(), laberinto.getMonedas(), laberinto.getLocalizaciones());
    }
    public static void declaracionUnica(ArrayList<Elemento> monedas, ArrayList<Elemento> enemigos) throws ElementoDuplicadoException{
        monedas.addAll(enemigos);
        List<Elemento> duplicates = new ArrayList<Elemento>();
        Set<Elemento> elementoSet = new TreeSet<Elemento>();
        
        for(Elemento e : monedas)
        {
            System.out.println(e.getElemento());
            System.out.println(elementoSet);
            if(!elementoSet.add(e))
            {
                throw new ElementoDuplicadoException(e.getTipo());
            }
        }
        
        
    }

    public static void comprobarLocalizaciones(){
        //Elemento declarado anteriormente
        //Loccalización unica
        //Coordenada Valida
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
