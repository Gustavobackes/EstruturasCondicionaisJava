



package jogo;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[]args) {
	PrintStream show = System.out;
	Scanner scan = new Scanner(System.in);
	Random gerador = new Random();
	
	int opcao;
	int escolha_computador;
	int escolha_usuario;
	        
	show.println("Ol�, qual seu nome? ");
	String nome = scan.nextLine();
	show.println("Bem vindo ao jogo "+ nome);
	show.println("\n informe o numero da sua op��o\n 1<-sim\n 2<-n�o");
	opcao = scan.nextInt();
	if(opcao == 2) {
		show.println("Tudo bem, fica pra pr�xima :(");
	}else if(opcao == 1) {
		show.println("Como funciona o jogo:");
		show.println("Eu vou sortear um nomero de 1 a 10 e voc� tera que advinhar.");
		show.println("Boa sorte :)");
	}
	
	escolha_computador = gerador.nextInt(11);
	
	show.println("Certo "+nome+" ja escolhi");
	do {
		escolha_usuario = scan.nextInt();
		if(escolha_usuario != escolha_computador) {
			show.println("Resposta errada...");
		}else {
			show.println("Parabens! acertou.");
		}
	}while(escolha_computador != escolha_usuario);
	}

}
