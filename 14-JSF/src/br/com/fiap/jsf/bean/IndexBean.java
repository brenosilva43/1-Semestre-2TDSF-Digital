package br.com.fiap.jsf.bean;

//IMPORTANTE!! IMPORT CORRETO
import javax.faces.bean.ManagedBean;

@ManagedBean
public class IndexBean {

	private String nome;
	
	public void exibirNome() {
		System.out.println(getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
