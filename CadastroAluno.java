package orientacao;
import java.util.ArrayList;
import java.util.Scanner;


    public class CadastroAluno {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

            System.out.print("Quantos alunos deseja cadastrar? ");
            int quantidade = ler.nextInt();
            ler.nextLine();
            for (int i = 0; i < quantidade; i++){
                Aluno aluno = new Aluno();
                System.out.println("Digite o nome do aluno: "+"\n");
                aluno.nome = ler.nextLine();
                System.out.println("Informe a idade do aluno: "+"\n");
                aluno.idade = ler.nextInt();
                System.out.println("Informe a primeira nota do aluno: "+"\n");
                aluno.nota1 = ler.nextDouble();
                System.out.println("Informe a segunda nota do aluno: "+"\n");
                aluno.nota2 = ler.nextDouble();

                ler.nextLine();

                alunos.add(aluno);

            }
                for (Aluno a : alunos){
                    System.out.println("Nome: " + a.nome);

                    System.out.println("Média: " + a.calculoMedia());

                    System.out.println("Situação: " + a.verificar());
                }
                ler.close();



    }
        public static class Aluno{
            String nome;
            int idade;
            double nota1;
            double nota2;

            public double calculoMedia(){
                return (nota1+nota2)/2;
            }
            public String verificar() {
                if (calculoMedia() >= 7){
                    return "Parabens, você está aprovado! \uD83D\uDE06";
                } else {
                    return "Você esta reprovado!";
                }

            }

        }

}
