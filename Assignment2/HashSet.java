import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> technologies = new HashSet<>();

      
        technologies.add("Java");
        technologies.add("Spring Boot");
        technologies.add("MySQL");
        technologies.add("Docker");
        technologies.add("Java");       
        technologies.add("Git");

        System.out.println("Technologies used in the project:");

        for (String tech : technologies) {
            System.out.println(tech);
        }

        
        if (technologies.contains("Docker")) {
            System.out.println("\nDocker is used in this project.");
        }


        System.out.println("Total unique technologies: " + technologies.size());
    }
}
