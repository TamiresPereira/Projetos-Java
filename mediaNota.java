package medianota;
import java.util.Scanner;

public class Exercicio {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media, i, contAluno = 0;
        
        for(i = 0; i < 3; i++){
            
            contAluno++;
            // recebe a 1º nota
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = ent.nextInt();
            
            // recebe a 2º nota
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = ent.nextInt();
            
            // recebe a 3º nota
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = ent.nextInt();
            
            // calcula a média
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno " + contAluno + " é " + media);
            
            // mostra a nota do aluno
            if( (media < 5) {
                System.out.println("Sua nota está abaixo da média");
            } else if(media > 5){
                System.out.println("Sua nota está a cima da média);
            }
            
    }
}