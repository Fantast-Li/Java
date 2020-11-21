package leetCode;
// 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
//
//J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
//
//示例 1:
//
//输入: J = "aA", S = "aAAbbbb"
//输出: 3
//示例 2:
//
//输入: J = "z", S = "ZZ"
//输出: 0

import java.util.*;

public class LeetCode771 {
    public int numJewelsInStones(String J, String S) {
        char[] chars = S.toCharArray() ;
        Set<Character> set = new TreeSet<>() ;
        char[] a = J.toCharArray();
        for (char ch: a) {
            set.add(ch) ;
        }
        int count = 0 ;
        for (char ch : chars) {
            if (set.contains(ch)) {
                count ++ ;
            }
        }
        return count ;
    }
    public static Map<Integer , Integer>count (int[] numbers) {
        Map<Integer,Integer>  map = new TreeMap<>();
        Integer count = 0 ;
        for ( int s: numbers) {
            count = map.get(s) ;
            if (!map.containsKey(s)){
                map.put(s,1);
            }else {
                count++ ;
                map.put(s,count);
            }
        }
        return map ;
    }

    public static void main(String[] args) {
        int [] a = {1,2,1,2,3,6,5,4,1};
        System.out.println(count(a));

    }

}
