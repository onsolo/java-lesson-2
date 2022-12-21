// Написать метод(ы), который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
import org.json.JSONArray;

public class JsonParser {
    public static void main(String[] args) {
        JSONArray marks = new JSONArray("[" +
                "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}" +
                "]");

        for (int i = 0; i < marks.length(); i++) {
            StringBuilder surname = new StringBuilder((String) marks.getJSONObject(i).get("фамилия"));
            StringBuilder mark = new StringBuilder((String) marks.getJSONObject(i).get("оценка"));
            StringBuilder subject = new StringBuilder((String) marks.getJSONObject(i).get("предмет"));

            System.out.println("Студент " + surname + " получил " + mark + " по предмету " + subject);
        }
    }
}
