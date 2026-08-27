class Prime100 {
    public static void main(String args[]) {
        int count = 0, num = 2;

        while (count < 100) {
            count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}