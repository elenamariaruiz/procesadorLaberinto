using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using antlr_c.Clases;

namespace antlr_c
{
    public class AnalisisSemantico
    {
        public static void declaracionUnica(List<Elemento> definicion) {
            List<Elemento> comprobar = new List<Elemento>();

            foreach (var elemento in definicion) {
                if (comprobar.Contains(elemento)) {
                    throw new ElementoDuplicadoException("El identificador " + elemento.getTipo() + " está declarado más de una vez.");
                }
                comprobar.Add(elemento);
            }
        
        }


        public static void coordenadaValida(int[] dimensionLaberinto, Coordenada coord) 
        {
            coordenadaValida("", dimensionLaberinto, coord);
        }
        public static void coordenadaValida(String msg, int[] dimensionLaberinto, Coordenada coord)
        {
          if(coord.getCoordX()>=dimensionLaberinto [0] || coord.getCoordY()>=dimensionLaberinto [1])
              throw new CoordenadaNoValidaException(msg + "Las coordenadas x:" + coord.getCoordY() + " y:" + coord.getCoordX() + 
                  " exceden los limites del laberinto. Tamaño del laberinto: " + dimensionLaberinto[0] + ", " + dimensionLaberinto[1] + ".");

        }

        public static void comprobarLocalizaciones(Coordenada inicio, Coordenada meta, int[] dimensionLaberinto, List<Elemento> definicion,
        List<Elemento> localizaciones) {
            //Elemento declarado anteriormente(llevar a otro metodo)
            List<Coordenada> coordenadas_verificadas= new List<Coordenada>();
            if(localizaciones!=null && definicion==null)
                throw new NoHayDefinicionException("No pueden definirse las localizaciones de un elemento si no hay declaraciones de elementos.");

            foreach (Elemento l in localizaciones)
            {
                if (!definicion.Contains(l))
                    throw new ElementoNoDeclaradoException("El elemento " + l.getTipo() + " debe ser declarado antes de añadir su posicionamiento.");

                //Comprobar que las coordenadas son únicas y válidas

                foreach (Coordenada c in l.getCoordenadas())
                {
                    if (!coordenadas_verificadas.Contains(c))
                    {
                        coordenadaValida(dimensionLaberinto,c );
                        coordenadas_verificadas.Add(c);
                    }
                    else
                    {
                        throw new CoordenadaRepetidaException("Existen dos elementos localizados en la misma coordenada con los valores x= " + c.getCoordX() + " e y=" + c.getCoordY() + ".");
                    }
                }
            }

        }




/**
* Excepciones
*/
    public class ElementoDuplicadoException : Exception
        {
            public ElementoDuplicadoException() : base() { }
            public ElementoDuplicadoException(string message) : base(message) { }
            
        }
    }
    public class CoordenadaNoValidaException : Exception
    {
        public CoordenadaNoValidaException(String message) : base(message) { }
    }

    public class NoHayDefinicionException : Exception
    {
        public NoHayDefinicionException(String message) : base(message) { }

    }
    class ElementoNoDeclaradoException : Exception
    {
        public ElementoNoDeclaradoException(String message) : base(message) { }
    
    

    }

    public class CoordenadaRepetidaException : Exception
    {
        public CoordenadaRepetidaException(String message) : base(message) { }
      

    }


}