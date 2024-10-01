import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TabalasHashNvdiaExemplos {
    public static void main(String[] args) {
        
        HashMap<String, String> hashMapPlacasNvdia = new HashMap<>();
        hashMapPlacasNvdia.put("RTX 3090", "24GB GDDR6X");
        hashMapPlacasNvdia.put("RTX 3080", "10GB GDDR6X");
        hashMapPlacasNvdia.put("RTX 3060 Ti", "8GB GDDR6");
        System.out.println("Memória da placa RTX 3080: " + hashMapPlacasNvdia.get("RTX 3080"));
        

        HashSet<String> hashSetModelos = new HashSet<>();
        hashSetModelos.add("RTX 3070");
        hashSetModelos.add("GTX 1660");
        hashSetModelos.add("RTX 3060 Ti");
        System.out.println("\nModelo 'GTX 1660' está na lista? " + hashSetModelos.contains("GTX 1660"));


        Hashtable<String, Integer> hashtablePotencia = new Hashtable<>();
        hashtablePotencia.put("RTX 3090", 350);
        hashtablePotencia.put("RTX 3080", 290);
        hashtablePotencia.put("RTX 3070", 220);
        System.out.println("\nPotência de cálculo da placa RTX 3070: " + hashtablePotencia.get("RTX 3070") + " TFLOPS");


        LinkedHashMap<String, String> linkedHashMapClock = new LinkedHashMap<>();
        linkedHashMapClock.put("RTX 3090", "1.70 GHz");
        linkedHashMapClock.put("RTX 3080", "1.71 GHz");
        linkedHashMapClock.put("RTX 3060 Ti", "1.67 GHz");
        System.out.println("\nVelocidade de clock da RTX 3060 Ti: " + linkedHashMapClock.get("RTX 3060 Ti"));

        ConcurrentHashMap<String, Integer> concurrentHashMapVendas = new ConcurrentHashMap<>();
        concurrentHashMapVendas.put("RTX 3090", 1500);
        concurrentHashMapVendas.put("RTX 3080", 3000);
        concurrentHashMapVendas.put("RTX 3070", 2000);
        System.out.println("\nVendas da placa RTX 3080: " + concurrentHashMapVendas.get("RTX 3080") + " unidades");
    }
}
