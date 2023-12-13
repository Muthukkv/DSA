package gfgproblems;



public class Chat {

    public static void main(String[] args) {
        String a = "a14b26";
        char[] c = a.toCharArray();
        char temp = ' ';
        int num = 0;
        for (int i = 0; i < c.length; i++) {

            if (c[i] >= '0' && c[i] <= '9') {
                if (i > 0) {
                    temp = c[i - 1];
                }

                while (i < c.length && c[i] >= '0' && c[i] <= '9') {
                    num = (num * 10) + c[i] - '0';
                    i++;
                }

                // Check if temp is not a space before printing
                if (temp != ' ') {
                    for (int j = 0; j < num; j++) {
                        System.out.print(temp);
                    }
                }

            } else {
                temp = c[i];
            }

            num = 0;
        }
    }

}
