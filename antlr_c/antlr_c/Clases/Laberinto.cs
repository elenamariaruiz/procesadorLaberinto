using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace antlr_c.Clases
{
    [Serializable()]
    public class Laberinto
    {
        public String nombre;
        //private Directiva directiva;
        public int[] dimension;
        //private List<Elemento> definiciones;
        //private List<Elemento> localizaciones;
        private Coordenada inicio;
        private Coordenada meta;

        
        public Laberinto() { }
        /*public Laberinto(String nombre, int[] dimension, List<Elemento> monedas, List<Elemento> enemigos,
            List<Elemento> localizaciones, Coordenada inicio, Coordenada meta)
        {
            this.nombre = nombre;
            this.localizaciones = localizaciones;
            this.dimension = dimension;
            //modificar
            //monedas.Add(enemigos);
            this.definiciones = monedas;
            this.inicio = inicio;
            this.meta = meta;            
        }*/
        /*public Laberinto(String nombre) 
        {
            this.nombre = nombre;
        }*/

        public Coordenada getInicio() {
            return inicio;
        }
    }
}
