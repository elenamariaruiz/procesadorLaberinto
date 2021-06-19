using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace antlr_c.Clases
{
    public class Laberinto
    {
        private String nombre;
        private Directiva directiva;
        private int[] dimension;
        private List<Elemento> definiciones;
        private List<Elemento> localizaciones;
        private Coordenada inicio;
        private Coordenada meta;

        
        public Laberinto() { }
        public Laberinto(String nombre, Directiva directiva, int[] dimension, List<Elemento> monedas, List<Elemento> enemigos,
            List<Elemento> localizaciones, Coordenada inicio, Coordenada meta)
        {
            this.nombre = nombre;
            this.localizaciones = localizaciones;
            this.directiva = directiva;
            this.dimension = dimension;
            //modificar
            //monedas.Add(enemigos);
            this.definiciones = monedas;
            this.inicio = inicio;
            this.meta = meta;            
        }
        public Laberinto(String nombre, Directiva directiva, int[] dimension, Coordenada inicio, Coordenada meta) {
            this.nombre = nombre;
            this.directiva = directiva;
            this.dimension = dimension;
            this.inicio = inicio;
            this.meta = meta;
        }
        public Laberinto(String nombre) 
        {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
        public Coordenada getInicio() {
            return this.inicio;
        }
        public Coordenada getMeta() {
            return this.meta;
        }

        public List<Elemento> getLocalizaciones() {
            return this.localizaciones;
        }

        public int[] getDimension() {
            return this.dimension;
        }

        public Directiva getDirectiva() {
            return this.directiva;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDirectiva(Directiva directiva) {
            this.directiva = directiva;
        }
        public void setDimension(int[] dimension)
        {
            this.dimension = dimension;
        }

        public void setDefinicion(List<Elemento> definiciones)
        {
            this.definiciones = definiciones;
        }


        public void setInicio(Coordenada inicio)
        {
            this.inicio = inicio;
        }

        public void setMeta(Coordenada meta)
        {
            this.meta = meta;
        }

        public void setLocalizaciones(List<Elemento> localizaciones)
        {
            this.localizaciones = localizaciones;
        }

        public String definicionToString()
        {
            String str = "";
            for (int i = 0; i < this.definiciones.Count; i++)
            {
                str = str + "\t<definicion>\n\t" + this.definiciones.ElementAt(i) + "</definicion>\n";
            }
            return str;
        }
    }
}
