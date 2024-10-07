import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Fernando");
        names.add("Afonso");
        names.add("Daniel");
        names.add("Carlos");

//        Impressão do ArrayList sem Collections e sem odenar
        for (String nomes : names) {
            System.out.println(nomes);
        }
        System.out.println();

//        Usando biblioteca Collections para organizar o Arraylist na ordem crescente
        Collections.sort(names);
        for(String name : names) {
            System.out.println(name);
        }

    }
}
