package pack.mae.facade;

import subsistema1.crm.crmService;
import subsistema2.cep.cepApi;
import subsistema2.cep.notaApi;

public class Facade {
	
	public void registrarAluno(String nome,String cep,double notaP, double notaS, double notaT, double notaQ) {
		
		String cidade = cepApi.getInstancia().recuperarCidade(cep);
		String estado = cepApi.getInstancia().recuperarEstado(cep);
		double nota1 = notaApi.getInstancia().recuperarNotap(notaP);
		double nota2 = notaApi.getInstancia().recuperarNotas(notaS);
		double nota3 = notaApi.getInstancia().recuperarNotat(notaT);
		double nota4 = notaApi.getInstancia().recuperarNotaq(notaQ);
		double media = notaApi.getInstancia().media();
		String situacao = notaApi.getInstancia().situacao();
		
		crmService.gravarAluno(nome, cep, nota1, nota2, nota3, nota4, media, situacao, cidade, estado);
	}
}
