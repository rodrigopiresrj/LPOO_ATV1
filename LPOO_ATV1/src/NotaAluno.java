/*
* 
* A média semestral é a média aritmética simples das médias bimestrais. 
* 
* As médias bimestrais são compostas pelas seguintes atividades: 
*    prova (peso 3), 
*    projeto (peso 3), 
*    lista de exercícios (2) e 
*    contribuição em projetos de software livre/ conclusão de MOOCs recomendados pelo docente (3).
*    
* Os dados devem ser obtidos a partir de input pelo teclado e o programa deve exibir se o aluno foi aprovado ou reprovado. 
* Considere que o aluno deve ser aprovado se obtiver nota igual ou maior que 8.
* 
* Caso o aluno tenha média menor que 8, determine também a nota mínima necessária para a pontuação na prova final, 
* de forma que o aluno garanta aprovação na disciplina. Para tal, basta subtrair do valor 10,00 o valor da média.
* 
*/

import java.util.Scanner;

public class NotaAluno {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double  nota1, nota2, nota3, nota4;
        double  media = 0, media1 = 0, media2 = 0, media_final = 0;
        double nota_minima_final = 0, prova_final = 0;
        int i, contAluno = 0;
        String nome_aluno;
        System.out.println("##########################");
        System.out.println("Nome do Aluno ====>: ");
        System.out.println("##########################");
        nome_aluno = ent.nextLine();

        for(i = 0; i < 2; i++){
        	//Inicio
            
            contAluno++;
            System.out.println("################################################");    
            System.out.println("# Lançamento das Notas " + contAluno + " Bimestre              #");
            System.out.println("################################################");
            // recebe a Prova nota
            System.out.println("Digite nota da Prova do aluno, " + nome_aluno + " ====>: ");
            nota1 = ent.nextDouble();
            nota1 = (nota1*3); // Prova tem peso 3

            // recebe a 2º nota
            System.out.println("Digite nota do Projeto do aluno " + nome_aluno + " ===>: ");
            nota2 = ent.nextDouble();
            nota2 = (nota2*3); // Projeto tem peso 3
            
            // recebe a 3º nota
            System.out.println("Digite nota lista de Exerecicios do aluno " + nome_aluno + " ===>: ");
            nota3 = ent.nextDouble();
            nota3 = (nota3*2); // Lista tem peso 2
            
            // recebe a 4º nota
            System.out.println("Digite nota MOOCs do aluno " + nome_aluno + " ===>: ");
            nota4 = ent.nextDouble();
            nota4 = (nota4*3); // Lista tem peso 3
            
            // calcula a média
            media = ((nota1 + nota2 + nota3 + nota4) / (3+3+2+3));
            
            if(i==0) {
            	media1 = media;
            }else if(i==1) {
            	media2 = media;
            }           
            
            // fim
        }   
        
        media_final = ((media1 + media2)/2);
        nota_minima_final = (10-media_final);
        
        System.out.println("################################################");
        System.out.println("Aluno " + nome_aluno);        
        System.out.println("################################################");
        System.out.println("Media 1º Bimestre =====> " + media1);
        System.out.println("Media 2º Bimestre =====> " + media2);
        System.out.println("################################################");
        System.out.println(" ");
        System.out.println("################################################");
        System.out.println("Media final Semestre ===>" + media_final);
        System.out.println("################################################");
        
        if(media_final>=8) {
        	System.out.println("Aluno  ===> Aprovado");
        } else {
        	System.out.println("Aluno deverá realizar a Prova Final ");
        	System.out.println("Nota mínima para aprovação na Prova Final ====> " + nota_minima_final);
            System.out.println(" ");
        	System.out.println("Digite nota Prova Final do aluno " + nome_aluno + " ===>: ");     
        	prova_final = ent.nextDouble();
        	
        	if(prova_final>=nota_minima_final) {
        		System.out.println("Aluno foi  ===> Aprovado");
        	}else {
        		System.out.println("Aluno foi  ===> Reprovado");
        	}
        		
        }
        
        
    }
}