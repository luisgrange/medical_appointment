//André Luís da Costa Elisei - 72356
//Luís Fernando Grange Ferreira - 75395

import java.util.*;
public class Menu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		java.util.ArrayList<Agendamento> agendArr = new java.util.ArrayList<Agendamento>();
		java.util.ArrayList<Integer> newArr = new java.util.ArrayList<Integer>();
		String nome, especialidade, CRM;
		int matricula, quant, resposta, dia, mes, respMedico=0;
		
		System.out.print("Quantos medicos deseja adicionar? ");
		quant = scan.nextInt();
		
		System.out.println("\nCADASTRO DE MEDICO");
		
		for(int i=0; i<quant; i++) {
			System.out.print("\nDeseja fazer o cadastro simples? 0-sim, 1-nao: ");
			resposta = scan.nextInt();
			
			if(resposta == 0) {
				System.out.print("Digite o nome do medico: ");
				nome = scan.next();
				Agendamento agendamento = new Agendamento(nome);
				agendArr.add(agendamento);
			}
			
			else {
				System.out.print("Digite o nome do medico: ");
				nome = scan.next();
				System.out.print("Digite o CRM: ");
				CRM = scan.next();
				System.out.print("Digite a matricula: ");
				matricula = scan.nextInt();
				Agendamento agendamento = new Agendamento(nome, CRM, matricula);
				agendArr.add(agendamento);
			}
		}

		//Definindo o agendamento
		resposta = 0;
		System.out.println("\nREALIZACAO DE AGENDAMENTO");
		while(resposta == 0) {
			Agendamento agendamento = new Agendamento();
			System.out.println("Escolha um medico");
			for(int i=0; i<quant; i++) {
				System.out.printf("\tDigite %d para %s\n", i, agendArr.get(i).getNome());
			}
			
			respMedico = scan.nextInt();
		
			System.out.print("\nDigite a especialidade: ");
			especialidade = scan.next();
			agendArr.get(respMedico).setEspecialidade(especialidade);
			
			System.out.print("Digite o dia: ");
			dia = scan.nextInt();
			agendArr.get(respMedico).setDia(dia);
			
			System.out.print("Digite o mes: ");
			mes = scan.nextInt();
			
			agendArr.add(agendamento);
			agendArr.get(respMedico).setMes(mes);
			
			newArr.add(respMedico);
			
			System.out.println("Deseja realizar outro agendamento? 0-sim, 1-nao:");
			resposta = scan.nextInt();
		}
		
		System.out.println("\nRELATORIO");
		for(int i=0; i<newArr.size(); i++) {
			agendArr.get(newArr.get(i)).Relatorio();
		}
		
		scan.close();
	}

}
