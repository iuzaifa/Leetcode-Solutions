//package Leetcode_Java;
//
//import com.sun.security.jgss.GSSUtil;
//
//public class ValidParentheses_ESAY_QNO_20 {
//    public static void main(String[] args) {
//        System.out.println(isValid("{}"));
//    }
//
//
//    public static boolean isValid(String s) {
//
//
//        if (s.length() % 2 == 0){
//            for (int i = 0; i<s.length()-1; i++){
//                if (s.charAt(i) == s.charAt(i+1)){
//                    return false;
//                }
//            }
//        }else {
//            return false;
//        }
//    }
//}
