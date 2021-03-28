import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class DIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //insira sua solução aqui
        //Lista para receber palavras
        ArrayList<String> listFull = new ArrayList<>();

        // Monta lista com a saida
        while (st.hasMoreTokens()) {
            listFull.add(st.nextToken());
        }

        Boolean noProcess = false;

        for (String x : listFull){
            if (x.equals(".")) {
                noProcess = true;
            }
        }

        if (!noProcess)
        {
            // Conta as palavras
            Map<String,Integer> palavrasContadas = contarPalavras(listFull);
            // Calcula o peso
            Map<String,Integer> reducoesPeso = calcularReducao(listFull,palavrasContadas);

            Integer  menorReducao = 9999999;

            for (String x : listFull){
                menorReducao = reducoesPeso.get(x) < menorReducao &&  reducoesPeso.get(x) > 0 ? reducoesPeso.get(x) : menorReducao;
            }

            Integer qtd = 0 ;

            Map<String,String> abreviacoes = new HashMap<String,String>();

            for(String x : listFull){
                if ((reducoesPeso.get(x) > menorReducao) && (!abreviacoes.containsKey(x))) {
                    abreviacoes.put(x,x.substring(0,1)+".");
                    qtd ++ ;
                }
            }

            for (String x : listFull){
                System.out.print(abreviacoes.containsKey(x) ? abreviacoes.get(x) + " " : x + " ");
            }

            System.out.println();
            System.out.println(qtd);

            for (String key : abreviacoes.keySet()) {
                String value = abreviacoes.get(key);
                System.out.println(value + " = " + key);
            }

        }
    }
    public static Map<String,Integer> contarPalavras (ArrayList<String> lista) {

        Map<String,Integer> contWords = new HashMap<String,Integer>();

        for (String x : lista){

           /* Maneira Convencional
           if (!contWords.containsKey(x)){
                contWords.put(x,1);
            }else
            {
                contWords.put(x,contWords.get(x)+1  );
            }*/

            // Usando Lambida
            contWords.put(x , contWords.containsKey(x) ? contWords.get(x)+1 : 1);
        }

        return contWords;

    }

    public static  Map<String,Integer> calcularReducao (ArrayList<String> lista , Map<String,Integer> map){
        //Peso das palavras
        Map<String,Integer> palavrasPesoReducao = new HashMap<String,Integer>();
        for (String x : lista){
            // Tamano menos 2 pois a abreviação e inicial + .  e * a quantidade de repeticoes
            palavrasPesoReducao.put(x, x.length() > 2 ? (x.length() -2) * map.get(x) : 0);
        }
        return palavrasPesoReducao;

    }
}