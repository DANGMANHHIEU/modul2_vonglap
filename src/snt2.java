public class snt2 {
    public static boolean checkSnt(int number){
        boolean check = true;
        if(number<2){
            return check = false;
        }
        else {
            for(int i = 2; i<number;i++){
                if(number%i==0){
                    return check = false;
                }
            }
        }
        return check = true;
    }

    public static void main(String[] args) {
        for(int i =0; i < 100; i++){
            if(checkSnt(i)==true){
                System.out.print(i + "\n");
            }
        }
    }
}
