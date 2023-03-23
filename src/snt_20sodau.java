public class snt_20sodau {
    public static boolean checkSnt(int number){
        boolean check =true;
        if( number <2){
        return check = false;
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i ==0){
                    return false;
                }
            }
        }
        return check = true;
    }
    public static void main(String[] args) {
        int count = 0;
        int i =0;
        while (count<20){
            if(checkSnt(i)==true){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
