public class Main {
    public static void main(String [] args){

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        Add s = (x, y) -> {
            int result = 0;
            for(int i = x; i <= y; i++){
                result += i;
            }

            return result;
        };

        System.out.println(s.calculate(a, b));

        
    }
}