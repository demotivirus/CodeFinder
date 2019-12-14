package Patterns.Singleton;

public class UniqueClass {
    private static UniqueClass uniqueClass;

    private UniqueClass(){
        System.out.println("Unique class create");
    }

    public static synchronized UniqueClass getUniqueClass(){
        if (uniqueClass == null)
            uniqueClass = new UniqueClass();
        return uniqueClass;
    }
}
