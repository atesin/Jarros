package cl.netgamer.jarros;

public class Jarro
{
	private int capacidad;
	private int contenido;
	
	public Jarro(int capacidad)
	{
		this.capacidad = capacidad;
	}
	
	int getCapacidad()
	{
		return capacidad;
	}
	
	int getContenido()
	{
		return contenido;
	}
	
	int getDisponible()
	{
		return capacidad - contenido;
	}
	
	void vaciar()
	{
		contenido = 0;
	}
	
	void llenar()
	{
		contenido = capacidad;
	}
	
	void llenar(int relleno)
	{
		contenido = Math.min(contenido + relleno, capacidad);
	}
	
	void trasVaciar(Jarro destino)
	{
		int relleno = Math.min(destino.getDisponible(), contenido);
		destino.llenar(relleno);
		contenido -= relleno;
	}
	
}
