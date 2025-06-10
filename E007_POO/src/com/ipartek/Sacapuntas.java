package com.ipartek;

public class Sacapuntas {
	
	private String material;
	private boolean estaAfilado;
	private int diametro;
	
	public Sacapuntas(String material, boolean estaAfilado, int diametro) {
		super();
		this.material = material;
		this.estaAfilado = estaAfilado;
		this.diametro = diametro;
	}

	public Sacapuntas() {
		super();
		this.material = "";
		this.estaAfilado = true;
		this.diametro = 0;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isEstaAfilado() {
		return estaAfilado;
	}

	public void setEstaAfilado(boolean estaAfilado) {
		this.estaAfilado = estaAfilado;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		return "Sacapuntas [material=" + material + ", estaAfilado=" + estaAfilado + ", diametro=" + diametro + "]";
	}

	
	
	
	
	

}
