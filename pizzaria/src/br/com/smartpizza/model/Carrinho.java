package br.com.smartpizza.model;

import java.util.List;

public class Carrinho {
	private int item;
	private int idProduto;
	private String nomeProduto;
	private String tamanho;
	private float valorProduto;
	
	
	public float getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProdutp(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Carrinho(int item, int idProduto, String nomeProduto, String tamanho, float valorProduto) {
		super();
		this.item = item;
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.tamanho = tamanho;
		this.valorProduto = valorProduto;
	}
	 public Carrinho() {
		// TODO Auto-generated constructor stub
	}
	
	
}
