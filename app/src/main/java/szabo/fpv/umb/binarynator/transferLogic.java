package szabo.fpv.umb.binarynator;

import java.util.Random;

public  class transferLogic {

        static String generateExmaple(String transferFrom){
                int decimal;

                Random rand = new Random();

                if(transferFrom.equals("0")){
                        decimal = rand.nextInt(255);

                        return Integer.toString(decimal);
                }
                else if(transferFrom.equals("1")){
                        decimal = rand.nextInt(255);
                        return String.format("%8s",
                                Integer.toBinaryString(0xFF & decimal)).replaceAll(" ", "0");
                }
                else if(transferFrom.equals("2")){
                        decimal = rand.nextInt(255);
                        return Integer.toString(decimal,8);
                }
                else if(transferFrom.equals("3")){
                        decimal = rand.nextInt(255);
                        return Integer.toString(decimal,16);
                }
                else{

                        return " ";
                }

        }


        static boolean checkResult(String transferFrom, String transferTo,String inputText,String randomExample){
                switch (transferFrom){
                        //Frist CASE FROM to Second case = RESULT
                        case "0":
                                switch (transferTo){
                                        case "0":
                                                if(inputText.matches("[0-9]+") && inputText.equals(randomExample) ){
                                                        return true;
                                                }
                                                else{
                                                        return  false;
                                                }
                                        case  "1":
                                                if(inputText.isEmpty()){
                                                        return false;
                                                }

                                                else if(inputText.matches("[0-1]+") && randomExample.equals(String.valueOf(Integer.parseInt(inputText,2))) ){
                                                        return true;
                                                }
                                                else {
                                                        return false;
                                                        }


                                        case  "2":
                                                if(inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if( inputText.matches("[0-7]+") && randomExample.equals(String.valueOf(Integer.parseInt(inputText,8)))){
                                                        return true;
                                                }
                                                else {
                                                        return false;
                                                }


                                        case "3":
                                                if(inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("-?[0-9a-fA-F]+") && randomExample.equals(String.valueOf(Integer.parseInt(inputText,16)))){
                                                        return true;
                                                }
                                                else {
                                                        return false;
                                                }

                                }
                                break;
                                //Z binarnej do desitkovej
                        case  "1":
                                switch (transferTo){
                                        case "0":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-9]+") ){
                                                        if(String.valueOf(Integer.parseInt(inputText,10)).equals(String.valueOf(Integer.parseInt(randomExample,2)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }


                                                }
                                                else {
                                                        return  false;
                                                }

                                        case  "1":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-1]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,2)).equals(String.valueOf(Integer.parseInt(randomExample,2)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }

                                                }
                                                else {
                                                        return  false;
                                                }



                                        case  "2":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-7]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,8)).equals(String.valueOf(Integer.parseInt(randomExample,2)))){
                                                                return true;

                                                        }
                                                        else {
                                                                return false;
                                                        }

                                                }
                                                else {
                                                        return  false;
                                                }

                                        case "3":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("-?[0-9a-fA-F]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,16)).equals(String.valueOf(Integer.parseInt(randomExample,2)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }
                                                }
                                                else {
                                                        return  false;
                                                }


                                }
                                break;

                        case  "2":
                                switch (transferTo){
                                        case "0":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-9]+") ){
                                                        if(String.valueOf(Integer.parseInt(inputText,10)).equals(String.valueOf(Integer.parseInt(randomExample,8)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }


                                                }
                                                else {
                                                        return  false;
                                                }

                                        case  "1":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-1]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,2)).equals(String.valueOf(Integer.parseInt(randomExample,8)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }

                                                }
                                                else {
                                                        return  false;
                                                }



                                        case  "2":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-7]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,8)).equals(String.valueOf(Integer.parseInt(randomExample,8)))){
                                                                return true;

                                                        }
                                                        else {
                                                                return false;
                                                        }

                                                }
                                                else {
                                                        return  false;
                                                }

                                        case "3":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("-?[0-9a-fA-F]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,16)).equals(String.valueOf(Integer.parseInt(randomExample,8)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }
                                                }
                                                else {
                                                        return  false;
                                                }

                                }
                                break;

                        case "3":
                                switch (transferTo){
                                        case "0":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-9]+") ){
                                                        if(String.valueOf(Integer.parseInt(inputText,10)).equals(String.valueOf(Integer.parseInt(randomExample,16)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }


                                                }
                                                else {
                                                        return  false;
                                                }

                                        case  "1":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-1]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,2)).equals(String.valueOf(Integer.parseInt(randomExample,16)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }

                                                }
                                                else {
                                                        return  false;
                                                }



                                        case  "2":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("[0-7]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,8)).equals(String.valueOf(Integer.parseInt(randomExample,16)))){
                                                                return true;

                                                        }
                                                        else {
                                                                return false;
                                                        }

                                                }
                                                else {
                                                        return  false;
                                                }

                                        case "3":
                                                if(randomExample.isEmpty() || inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if(inputText.matches("-?[0-9a-fA-F]+")){
                                                        if(String.valueOf(Integer.parseInt(inputText,16)).equals(String.valueOf(Integer.parseInt(randomExample,16)))){
                                                                return true;
                                                        }
                                                        else {
                                                                return false;
                                                        }
                                                }
                                                else {
                                                        return  false;
                                                }

                                }
                                break;
                        default:break;
                }
                return false;

        }


        static String returnCorrectResult(String transferFrom, String transferTo,String randomExample){

                String correctResult = null;
                switch(transferFrom){
                        case "0":
                                switch (transferTo){
                                        case "0":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return randomExample;
                                                }
                                        case  "1":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return String.format("%8s", Integer.toBinaryString(0xFF & Integer.parseInt(randomExample))).replaceAll(" ", "0");
                                                }

                                        case  "2":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {

                                                        return Integer.toOctalString(Integer.parseInt(randomExample));
                                                }
                                        case "3":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return Integer.toHexString(Integer.parseInt(randomExample));
                                                }
                                }
                                //TODO
                        case  "1":
                                switch (transferTo) {
                                        case "0":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(Integer.parseInt(randomExample, 2));
                                                }
                                        case  "1":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return randomExample;
                                                }

                                        case  "2":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(  Integer.toOctalString(Integer.parseInt(randomExample,2)));
                                                }
                                        case "3":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {

                                                        return String.valueOf(Integer.toHexString(Integer.parseInt(randomExample,2)));
                                                }

                                }
                        case  "2":
                                switch (transferTo){
                                        case "0":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(Integer.parseInt(randomExample, 8));
                                                }
                                        case  "1":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return String.format("%8s", Integer.toBinaryString(0xFF & Integer.parseInt(randomExample,8))).replaceAll(" ", "0");
                                                }

                                        case  "2":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return randomExample;
                                                }
                                        case "3":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {

                                                        return Integer.toHexString(Integer.parseInt(String.valueOf(Integer.parseInt(randomExample, 8))));
                                                }

                                }
                        case  "3":
                                switch (transferTo){
                                        case "0":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(Integer.parseInt(randomExample, 16));
                                                }
                                        case  "1":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return String.format("%8s", Integer.toBinaryString(0xFF & Integer.parseInt(randomExample,16))).replaceAll(" ", "0");
                                                }

                                        case  "2":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return Integer.toOctalString(Integer.parseInt(randomExample, 16));
                                                }
                                        case "3":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return randomExample;
                                                }

                                }
                }

                return correctResult;
        }




}
