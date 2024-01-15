package project.home;
import com.google.gson.Gson;

public class Main {
    public static void main(String [] args){

        MavenJava mavenJava = new MavenJava("Oleh", "Hordiienko");

        Gson gson = new Gson();
        String json = gson.toJson(mavenJava);

        System.out.println(json);
    }
}
