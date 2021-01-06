package szabo.fpv.umb.binarynator;
import java.util.Random;

public  class transferLogic {

        static String generateExmaple(String transferFrom){
                String hello;
                int decimal,resultToTransfer;

                Random rand = new Random();

                if(transferFrom.equals("Desiatková") || transferFrom.equals("Decimal")){
                        decimal = rand.nextInt(1024);
                        return Integer.toString(decimal);
                }
                else if(transferFrom.equals("Binárna") || transferFrom.equals("Binnary")){
                        decimal = rand.nextInt(1024);
                        return Integer.toString(decimal,2);
                }
                else if(transferFrom.equals("Osmičková") || transferFrom.equals("Octal")){
                        decimal = rand.nextInt(1024);
                        return Integer.toString(decimal,8);
                }
                else if(transferFrom.equals("Šestnástková") || transferFrom.equals("Hexidecimal")){
                        decimal = rand.nextInt(1024);
                        return Integer.toString(decimal,16);
                }
                else{
                        hello = "nic";
                        return hello;
                }

        }
        static boolean checkResult(String transferFrom, String transferto){

                return false;

        }

}
