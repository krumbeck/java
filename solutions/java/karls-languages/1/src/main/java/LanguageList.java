import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    // task 1: check if language list is empty
    public boolean isEmpty() {
        return languages == null || languages.isEmpty();
    }
    // task 2: add a language
    public void addLanguage(String language) {
        languages.add(language);
    }
    // task 3: remove language
    public void removeLanguage(String language) {
        languages.remove(language);
    }
    // task 4: return first item in the list
    public String firstLanguage() {
        return languages.get(0);
    }
    // task 5: count languages
    public int count() {
        return languages.size();
    }
    // task 6: check if language is in the list
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }
    // task 7: determine if list is exciting
    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
