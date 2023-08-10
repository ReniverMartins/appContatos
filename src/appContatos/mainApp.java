package appContatos;
import java.util.*;

import connectBD.connection;

public class mainApp {
	
	static String menu(){
		return ".:::Escolha uma Opção:::.\n1 - Consultar\n2 - Cadastrar\n3 - Alterar\n4 - Excluir\n5 - Status BD\n0 - Sair\n**************************";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		
			String selectOp; 
			boolean op = true;		

		System.out.println(menu());
		selectOp = input.next();

		switch(selectOp){
			case "1": 
			System.out.println(".::CONSULTAR::.");
			break;

			case "2":
			System.out.println(".::CADASTRAR::.");
			appContatos.Pessoa.cadastrar();
			// insertar
		
			break;

			case "3": 
			System.out.println(".::ALTERAR::.");
			break;

			case "4": 
			System.out.println(".::EXCLUIR::.");
			break;

			case "5": 
			connection.getconnection();
			System.out.println(connection.statusConection());
			break;

			case "0":
			System.out.println(".::OBRIGADO POR UTILIZAR::.\n______VOLTE SEMPRE!!______");
			break;

			default: 
			System.out.println("opcao invalida!");
			
		}		

	}

}
