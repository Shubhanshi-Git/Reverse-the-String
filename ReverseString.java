public class ReverseString {
    public static void main(String[] args) {
//        String str = " Shubhanshi";
//        String result = " ";
//       for(int i = str.length()-1; i>=0 ; i--){
//           result = result + str.charAt(i);
//       }
//        System.out.println("reverse string is : " +result);
//    }

                                                                 // with the help of string builder
         StringBuilder sb = new StringBuilder("sonali");
        sb.reverse();
        System.out.println(sb);

    }
}