package academy.learnprogramming;

import java.util.Stack;

public class MinimumNumber {
    public String minimumNumber(String input1, int input2) {

        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        if(input1==null)
        {
            return "0";
        }
        if(input2>=input1.length()){
            return "0";
        }
        for(int i=0;i<input1.length();i++){
            int current=input1.charAt(i)-'0';
            while(input2>0&&st.size()>0&&st.peek()>current){
                st.pop();input2--;
            }
            if(st.size()>0||current!=0)st.add(current);
        }
        while(input2-->0&&st.size()>0)st.pop();
        for(int elem:st){
            sb.append(elem+"");
        }
        if(sb.length()==0){
            return "0";
        }
        return sb.toString();



    }
    public static void main(String[] args){
        MinimumNumber min=new MinimumNumber();
       System.out.println( min.minimumNumber("1432219",3));
    }
}
