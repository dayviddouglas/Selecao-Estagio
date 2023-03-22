package Quartaquestao;

public class Regioes {
  private String cidade;
  private double faturamento;
  
  
public Regioes(String cidade, double faturamento) {
	super();
	this.cidade = cidade;
	this.faturamento = faturamento;
}



public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public double getFaturamento() {
	return faturamento;
}
public void setFaturamento(double faturamento) {
	this.faturamento = faturamento;
}
  
@Override
public String toString() {
	return "Regioes [cidade=" + cidade + ", faturamento=" + faturamento + "]";
}
}
