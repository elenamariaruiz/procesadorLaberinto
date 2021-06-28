/* import java.util.Date; */

class Coordenada  implements Comparable<Coordenada>{

	private Integer x;
	private Integer y;

	public Integer getCoordX() {
		return x;
	}

	public void setCoordX(Integer x) {
		this.x = x;
	}

	public Integer getCoordY() {
		return y;
	}

	public void setCoordY(Integer y) {
		this.y = y;
	}


	public Coordenada(Integer x, Integer y) {

		this.x = x;
		this.y = y;
	}

	public int compareTo(Coordenada coord){

		if(this.x.equals(coord.getCoordX()) && this.y.equals(coord.getCoordY())){			
			return 0;
		}
		return -1;
	}

	public String toString() {
		return "<x> "+this.x+"</x>\n\t\t\t<y>"+this.y+"</y>\n";
	} 
}