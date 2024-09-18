//Roman to Integer

class RomanToInt {
    public int romanToInt(String s) {
        int prev=0;
        int sum=0;

        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);
            int num=0;

            if(c=='I'){
                num=1;
            }else if(c=='V'){
                num=5;
            }else if(c=='X'){
                num=10;
            }else if(c=='L'){
                num=50;
            }else if(c=='C'){
                num=100;
            }else if(c=='D'){
                num=500;
            }else if(c=='M'){
                num=1000;
            }

            if(prev<num){
                sum=sum+num-prev-prev;
            }else{
                sum=sum+num;
            }

            prev=num;
        }

        return sum;
    }
}