package bracket;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//        有效字符串需满足：
//
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//        注意空字符串可被认为是有效字符串。
//
//        示例 1:
//
//        输入: "()"
//        输出: true
//        示例 2:
//
//        输入: "()[]{}"
//        输出: true
//        示例 3:
//
//        输入: "(]"
//        输出: false
//        示例 4:
//
//        输入: "([)]"
//        输出: false
//        示例 5:
//
//        输入: "{[]}"
//        输出: true
// 伪代码 1. 需要先创建一个放char 类型的栈 用来存放左字符
//        2. 遍历String s 的每个字符 将遇到左括号放进stack的栈里面
//        3.遇到右括号 时 需要和栈顶元素进行匹配（提取出栈顶元素）
//          如果栈是空的 则错误  右括号多了
//          如果和栈顶元素不匹配 则错误 进入下一次循环遍历
//          如果匹配成功   进入下一次循环遍历
//        4. 遍历完了之后  栈如果不是是空的则 错误 左括号多了
import java.util.Deque;
import java.util.LinkedList;
public class Solution {
        public boolean isValid(String s) {
        //先创建一个放字符char的栈
        Deque<Character> stack = new LinkedList<>();
        // 遍历String s 中的元素
        // 方法一
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//        }
        //方法二  将字符串变为以为字符的数组
        char[] c = s.toCharArray();
        for (char i : c ) {
        // 根据不同的情况 分类  如果是左括号的话 就 压栈 （{[
            switch (i){
                case '(':
                case '{':
                case '[':
                    // 因为没有大中小括号 无论是（[{ 都会走到下面的语句
                    stack.push(i);
                    break;
                    default:{
                        //因为只有 左右括号  所以不是左括号就是右括号 所以可以直接default 如果其他符号的话还需要吧他挑出来
                        if (stack.isEmpty()){
                            return false;
                            // 右括号多了
                        }
                        // 否则就要取出栈顶元素
                        char left = stack.pop();
                        //进行左右括号的比较
                        if (!compareBracket(left,i)){
                            // 左右括号不匹配
                            return false ;

                        }
                    }

            }
        }
        if (stack.isEmpty()){
            return true;
        }else{
            // 左括号多了
            return false;
        }

    }
    private Boolean compareBracket (char left ,char right) {
        if (left =='(' && right==')'){
            return true ;
        }
        if (left == '{' && right == '}') {
            return true ;
        }
        if (left == '[' && right == ']'){
            return true ;
        }
        //除了上面的这三种情况以外的所有情况 ，都是不匹配
        return false ;
    }

}

