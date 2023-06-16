package com.PureSoftware.Tasks.FontChecker;


import java.util.HashMap;
import java.util.Map;

public class MagazineNote {
    public static boolean canCutFromMagazine(String note, String magazine) {
        Map<Character, Integer> noteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();


        for (char c : note.toCharArray()) {
            noteMap.put(c, noteMap.getOrDefault(c, 0) + 1);
        }


        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }


        for (Map.Entry<Character, Integer> entry : noteMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (!magazineMap.containsKey(c) || count > magazineMap.get(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String note = "deaa";
        String magazine = "abcde";
        boolean result = canCutFromMagazine(note, magazine);
        System.out.println(result); 
    }
}
