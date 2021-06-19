using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace antlr_c.Clases
{
    public class Elemento
    {
        private String tipo;
        private int valor;
        private String elemento;
        private List<Coordenada> coordenadas;

        public Elemento(String tipo, String elemento, int valor) {
            this.tipo = tipo;
            this.valor = valor;
            this.elemento = elemento;
        }

        public Elemento(String tipo, List<Coordenada> coordenadas) {
            this.tipo = tipo;
            this.coordenadas = coordenadas;
        }

        public void setTipo(String tipo)
        {
            this.tipo = tipo;
        }
        public void setValor(int valor)
        {
            this.valor = valor;
        }

        public void setElemento(String elemento)
        {
            this.elemento = elemento;
        }

        public void setCoordenada(List<Coordenada> coordenadas)
        {
            this.coordenadas = coordenadas;
        }

        public String getTipo()
        {
            return this.tipo;
        }
        public int getValor()
        {
            return this.valor;
        }

        public String getElemento()
        {
            return this.elemento;
        }

        public List<Coordenada> getCoordenadas()
        {
            return this.coordenadas;
        }

        public int compareTo(String tipoC) {
            return tipo.CompareTo(tipoC);
        }

    }
}
