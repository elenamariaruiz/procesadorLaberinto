using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace antlr_c.Clases
{
    public class Util
    {
        public static List<Elemento> unificarListaLoc(List<String> listaIdent, List<Coordenada> listaCoord)
        {
            List<Elemento> localizaciones = new List<Elemento>();
            List<Coordenada> listaCoordenadas = new List<Coordenada>();
            int index = 0;
            int i;

            for (i = 0; i < listaIdent.Count; i++)
            {


                if (!listaIdent.ElementAt(index).Equals(listaIdent.ElementAt(i)))
                {
                    localizaciones.Add(new Elemento(listaIdent.ElementAt(index), listaCoordenadas));
                    listaCoordenadas = new List<Coordenada>();
                    index = i;

                }
                listaCoordenadas.Add(listaCoord.ElementAt(i));

            }
            if (listaCoordenadas != null)
            {
                localizaciones.Add(new Elemento(listaIdent.ElementAt(i - 1), listaCoordenadas));
            }

            return localizaciones;

        }

        public static void addElementoALoc(List<Elemento> definiciones, List<Elemento> localizaciones)
        {
            for (int i = 0; i < localizaciones.Count; i++)
            {
                for (int j = 0; j < definiciones.Count; j++)
                {
                    String aux = localizaciones.ElementAt(i).getTipo();
                    String aux2 = definiciones.ElementAt(j).getTipo();
                    if (localizaciones.ElementAt(i).getTipo().Equals(definiciones.ElementAt(j).getTipo()))
                    {
                        localizaciones.ElementAt(i).setElemento(definiciones.ElementAt(j).getElemento());
                        j = definiciones.Count;

                    }
                }

            }
        }
    }
}
