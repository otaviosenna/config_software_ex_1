import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("a) Método que retorna quantas ocorrências de um elemento estão na lista:");
        System.out.println("");
        ArrayList<String> frutas1 = FrutasList1.getFrutas();

        String frutaProcurada = "Banana";
        int ocorrencias = Ocorrencias.nOcorrencias(frutas1, frutaProcurada);

        System.out.println("A fruta '" + frutaProcurada + "' ocorre " + ocorrencias + " vezes na lista.");
        
        System.out.println("");
        
        System.out.println("b) Método que retorna true se l tem elementos repetidos");
        System.out.println("");
        boolean temRepeticao = Repeticoes.hasRepeat(frutas1);

        if (temRepeticao) {
            System.out.println("A lista possui elementos repetidos.");
        } else {
            System.out.println("A lista não possui elementos repetidos.");
        }

        System.out.println("");
        
        System.out.println("c) Método que retorna o número de elementos repetidos em l");
        System.out.println("");
        
        int numeroRepeticoes = NroRepeticoes.nroRepeat(frutas1);

        System.out.println("O número de elementos repetidos na lista de frutas é: " + numeroRepeticoes);

        System.out.println("");
        
        System.out.println("d) Método que retorna uma lista de elementos repetidos de l");
        System.out.println("");

        // Aqui vai a chamada do método
        
        System.out.println("");
        
        System.out.println("e) Método que retorna a união de l1 e l2");
        System.out.println("");
        
        ArrayList<String> frutas2 = FrutasList2.getFrutas();
        
        ArrayList<String> uniao = Union.union(frutas1, frutas2);

        System.out.println("União das listas de frutas:");
        
        for (String fruta : uniao) {
            System.out.println(fruta);
        }    
        
        System.out.println("");
        
        System.out.println("f) Método que retorna a intersecção de l1 e l2");
        System.out.println("");
        
        ArrayList<String> intersecao = Intersec.intersect(frutas1, frutas2);

        System.out.println("Interseção das listas de frutas:");
        for (String fruta : intersecao) {
            System.out.println(fruta);    
        }

            Scanner entradas = new Scanner(System.in);
        
        System.out.println("Digite a moeda a ser convertida: "); 
    
        String moedaOriginal = entradas.nextLine();

        System.out.println("Digite o valor a ser convertido: "); 
    
        double valorOriginal = entradas.nextInt();

        System.out.println("Digite a moeda para qual você quer converter: "); 
        
        entradas.nextLine();
        
        String moedaTarget = entradas.nextLine();
        
        double conversao = 0;
        
        
        switch(moedaOriginal){
            case "BRL":
                switch(moedaTarget) {
                    case "BRL": 
                        conversao = valorOriginal;
                        System.out.println("Sua conversão deu: " + conversao + "BRL");
                        break;
                        
                    case "USD": 
                        conversao = (valorOriginal * 0.18);
                        System.out.println("Sua conversão deu: " + conversao + "USD");
                        break;
                        
                    case "EUR": 
                        conversao = (valorOriginal * 0.15);
                        System.out.println("Sua conversão deu: " + conversao + "EUR");
                        break;
                        
                    default:
                        System.out.println("Você não escolheu uma moeda de conversão aceitável");
                        break;
                    }
                break; 
                
            case "USD":    
                switch(moedaTarget) {
                    case "BRL": 
                        conversao = (valorOriginal / 0.18);
                        System.out.println("Sua conversão deu: " + conversao + "BRL");
                        break;
                        
                    case "USD": 
                        conversao = (valorOriginal);
                        System.out.println("Sua conversão deu: " + conversao + "USD");
                        break;
                        
                    case "EUR": 
                        conversao = (valorOriginal / 0.84);
                        System.out.println("Sua conversão deu: " + conversao + "EUR");
                        break;
                        
                    default:
                        System.out.println("Você não escolheu uma moeda de conversão aceitável");
                        break;
                    }
                break;         
        
            case "EUR":    
                switch(moedaTarget) {
                    case "BRL": 
                        conversao = (valorOriginal / 0.15);
                        System.out.println("Sua conversão deu: " + conversao + "BRL");
                        break;
                        
                    case "USD": 
                        conversao = (valorOriginal * 0.84);
                        System.out.println("Sua conversão deu: " + conversao + "USD");
                        break;
                        
                    case "EUR": 
                        conversao = (valorOriginal);
                        System.out.println("Sua conversão deu: " + conversao + "EUR");
                        break;
                        
                    default:
                        System.out.println("Você não escolheu uma moeda de conversão aceitável");
                        break;
                    }
                break;  
            
            default: 
            System.out.println("Você não escolheu uma moeda de conversão aceitável");
            break;
        }

         
    }
}
