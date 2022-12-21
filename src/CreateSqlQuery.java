/* Дана строка sql-запроса "select * from students where ".
 Сформируйте часть WHERE этого запроса, используя StringBuilder.
 Данные для фильтрации приведены ниже в виде json строки.
 Если значение null, то параметр не должен попадать в запрос.
 Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

import org.json.JSONObject;
import java.util.Objects;

public class CreateSqlQuery {
    public static void main(String[] args) {
        JSONObject query = new JSONObject(
                "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}"
        );
        StringBuilder str = new StringBuilder();

        for (Object key: query.names()) {
            Object keyValue = query.get(key.toString());
            if (!Objects.equals(keyValue.toString(), "null")) {
                if (str.length() != 0) str.append(" AND ");
                str.append(key);
                str.append("=");
                str.append(keyValue);
            }
        }
        str.insert(0, "select * from students where ");
        System.out.println(str);
    }
}