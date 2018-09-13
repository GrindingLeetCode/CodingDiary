/**
 * Created on 13 Sep 2018 by happygirlzt
 *
 * LeetCode #49. Group Anagrams
 */
// the string may have duplicate chars

import java.util.HashSet;
import java.util.ArrayList;

class GroupAnagrams {
    // My TLE practice
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) return res;
        HashMap<HashMap<Character, Integer>, Integer> maps = new HashMap<>();

        // Contruct the maps
        for (String s : strs) {
            char[] cs = s.toCharArray();
            // change String to map
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character c : cs) {
                if (map.containsKey(c)) {
                    int tmp = map.get(c);
                    map.remove(c);
                    map.put(c, ++tmp);
                } else {
                    map.put(c, 1);
                }
            }

            if (!maps.containsKey(map)) {
                int d = maps.size();
                maps.put(map, d);
            }

        }



        for (String s : strs) {
            char[] cs = s.toCharArray();
            // change String to map
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character c : cs) {
                if (map.containsKey(c)) {
                    int tmp = map.get(c);
                    map.remove(c);
                    map.put(c, ++tmp);
                } else {
                    map.put(c, 1);
                }
            }

            for (HashMap.Entry<HashMap<Character, Integer>, Integer> m : maps.entrySet()) {
                if (map.equals(m.getKey())) {
                    System.out.println(“Yes”);
                    int d = m.getValue();
                    List<String> list = res.get(d);
                    if (list.get(0) == “”) list.clear();
                    list.add(s);
                    res.set(d, list);
                    break;
                }
            }
        }

        return res;
    }

    // Inspired by discussion
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) return res;
        HashMap<String, List<String>> maps = new HashMap<>();

        for (String s : strs) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String tmp = String.valueOf(cs);
            if (!maps.containsKey(tmp)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                maps.put(tmp, list);
            } else {
                List<String> list = maps.get(tmp);
                list.add(s);
                maps.put(tmp, list);
            }
        }
        // Attention, this pattern
        res = new ArrayList<>(maps.values());
        return res;
    }
}
