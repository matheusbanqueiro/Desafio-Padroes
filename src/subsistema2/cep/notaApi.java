package subsistema2.cep;

public class notaApi {
	private double nota1, nota2, nota3, nota4;
	
private static notaApi instancia = new notaApi();
	
	public static notaApi getInstancia() {
		return instancia;
	}
	public double recuperarNotap(double notaP) {
		nota1 = notaP;
		return notaP;
	}
	public double recuperarNotas(double notaS) {
		nota2 = notaS;
		return notaS;
	}
	public double recuperarNotat(double notaT) {
		nota3 = notaT;
		return notaT;
	}
	public double recuperarNotaq(double notaQ) {
		nota4 = notaQ;
		return notaQ;
	}
	public double media() {
	   	double media = (nota1 + nota2 + nota3 + nota4)/ 4;
	   	return media;
	}
	public String situacao() {
		if(media()>= 6) return "**APROVADO!**";
		else return "**REPROVADO!**";
	}
}
