import java.util.*;

public class P_49 {
    public static void main(String[] args) {
        P_49 p_49 = new P_49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = p_49.groupAnagrams2(strs);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }

    //排序法
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            List<String> list = map.getOrDefault(s, new ArrayList<>());
            list.add(str);
            map.put(s, list);
        }
        return new ArrayList<>(map.values());
    }

    //计数法
    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] cnt = new int[26];
            int len = str.length();
            for (int j = 0; j < len; j++) {
                cnt[str.charAt(j) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (cnt[i] != 0) {
                    char c = (char) ('a' + i);
                    sb.append(c).append(cnt[i]);
                }
            }

            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
