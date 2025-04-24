package org.serratec.testes;

import org.serratec.entitity.Fornecedor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializable {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("ABC XPTO", "123");
        Fornecedor f2 = new Fornecedor("XYZ LTDA", "321");
        List<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores.add(f1);
        fornecedores.add(f2);
        List<Fornecedor> fornecedoresLeitura = new ArrayList<>();
//
//        try {
//            FileOutputStream caminhoGravar = new FileOutputStream("c:/curso/fornecedor.dat");
//            ObjectOutputStream gravarObjeto = new ObjectOutputStream(caminhoGravar);
//            gravarObjeto.writeObject(fornecedores);
//            gravarObjeto.flush();
//            gravarObjeto.close();
//        } catch (Exception e) {
//            System.err.println("Problema ao gravar objeto");
//            e.printStackTrace();
//        }

        System.out.println("-=-=-=-=-=-=-=-=- Recuperando Arquivo -=-=-=-=-=-=-=-=-");
        try {
            FileInputStream caminhoLeitura = new FileInputStream("c:/curso/fornecedor.dat");
            ObjectInputStream lerObjeto = new ObjectInputStream(caminhoLeitura);
            fornecedoresLeitura = (List<Fornecedor>) lerObjeto.readObject();
        } catch (Exception e) {
            System.err.println("Problema ao ler arquivo");
            e.printStackTrace();
        }
        System.out.println("Dados da leitura do arquivo:");
        System.out.println(fornecedoresLeitura);
    }
}
