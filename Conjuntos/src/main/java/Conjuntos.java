import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Conjuntos {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader("abcd abc abc abc");
        // BufferedReader br = new BufferedReader(new InputStreamReader("abcd abcd abc abc abc"));
        // BufferedReader br = new BufferedReader(new InputStreamReader("dwh t cohor dkvwcsg sqoqms b a"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "3 abc dae abcde 2 abc def 0" ;

        StringTokenizer st = new StringTokenizer(line);

        //Lista para receber palavras
        ArrayList<String> listFull = new ArrayList<>();
        List<String> conjunto = new ArrayList<>();

        // Monta lista com a saida
        while (st.hasMoreTokens()) {
            listFull.add(st.nextToken());
        }

        Integer cont =  Integer.parseInt(listFull.get(0)) ;
        Integer aux = 0 ;

        while (cont != 0){
            aux++;
            for (int i = 0 ; i < cont ; i++){
                conjunto.add(listFull.get(aux));
                aux++;
            }
            conjunto = conjunto.stream().sorted().collect(Collectors.toList());
            compararConjunto(conjunto);
            conjunto.clear();
            cont =  Integer.parseInt(listFull.get(aux));
        }
    }


    public  static  void compararConjunto (List<String> lista){

        String resultado = "Conjunto Bom";
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i + 1).startsWith(lista.get(i))) {
                resultado = "Conjunto Ruim";
                break;
            }
        }


        System.out.println(resultado);

    }
}
