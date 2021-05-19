using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace antlr_c.Clases
{
    class Coordenada
    {
		private int x;
		private int y;

		public int getCoordX()
		{
			return x;
		}

		public void setCoordX(int x)
		{
			this.x = x;
		}

		public int getCoordY()
		{
			return y;
		}

		public void setCoordY(int y)
		{
			this.y = y;
		}


		public Coordenada(int x, int y)
		{

			this.x = x;
			this.y = y;
		}

	}
}
