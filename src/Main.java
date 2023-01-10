public class Main {

    public static void main(String[] args) {
        String roman = "MDLXX";
        System.out.println(roman);
        System.out.println(romanToInt(roman));

    }

    public static int romanToInt(String s) {
        if (s.length() < 1 || s.length() > 15) {
            System.out.println("Wrong Input");
            return -1;
        }
        if(s.replaceAll("[IVXLCDM]", "").length() == s.length()){
            System.out.println("Wrong Input");
            return -1;
        }
        int decimal = 0;
        String[] romans;
        romans = s.split("");

        for (int i = 0; i < romans.length; i++) {
            if (i == romans.length - 1){
                switch (romans[i]) {
                    case "I" -> decimal += 1;
                    case "V" -> decimal += 5;
                    case "X" -> decimal += 10;
                    case "L" -> decimal += 50;
                    case "C" -> decimal += 100;
                    case "D" -> decimal += 500;
                    case "M" -> decimal += 1000;
                }
                break;
            }
            if (romans[i].equals("I") && romans[i + 1].equals("V")) {
                decimal += 4;
                i++;
            } else if (romans[i].equals("I") && romans[i + 1].equals("X")) {
                decimal += 9;
                i++;
            } else if (romans[i].equals("I")){
                decimal += 1;
            }  else if (romans[i].equals("V")) {
                decimal += 5;
            } else if (romans[i].equals("X") && romans[i + 1].equals("L")) {
                decimal += 40;
                i++;
            } else if (romans[i].equals("X") && romans[i + 1].equals("C")) {
                decimal += 90;
                i++;
            } else if (romans[i].equals("X")) {
                decimal += 10;
            } else if (romans[i].equals("L")) {
                decimal += 50;
            }else if (romans[i].equals("C") && romans[i + 1].equals("D")) {
                decimal += 400;
                i++;
            } else if (romans[i].equals("C") && romans[i + 1].equals("M")) {
                decimal += 900;
                i++;
            } else if (romans[i].equals("C")) {
                decimal += 100;
            } else if (romans[i].equals("D")) {
                    decimal += 500;
            } else if (romans[i].equals("M")) {
                decimal += 1000;
            }
        }

        return decimal;
    }
}
