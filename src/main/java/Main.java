import java.lang.reflect.Type;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = parseCSV(columnMapping, fileName);


        private static List<Employee> parseCSV (String[]columnMapping, String fileName){

        }

        String json = listToJson(list);

        Type listType = new TypeToken<List<T>>() {
        }.getType();

        String json = gson.toJson(list, listType);

        void writeString(){

        }
    }
}
