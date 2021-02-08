package entities;

public class Produto {
        public String nome;
        public double salario;
        public double desconto;
        
        public double total(){
           return salario-desconto;
        }
        public void taxa(double taxa) { 
        	this.salario = salario+(salario*(taxa/100));
        }
        public String toString() {
        	return "Empregado: "
        			+ nome
        			+ ",salario R$: "
        			+String.format("%.2f", total());
        }
}     

