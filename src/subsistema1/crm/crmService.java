package subsistema1.crm;

public class crmService {
	private static int totalAlunos;
	
	
	public static void gravarAluno(String nome, String cep, double notaP, double notaS, double notaT, double notaQ, double media, String situacao, String cidade, String estado) {
	
	totalAlunos++;
	
	System.out.println("=================================");
	System.out.println("Nome: " + nome);
	System.out.println("Cidade: " + cidade);
	System.out.println("Estado: " + estado);
	System.out.println("Cep: " + cep);
	System.out.println("=================================");
	System.out.println("===== Notas desse aluno =====");
	System.out.println("1º Nota: " + notaP);
	System.out.println("2º Nota: " + notaS);
	System.out.println("3º Nota: " + notaT);
	System.out.println("4º Nota: " + notaQ);
	System.out.println("Média desse semestre foi de: " + media);
	System.out.println("Situação do Aluno: " + situacao);
	System.out.println("=================================");
	System.out.println("***** Aluno salvo no sistema! *****");
	System.out.println("=================================");
	
	}
	public static int totalAlunos() {
		return totalAlunos++;
	}
}
