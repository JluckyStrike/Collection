package com.gb.lessons;

import java.util.*;

public class TelephoneDirectory {
   private Map<String, String> hashMap = new HashMap<>();

   public void add (String surname, String phone){
       hashMap.put(surname, phone);
   }

   public String get(String surname){
       String res  = "Телефон, " + surname + ":\n";

       for (Map.Entry<String, String> entry: hashMap.entrySet()) {
            if (entry.getValue().equals(surname))
                res += entry.getKey() + "\n";
       }

       return res;
   }
}
