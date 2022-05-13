package pack.mae.facade;

import subsistema1.crm.crmService;

public class Main {
	public static void main (String[]args) {
		
		Facade facade1 = new Facade();
		facade1.registrarAluno("Matheus", "087.809-98",9.5,7,6,8);
		facade1.registrarAluno("Lucas", "090.404-60",0,0,6,0); 
		
		System.out.println("Alunos Matriculados: " + crmService.totalAlunos());  
	

		}
	
}
