package br.com.fiap.faculdade.model;

public class Formacao {

	private String decricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	public void definirDuracao() {

	}
	
	public double calcularMedia(double global1, double global2) {
		return  global1*0.4+global2*0.6;
	}
	
	public double calcularMedia(double global1, double checkpoint1,double challenge1,double global2,double checkpoint2,double challenge2) {
		 double mediaSemestreUm =(global1*0.6)+(checkpoint1*0.2)+(challenge1*0.2);
		 double mediaSemestreDois = (global2*0.6)+(checkpoint2*0.2)+(challenge2*0.2);
		 return calcularMedia(mediaSemestreUm,mediaSemestreDois);
	}
	public double calcularMedia(double checkpoint1,double checkpoint2,double checkpoint3){ 
		double media =0;
		if (checkpoint1 >= checkpoint2 && checkpoint3 >= checkpoint2) {
			media = (checkpoint1+checkpoint3)/2;
		}else if(checkpoint2 >= checkpoint1 && checkpoint3 >= checkpoint1) {
			media = (checkpoint2+checkpoint3)/2;
		}else {
			media = (checkpoint1+checkpoint2)/2;
		}
		return media;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Formacao(String decricao, int periodo, double mensalidade, int duracao) {
		super();
		this.decricao = decricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}

	public double calcularMensalidade() {
		// TODO Auto-generated method stub
		return 0;
	}
	
		
	
	
	
	
}
