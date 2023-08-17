package br.com.lojavirtual;



public abstract class Carro {
	
	public String cor;
	
	public String ano;
	
	
	public abstract String combustao();


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}
}

