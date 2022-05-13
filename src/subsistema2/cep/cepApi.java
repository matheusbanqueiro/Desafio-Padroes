package subsistema2.cep;

public class cepApi {
	
private static cepApi instancia = new cepApi();
	
	public static cepApi getInstancia() {
		return instancia;
	}
	public String recuperarCidade(String cidade) {
		return "Americana";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
	
}
