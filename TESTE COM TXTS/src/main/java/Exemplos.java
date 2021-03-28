import java.io.File;
import java.io.IOException;

public class Exemplos {
    /*
    // CONSTRUTOR DO CRIADOR DE DIRETÓRIO
    java.io.File diretorio = new java.io.File("C:\\Users\\Italo\\Desktop\\TXT COM JAVA");
    // CRIA O DIRETÓRIO E SALVA EM VARIAVÉL BOOLEANA PARA SUCESSO OU NAO
    boolean statusDir = diretorio.mkdir();
        if (statusDir) {
        System.out.println("Diretório Criando com Sucesso !");
    }
        else{
        System.out.println("Diretório já existe !");
    }

    java.io.File arquivo = new java.io.File(diretorio , "teste de arquivo.txt");
        try
    {
        // Cria apenas se arquivo não existir
        if(!(arquivo.exists()))
            arquivo.createNewFile();

        // Cria Arquivo TXT e salva status na variavél
        // boolean statusArquivo =  arquivo.createNewFile(); Valida se arquivo foi criado
        /*if (statusArquivo){
            System.out.println("Arquivo txt criado com sucesso !");
        }
        else{
            System.out.println("Arquivo já existente ou não cirado!");
        }
    }catch(
    IOException e){
        e.printStackTrace();
    }

    // Verifica arquivos de um diretório especifico
    // Cronstrutor para verificar arquivos de um diretório
    File files = new File(diretorio.getPath()); // Pega diretório da variavél de explorer
        for (File file : files.listFiles()){
        System.out.println(file.getName());// Listar arquivos
    }


    File  renomear = new File (diretorio , "Arq1.txt");
        arquivo.renameTo(renomear) ;
        System.out.println("Arquivo Renomeado!");

    //Criar um txt
    java.io.File arquivo2 = new java.io.File(diretorio , "Arq2.txt");
        try
    {
        arquivo2.createNewFile();

    }catch(IOException e){
        e.printStackTrace();
    }

    // Validar se objeto é um arquivo ou um diretório
        for (File f : diretorio.listFiles()){
        if (f.isDirectory())
            System.out.println("É um diretório");
        else if (f.isFile())
            System.out.println("É um arquivo !");
    }

    // Apagar um arquivo
        diretorio.delete();
        arquivo.delete();


*/
}
