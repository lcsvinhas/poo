package org.serratec.testes;

import org.serratec.aula.Aluno;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
//      Aluno[3] aluno = {new Aluno("Marcos",40,"m@gmail.com")}
        Aluno[] alunos = new Aluno[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scan.next();
            System.out.print("Digite a idade do aluno: ");
            int idade = scan.nextInt();
            System.out.print("Digite o email do aluno: ");
            String email = scan.next();
            alunos[i] = new Aluno(nome, idade, email);
        }

        scan.close();

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }
}
