using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace antlr_c.Clases
{
    public class Directiva
    {
        private int vida;
        private int tiempo;
        private char unidad;

        public Directiva(int vida, int tiempo, char unidad)
        {
            this.vida = vida;
            this.tiempo = tiempo;
            this.unidad = unidad;
        }

        public int getVida()
        {
            return this.vida;
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
