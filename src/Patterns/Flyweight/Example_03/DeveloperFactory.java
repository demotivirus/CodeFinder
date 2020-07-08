package Patterns.Flyweight.Example_03;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private Map<String, Developer> developerMap = new HashMap<>();

    public Developer createDeveloper(String str){
        Developer developer = developerMap.get(str);

        if (developer == null){
            switch (str){
                case "java":
                    System.out.println("Hiring java developer");
                    developer = new JavaDev();
                    break;
                case "python":
                    System.out.println("Hiring python developer");
                    developer = new PythonDev();
            }
            developerMap.put(str, developer);
        }

        return developer;
    }
}
