package exemploAlunos;


public class exemploAlunos {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARIANA"};

        //nesse exemplo, trabalhamos a estrutura de repetição "for" com um array
        //for (int x = 0; x < alunos.length; x++){
        //    System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        //}


        //já nesse, é uma forma abreviada de conseguir o mesmo resultado esperado do anterior,
        // porém, procurando por meio de elementos do array

        //quando colocamos esses dois pontos, dizemos que "a cada interação de alunos (o array) a  variável aluno será atualizada
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
