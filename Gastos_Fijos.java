import java.io.*;
public class Gastos_Fijos{

	private int renta;
	private int gas;
	private int luz;
	private int agua;
	private int colegiatura;


	public void setRenta(int cantidad){
		this.renta=cantidad;
	}


	public int getRenta(int cantidad){
		this.renta=cantidad;
		return this.renta;
	}
	

	public void setGas(int cantidad){
		this.gas = cantidad;
	}


	public int getGas(int cantidad){
		this.gas = cantidad;
		return this.gas;
	}


	public void setLuz(int cantidad){
		this.luz = cantidad;
	}


	public int getLuz(int cantidad){
		this.luz = cantidad;
		return this.luz;

	}

	public void setAgua(int cantidad){
		this.agua = cantidad;
	}


	public int getAgua(int cantidad){
		this.agua = cantidad;
		return this.agua;

	}

	public void setColegiatura(int cantidad){
		this.colegiatura = cantidad;
	}

	public int getColegiatura(int cantidad){
		this.colegiatura = cantidad;
		return this.colegiatura;

	}
}