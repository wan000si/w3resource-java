public class Numbers_4 {

    private String[] splitNum(String str, int index) {
        String[] str1 = new String[2];
        str1[0] = str.substring(0, index);
        if (str1[0].equals("")) {
            str1[0] = "0";
        }
        str1[1] = str.substring(index);
        return str1;
    }

    private void printKaprekar(String[] args) {
        int count = 0;
        int base = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        for (long n = 1; n <= 1000; ++n) {
            String sqrNum = Long.toString(n * n, base);
            for (int j = 0; j < sqrNum.length() / 2 + 1; ++j) {
                String[] parts = splitNum(sqrNum, j);
                long first_Num = Long.parseLong(parts[0], base);
                long sec_Num = Long.parseLong(parts[1], base);
                if (sec_Num == 0) {
                    break;
                }
                if (first_Num + sec_Num == n) {
                    System.out.println(Long.toString(n, base)
                            + "\t" + sqrNum + "\t" + parts[0] + "+" + parts[1]);
                }
                count++;
                break;
            }
        }

        System.out.println(count + " Kaprekar numbers. ");
    }

    public static void main(String[] args) {
        new Numbers_4().printKaprekar(args);
    }

}
