package appContatos;

import java.util.Scanner;

public class Pessoa {

    String nome;
    String telefone;
    String email;
    String cidade;
    String estado;
    String statusContato;
  

    public static void cadastrar() {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Nome: ");
        pessoa.nome = input.next();

        System.out.print("Telefone: ");
        pessoa.telefone = input.next();

        System.out.print("E-mail: ");
        pessoa.email = input.next();

        System.out.print("Cidade: ");
        pessoa.cidade = input.next();

        System.out.print("Estado: ");
        pessoa.estado = input.next();

        pessoa.statusContato = "Enable";
    }

}
