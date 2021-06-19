using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace antlr_c.Clases
{
    public class Directiva
    {
        private String nombreLaberinto;
        private int tiempo;
        private char unidad;

        public Directiva(String nombreLaberinto, int tiempo, char unidad)
        {
            this.nombreLaberinto = nombreLaberinto;
            this.tiempo = tiempo;
            this.unidad = unidad;
        }

        public String getNombreLaberinto()
        {
            return this.nombreLaberinto;
        }

        public int getTiempo()
        {
            return this.tiempo;
        }
        public char getUnidad()
        {
            return this.unidad;
        }
    }
}
