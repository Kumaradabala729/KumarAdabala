class Solution {
    public int calculate(String s) {
       Stack<Integer> stk=new Stack<>();
       int res=0;
       int num=0;
       int sign=1;
       for (int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if (ch>='0' && ch<='9'){
            num=num*10+(ch-'0');

        }
        else if (ch=='+'){
            res+=sign*num;
            sign=1;
            num=0;

        }
        else if(ch=='-'){
            res+=sign*num;
            sign=-1;
            num=0;
        }
        else if(ch=='('){
            stk.push(res);
            stk.push(sign);
            res=0;
            sign=1;
            num=0;

        }
        else if(ch==')'){
            res+=sign*num;
            res*=stk.pop();
            res+=stk.pop();
            num=0;
        }

    }
    return res+=sign*num;
    }
}

