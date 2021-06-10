package service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService  implements IDictionaryService{
   static HashMap<String, String> wordList = new HashMap<>();

    static {
        wordList.put("word", "Từ");
        wordList.put("student", "Học Sinh");
        wordList.put("group", "Nhóm");
        wordList.put("employer", "Nhân Viên");

    }

    public String getValueByKey(String key){
       if(wordList.containsKey(key)){
           return wordList.get(key);
       }else return "";

    }
}
