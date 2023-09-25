import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;


public class Jogo{
    public static void main(String[] args){
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usuario;

        show.println("Olá, qual seu nome?");
        String nome = scan.nextLine();
        show.println("Prazer em conhece-lô " + nome + "!");
        show.println("Você quer jogar comigo?");
        show.println("\nEscolha a opção: \n1 para jogar \n2 para não jogar");
        opcao = scan.nextInt();

        boolean acertou = false;

            if (opcao == 2) {
            show.println("Que pena que você não quer jogar, podemos jogar mais tarde :)");
        }else if(opcao == 1){
            show.println("Ok, vamos jogar, o jogo é assim: ");
            show.println("Eu vou escolher um número de 0 a 10 e você tem 3 chances de acertar o número e se você adivinhar você será o vencedor ");

            
            escolha_computador = gerador.nextInt(11);
        
            

            show.println("Ok, " + nome + ", eu já escolhi agora tente adivinhar o número que eu escolhi");
            show.println("Agora tente adivinhar!");

            for(int i = 0; i < 3; i++) {
                escolha_usuario = scan.nextInt();
                if(escolha_usuario != escolha_computador){
                    show.println("Resposta errada." );
                }else{
                    show.println("Parabéns, você conseguiu");
                    acertou = true;
                    break;
                }
            }

            if(!acertou){
                show.println("Usou todas as tentativas");
            }
        }
        }
        
    }
