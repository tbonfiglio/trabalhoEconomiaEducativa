import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Thiago_NB
 */
public class TrabalhoEconomia {

    private static String arquivoCSV;
    public static ArrayList<String> assuntosMacro = new ArrayList<>();
    public static ArrayList<String> assuntosMicro = new ArrayList<>();
    public static Map<String, Questoes> questoesMicro = new HashMap<String, Questoes>();
    public static Map<String, Questoes> questoesMacro = new HashMap<String, Questoes>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configurar();
        new JanelaInicial().setVisible(true);
    }
    
    public static void Configurar() {
        arquivoCSV = "QuestoesSalvas.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] questao = linha.split(csvDivisor);
                
                String assunto = questao[0];
                String titulo = questao[1];
                String contexto = questao[2];
                String respostaEsquerda = questao[3];
                String respostaDireita = questao[4];
                String detalhesResposta = questao[5];
                boolean respostaEsquerdaCerta = Boolean.getBoolean(questao[6]);

                if ("Micro".equals(assunto)){
                    assuntosMicro.add(titulo);
                    
                    questoesMicro.put(titulo, new Questoes(titulo, contexto, 
                            respostaEsquerda, respostaDireita, 
                            detalhesResposta, respostaEsquerdaCerta));
                } else {
                    assuntosMacro.add(titulo);
                    
                    questoesMacro.put(titulo, new Questoes(titulo, contexto, 
                            respostaEsquerda, respostaDireita, 
                            detalhesResposta, respostaEsquerdaCerta));
                }
            }

        } catch (FileNotFoundException e) {
            new Avisos("Arquivo não encontrado no caminho: \n" + arquivoCSV)
                    .setVisible(true);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    } 
}
