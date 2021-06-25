using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using antlr_c.Clases;
using antlr_c.Generated;
using howto_maze;

namespace antlr_c
{
    class MiLaberintoListener : LaberintoBaseListener
    {
        Laberinto laberinto;

        override
        public void EnterInicio(LaberintoParser.InicioContext context) {
            // inicio : IDENT dimension directivas def_monedas? def_enemigos? bloque;
            laberinto = new Laberinto();
            laberinto.setNombre(context.IDENT().GetText());
            //laberinto
        }

		override
		public void ExitInicio(LaberintoParser.InicioContext context)
		{
			comprobarSemantica();
			Util.addElementoALoc(laberinto.getDefinicion(), laberinto.getLocalizaciones());
			//laberinto.setLocalizaciones(listaEleLoc);

			//Pasar laberinto al form
			var m = new Form1();
			m.LoadLaberinto(laberinto);
			//Mirar como carga el laberinto y procesar la información del objeto para mostrarla
			m.Show();
		}

		


		override
        public void EnterDimension(LaberintoParser.DimensionContext context) {
            laberinto.setDimension(new int[] { Int32.Parse(context.num1.Text), Int32.Parse(context.num2.Text) });
        }
        override
        public void EnterStart(LaberintoParser.StartContext context) {
            laberinto.setInicio(sacarCoordenada(context.coord()));
        }
		override
		public void EnterEnd(LaberintoParser.EndContext context) {
			laberinto.setMeta(sacarCoordenada(context.coord()));
		}
		
		override
		public void EnterDirectivas(LaberintoParser.DirectivasContext context) {
			laberinto.setDirectiva(new Directiva(context.IDENT().GetText(), Int32.Parse(context.NUMERO().GetText()), context.UTEMP().GetText()[0]));
		}
		override
		public void EnterDef_monedas(LaberintoParser.Def_monedasContext context) {
			List<Elemento> def_moneda = new List<Elemento>();
			LaberintoParser.MonedaContext[] monedas = context.monedas().moneda();

			foreach (var moneda in monedas)
			{
				def_moneda.Add(sacarMoneda(moneda));
			}

			this.laberinto.setDefinicion(def_moneda);
		}
		public Elemento sacarMoneda(LaberintoParser.MonedaContext context)
		{
			return new Elemento(context.IDENT().GetText(), "moneda", Int32.Parse(context.NUMERO().GetText()));
		}
		override
		public  void EnterDef_enemigos(LaberintoParser.Def_enemigosContext context) {
			List<Elemento> def_enemigo = new List<Elemento>();
			LaberintoParser.EnemigoContext[] enemigos= context.enemigos().enemigo();
			
			foreach (var enemigo in enemigos)
			{
				def_enemigo.Add(sacarEnemigo(enemigo));				
			}
			List<Elemento> def = this.laberinto.getDefinicion();
			def.AddRange(def_enemigo);
			this.laberinto.setDefinicion(def);
		}

		public Elemento sacarEnemigo(LaberintoParser.EnemigoContext context) {
			return new Elemento(context.IDENT().GetText(), "enemigo", Int32.Parse(context.DAMAGE().GetText()));
		}
		
		override
		public void EnterLocalizaciones(LaberintoParser.LocalizacionesContext context) {
			List<Elemento> lista_localizaciones = new List<Elemento>();
			LaberintoParser.LocalizacionContext[] localizaciones = context.localizacion();
			foreach(var localizacion in localizaciones)
				lista_localizaciones.Add(sacarLocalizacion(localizacion));

			this.laberinto.setLocalizaciones(lista_localizaciones);
		}

		


		public Elemento sacarLocalizacion(LaberintoParser.LocalizacionContext context)
		{
			return new Elemento (context.IDENT().GetText(), sacarCoordenadas(context.coordenadas()));
		}

		public List<Coordenada> sacarCoordenadas(LaberintoParser.CoordenadasContext context)
		{
			List<Coordenada> lista_coordenadas = new List<Coordenada>();
			LaberintoParser.CoordContext[] coordenadas = context.coord();
			for (int i = 0; i < coordenadas.Length; i++) {
				lista_coordenadas.Add(sacarCoordenada(coordenadas[i]));
			}
			return lista_coordenadas;
		}

		//Métodos 

		public Coordenada sacarCoordenada(LaberintoParser.CoordContext context) {
            return new Coordenada(Int32.Parse(context.num1.Text), Int32.Parse(context.num2.Text));
        }

		public void comprobarSemantica()
		{
			if (laberinto.getDefinicion() != null) AnalisisSemantico.declaracionUnica(laberinto.getDefinicion());
			AnalisisSemantico.coordenadaValida("Declaración de inicio: ", laberinto.getDimension(), laberinto.getInicio());
			AnalisisSemantico.coordenadaValida("Declaración de meta: ", laberinto.getDimension(), laberinto.getMeta());
			//Comprobar que inicio y meta no están en la misma coordenada
			if (laberinto.getLocalizaciones() != null) AnalisisSemantico.comprobarLocalizaciones(laberinto.getInicio(), laberinto.getMeta(), laberinto.getDimension(), laberinto.getDefinicion(), laberinto.getLocalizaciones());

		}


	}
}
