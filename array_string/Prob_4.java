/*Implement a function to perform string compression. Also solved at Code360*/

public class Prob_4 {

    public static void compression1(String str){

        String comp1= String.valueOf(str.charAt(0));

        for(int i=1;i<str.length();i++){
            char a=str.charAt(i);
            char b=str.charAt(i-1);

            if(a!=b){
                comp1=comp1+a;
            }
        }
        System.out.println("Compression 1:"+comp1);
    }

    public static void compression2(String str){
        String comp2=String.valueOf(str.charAt(0));
        int count=1;

        for(int i=1;i<str.length();i++){
            char a=str.charAt(i);
            char b=str.charAt(i-1);

            if(a==b){
                count++;
            }
            else{
                if(count==1){
                    comp2=comp2+a;
                    count=1;
                }
                else{
                    comp2=comp2+count+a;
                    count=1;
                }
            }
        }

        if(count>1){
			comp2=comp2+count;
		}

        System.out.println("Compression 2:"+comp2);
    }
    public static void main(String[] args){
        String str="aaabbcccddaeef";
        compression1(str);
        compression2(str);
    }
}
