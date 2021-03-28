import java.io.*;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setId(99);
        user.setNome("ITALO REIS");
        user.setObs("It's Me !");

        escrever(user);
        ler();

    }
    private static void escrever ( User user ){
        File dir = new File ("C:\\Users\\Italo\\Desktop\\TXT COM JAVA");
        File arq = new File (dir , "User.txt");

        try{
            // Cria Arquivo !
            arq.createNewFile();

            /*
                Devemos passar no construtor do FileWriter qual arquivo
                vamos manipular. Esse construtor aceita dois tipos de parâmetros,
                File ou String. O parâmetro true indica que reescrevemos no arquivo
                sem apagar o que já existe. O false apagaria o conteúdo do arquivo e escreveria
                o novo conteúdo. Se não usar o 2° parâmetro, ele por padrão será false.
                O mais importante, essa linha abre o fluxo do arquivo
            */

            FileWriter fileWriter = new FileWriter(arq , false);

            /*
                Agora vamos usar a classe PrintWriter para escrever fisicamente no arquivo.
                Precisamos passar o objeto FileReader em seu construtor
            */

            PrintWriter printWriter = new PrintWriter(fileWriter);

            //Agora vamos escrever no arquivo com o método  println(),que nos permite escrever linha a linha no arquivo

            printWriter.println("TUDO  NA MESMA LINHA");
            printWriter.print(user.getId());
            printWriter.print(" - " + user.getNome());
            printWriter.println(" - " + user.getObs()); //Escreve  e pula uma linha !
            printWriter.println("####################################################");
            printWriter.println("LINHAS SEPARADAS");
            printWriter.println(" * " + user.getId());
            printWriter.println(" * " +user.getNome());
            printWriter.println(" * " +user.getObs());

            //Libera a escrita no arquivo
            printWriter.flush();

            // Fecha o arquivo
            printWriter.close();



        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void ler() {

        File dir = new File ("C:\\Users\\Italo\\Desktop\\TXT COM JAVA");
        File arq = new File (dir , "User.txt");
        try{
            // Informa arquivo que será lido !
            FileReader fileReader = new FileReader(arq);

            //Criado o objeto bufferReader que nos oferece o método de leitura readLine()
            BufferedReader bufferReader = new BufferedReader(fileReader);

            //Var q vai receber linha !
            String linha = "";

            // Le o arquivo até que a linha seja nula
            while ((linha = bufferReader.readLine())!= null){
             /*
              Verifica se linha contem valor informado
              if (linha.indexOf("99") != -1 ){
                  System.out.println("Achou");
              }
              */
                // Comparar Strings no Java
                if (linha.substring(0,2).equals("99") )
                   System.out.println(linha.substring(5,10)); // Pegar posição inicial e final da string

            }

            // Libera os objeos
            fileReader.close();
            bufferReader.close();

        }catch (IOException e ){
            e.printStackTrace();
        }



    }

}
