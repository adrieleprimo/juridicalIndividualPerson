package entities;

public class PessoaFisica extends Pessoa {
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();	
	}

	public PessoaFisica(String name, Double renda, Double gastosSaude) {
		super(name, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public final Double rendaAnual() {
		if(renda <= 2000.00) {
			return (renda*0.15)-(gastosSaude*0.15);
		}
		else {
			return (renda*0.25)-(gastosSaude*0.5);
		}	
	}

	@Override
	public String toString() {
		return name + ": $ " + String.format("%.2f", rendaAnual()) + "\n";
	}	
}
