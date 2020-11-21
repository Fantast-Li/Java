package leetCode;
//给一非空的单词列表，返回前 k 个出现次数最多的单词。
//
//返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
//
//示例 1：
//
//输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
//输出: ["i", "love"]
//解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
//    注意，按字母顺序 "i" 在 "love" 之前。
// 
//
//示例 2：
//
//输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
//输出: ["the", "is", "sunny", "day"]
//解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
//    出现次数依次为 4, 3, 2 和 1 次。
// 
//
//注意：
//
//假定 k 总为有效值， 1 ≤ k ≤ 集合元素数。
//输入的单词均由小写字母组成。

import java.util.*;

public class LeetCode692 {
    public List<String> topKFrequent(String[] words, int k) {
        //获取Map的单词  映射关系  单词和出现的次数
        Map<String ,Integer> map = getWords(words);
        List<String> list = new ArrayList<>();
        //因为 Map 底层是  红黑树 及搜索树  所以 单词都是以字母排序的 即按字母顺序
        // 找出出现最多的单词   遍历Map的映射关系
        // 需要提取k个最大的单词
        while (k>0) {
            String str = null; //用来存储单词
            Integer maxValue = 0; // 用来储存最大的次数
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                Integer integer = entry.getValue();
                if (integer > maxValue) {
                    maxValue = integer;
                    str = entry.getKey();
                }
            }  // 上面的for 循环
            list.add(str);
            k--;
            map.remove(str) ;
        }
        return list ;
}

    private Map<String,Integer> getWords(String[] words) {
        Map<String ,Integer> map = new TreeMap<>();
        Integer count = 0 ;
        for (String str: words) {
            count = map.getOrDefault(str,0);
            map.put(str,count+1);
        }
        return map;
    }
    public List<String> topKFrequent2(String[] words, int k) {
        // 获取单词  并建立map
        Map<String, Integer> map = getWords(words);
        List<String> ans =new ArrayList<>();
        // 对Map里的key值和value排序 将Map 放入list进行排序
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(entries);
        list.sort(new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2) {
                int o1Count = o1.getValue();
                int o2Count = o2.getValue();
                if (o1Count!=o2Count) {
                    return o2Count-o1Count;
                }else {
                    String o1Word = o1.getKey();
                    String o2Word = o2.getKey();
                    return o1Word.compareTo(o2Word);// String 类型具有比较能力 
                }
            }
        });
        for (int i = 0; i < k ; i++) {
            ans.add(list.get(i).getKey());
        }
        return ans;
    }


        public static void main(String[] args) {
            LeetCode692 solution = new LeetCode692();
            String[] input = { "leetcode", "love", "leetcode", "i", "i", "love", "coding" };
            List<String> strings = solution.topKFrequent(input, 2);
            System.out.println(strings);
    }

}
