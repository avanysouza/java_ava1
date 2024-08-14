package Computador;

import java.util.Scanner;

public class AppComputador {
    public static void main(String[] args) {

        //Vetor para criação de quatro objetos a partir da classe Computador
        Computador c[] = new Computador[4];

        //Ciclo para criação dos objetos do tipo Computador
        for(int i = 0; i < c.length; i++){
            if(i < 2){
                //Instanciar com o construtor default para as duas primeiras posições do array
                c[i] = new Computador();
                c[i].inserirDados(); //chamar o método inserirDados criado na classe Computador;
            } else{
                //Solicitar dados ao usuário e armazenar valor em cada atributo (marca, modelo, ram, setor, ano)
                Scanner sc = new Scanner(System.in);
                System.out.println("Insira os dados para cadastro do computador: (Construtor com parametros)");
                System.out.println("Marca: ");
                String marca = sc.nextLine();
                System.out.println("Modelo: ");
                String modelo = sc.nextLine();
                System.out.println("Ram: ");
                String ram = sc.nextLine();
                System.out.println("Setor: ");
                String setor = sc.nextLine();
                System.out.println("Ano: ");
                int ano = sc.nextInt();

                //Instanciar com o construtor que recebe todos os atributos inseridos acima.
                c[i] = new Computador(marca, modelo, ram, setor, ano);
            }

        }

        //Ciclo para imprimir objetos do array com 4 elementos

        for(int i = 0; i < c.length; i++){
            c[i].imprimir();
        }

    }

}