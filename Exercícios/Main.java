import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("a) Método que retorna quantas ocorrências de um elemento estão na lista:");
        System.out.println("");
        ArrayList<String> frutas = FrutasList1.getFrutas();

        String frutaProcurada = "Banana";
        int ocorrencias = Ocorrencias.nOcorrencias(frutas, frutaProcurada);

        System.out.println("A fruta '" + frutaProcurada + "' ocorre " + ocorrencias + " vezes na lista.");
        
        System.out.println("");
        
        System.out.println("b) Método que retorna true se l tem elementos repetidos");
        System.out.println("");
        boolean temRepeticao = Repeticoes.hasRepeat(frutas);

        if (temRepeticao) {
            System.out.println("A lista possui elementos repetidos.");
        } else {
            System.out.println("A lista não possui elementos repetidos.");
        }

        System.out.println("");
        
        System.out.println("c) Método que retorna o número de elementos repetidos em l");
        System.out.println("");
        
        int numeroRepeticoes = NroRepeticoes.nroRepeat(frutas);

        System.out.println("O número de elementos repetidos na lista de frutas é: " + numeroRepeticoes);
        
    }
}