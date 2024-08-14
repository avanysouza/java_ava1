package Computador;
import java.util.Scanner;

public class Computador {

    String marca, modelo, ram, setor;
    int ano;

    public void setMarca(String marca) {
        if(!marca.isEmpty()){
            this.marca = marca;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        if(!modelo.isEmpty()){
            this.modelo = modelo;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setRam(String ram) {
        if(!ram.isEmpty()){
            this.ram = ram;
        }
    }

    public String getRam() {
        return ram;
    }

    public void setSetor(String setor) {
        if(!setor.isEmpty()){
            this.setor = setor;
        }
    }

    public String getSetor() {
        return setor;
    }


    public void setAno(int ano) {
        if(ano > 0){
           this.ano = ano;
        }
    }

    public int getAno() {
        return ano;
    }

    //Métodos construtores

    public Computador(){

    }

    public Computador(String marca, String modelo, String setor, String ram, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.setor = setor;
        this.ano = ano;
    }

    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados para cadastro do computador: (Construtor default)");
        System.out.println("Marca: ");
        setMarca(sc.nextLine());
        System.out.println("Modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Ram: ");
        setRam(sc.nextLine());
        System.out.println("Setor: ");
        setSetor(sc.nextLine());
        System.out.println("Ano: ");
        setAno(Integer.parseInt(sc.nextLine()));
    }


    public void imprimir(){
        System.out.println("------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ram: " + ram);
        System.out.println("Setor: " + setor);
        System.out.println("Ano: " + ano);
    }

}
