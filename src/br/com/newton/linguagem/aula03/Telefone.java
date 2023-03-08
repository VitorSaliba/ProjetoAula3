package br.com.newton.linguagem.aula03;

public class Telefone {
    Contato contato;
    //Atributo marca
    public String marca;

    //Atributo cor
    public String cor;

    public static void Tocar(String estiloMusical) {
        if(estiloMusical == "Pagode"){
            System.out.println("Só tocamos pagode");
        } else {
            System.out.println("Não tocamos este estilo musical");
        }

    }

    public static void Ligar(Telefone recebedor){
        if(recebedor.cor == "Preto" && recebedor.contato.nome == "Juliana"){
            System.out.println("Ligando para " + recebedor.contato.nome);
        }
    }
}
