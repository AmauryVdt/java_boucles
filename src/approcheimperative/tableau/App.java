package approcheimperative.tableau;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        System.out.println("Bienvenue au conseil des classes");
        System.out.print("Entrer le nom de l'apprennant 1 : ");
        String name1 = sc.nextLine();
        System.out.print("Entrez la note de "+name1+" : ");
        float note1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Entrer le nom de l'apprennant 2 : ");
        String name2 = sc.nextLine();
        System.out.print("Entrez la note de "+name2+" : ");
        float note2 = sc.nextFloat();

        System.out.println("La moyenne de la classe est de : "+ (note1+note2) / 2);

        for (String str: args) {
            System.out.println(str);
        }
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            System.out.println(str);
        }

        //ctrl + alt + u sur util pour diagramme de classe
        Arrays.asList(args).forEach( System.out::println );
    }
}
