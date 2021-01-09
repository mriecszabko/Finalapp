package szabo.fpv.umb.binarynator;

import java.util.Random;

public  class transferLogic {

        static String generateExmaple(String transferFrom){
                String hello = "hello";
                int decimal;

                Random rand = new Random();

                if(transferFrom.equals("Desiatková") || transferFrom.equals("Decimal")){
                        decimal = rand.nextInt(255);

                        return Integer.toString(decimal);
                }
                else if(transferFrom.equals("Binárna") || transferFrom.equals("Binnary")){
                        decimal = rand.nextInt(255);
                        return String.format("%8s",
                                Integer.toBinaryString(0xFF & decimal)).replaceAll(" ", "0");
                }
                else if(transferFrom.equals("Osmičková") || transferFrom.equals("Octal")){
                        decimal = rand.nextInt(255);
                        return Integer.toString(decimal,8);
                }
                else if(transferFrom.equals("Šestnástková") || transferFrom.equals("Hexidecimal")){
                        decimal = rand.nextInt(255);
                        return Integer.toString(decimal,16);
                }
                else{
                        hello = "nic";
                        return hello;
                }

        }


        static boolean checkResult(String transferFrom, String transferTo,String inputText,String randomExample){
                switch (transferFrom){
                        //Frist CASE FROM to Second case = RESULT
                        case "Desiatková":
                                switch (transferTo){
                                        case "Desiatková":
                                                if(inputText.matches("[0-9]+") && inputText.equals(randomExample) ){
                                                        return true;
                                                }
                                                else{
                                                        return  false;
                                                }
                                        case  "Binárna":
                                                if(inputText.isEmpty()){
                                                        return false;
                                                }

                                                else if(inputText.matches("[0-1]+") && randomExample.equals(String.valueOf(Integer.parseInt(inputText,2))) ){
                                                        return true;
                                                }
                                                else {
                                                        return false;
                                                        }


                                        case  "Osmičková":
                                                if(inputText.isEmpty()){
                                                        return false;
                                                }
                                                else if( inputText.matches("[0-7]+") && randomExample.equals(String.valueOf(Integer.parseInt(inputText,8)))){
                                                        return true;
                                                }
                                                else {
                                                        return false;
                                                }


                                        case "Šestnástková":
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
                        case  "Binárna":
                                switch (transferTo){
                                        case "Desiatková":
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

                                        case  "Binárna":
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



                                        case  "Osmičková":
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

                                        case "Šestnástková":
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

                        case  "Osmičková":
                                switch (transferTo){
                                        case "Desiatková":
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

                                        case  "Binárna":
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



                                        case  "Osmičková":
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

                                        case "Šestnástková":
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

                        case "Šestnástková":
                                switch (transferTo){
                                        case "Desiatková":
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

                                        case  "Binárna":
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



                                        case  "Osmičková":
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

                                        case "Šestnástková":
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
                        case "Desiatková":
                                switch (transferTo){
                                        case "Desiatková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return randomExample;
                                                }
                                        case  "Binárna":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return String.format("%8s", Integer.toBinaryString(0xFF & Integer.parseInt(randomExample))).replaceAll(" ", "0");
                                                }

                                        case  "Osmičková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {

                                                        return Integer.toOctalString(Integer.parseInt(randomExample));
                                                }
                                        case "Šestnástková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return Integer.toHexString(Integer.parseInt(randomExample));
                                                }
                                }
                                //TODO
                        case  "Binárna":
                                switch (transferTo) {
                                        case "Desiatková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(Integer.parseInt(randomExample, 2));
                                                }
                                        case  "Binárna":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return randomExample;
                                                }

                                        case  "Osmičková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(  Integer.toOctalString(Integer.parseInt(randomExample,2)));
                                                }
                                        case "Šestnástková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {

                                                        return String.valueOf(Integer.toHexString(Integer.parseInt(randomExample,2)));
                                                }

                                }
                        case  "Osmičková":
                                switch (transferTo){
                                        case "Desiatková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(Integer.parseInt(randomExample, 8));
                                                }
                                        case  "Binárna":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return String.format("%8s", Integer.toBinaryString(0xFF & Integer.parseInt(randomExample,8))).replaceAll(" ", "0");
                                                }

                                        case  "Osmičková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return randomExample;
                                                }
                                        case "Šestnástková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {

                                                        return Integer.toHexString(Integer.parseInt(String.valueOf(Integer.parseInt(randomExample, 8))));
                                                }

                                }
                        case  "Šestnástková":
                                switch (transferTo){
                                        case "Desiatková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return String.valueOf(Integer.parseInt(randomExample, 16));
                                                }
                                        case  "Binárna":
                                                if(randomExample.isEmpty()) {
                                                        return correctResult;

                                                }
                                                else {
                                                        return String.format("%8s", Integer.toBinaryString(0xFF & Integer.parseInt(randomExample,16))).replaceAll(" ", "0");
                                                }

                                        case  "Osmičková":
                                                if(randomExample.isEmpty()){
                                                        return correctResult;
                                                }
                                                else {
                                                        return Integer.toOctalString(Integer.parseInt(randomExample, 16));
                                                }
                                        case "Šestnástková":
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
