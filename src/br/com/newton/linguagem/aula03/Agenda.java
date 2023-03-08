package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {

        //Criando um objeto telefone utilizando um construtor sem parâmetro padrão
        Telefone telefone = new Telefone();
        Contato contato = new Contato();

        Telefone tel1 = new Telefone();
        tel1.marca = "iPhone";
        tel1.cor = "Branco";
        tel1.Tocar("Pagode");
        Contato con1 = new Contato();
        con1.nome = "João";
        con1.numero = "318989952";
        tel1.contato = con1;
        tel1.Ligar(tel1);

        Telefone tel2 = new Telefone();
        tel2.marca = "S20";
        tel2.cor = "Preto";
        tel1.Tocar("Rock");
        Contato con2 = new Contato();
        con2.nome = "Carmen";
        con2.numero = "3189871147";
        tel2.contato = con2;
        tel2.Ligar(tel2);
    }
}
