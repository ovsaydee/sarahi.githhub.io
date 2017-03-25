import java.io.*;
public class Movimientos {

	private float compra;
	private float pago_servicio;
	private float transporte;
	private float alimentos;
	private float ropa;



public void setCompra(int cantidad){
	this.compra = cantidad;
}
public void addPagoServ(float cantidad){
        this.pago_servicio = cantidad;
}

public void addTransporte(float cantidad){
	this.transporte = cantidad;
	
}
public void addAlimentos(float cantidad){
	this.alimentos = cantidad;
}
	public void addRopa(int cantidad){
	this.ropa = cantidad;
}
}
