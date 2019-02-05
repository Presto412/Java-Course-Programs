package practice;

class EqualParts {

    public static void main(String[] args) {
        String s = "HelloMotoDotoKyotoha";
        int i, n = 3, flag = 0;
        int parts = s.length() / n;
        String[] splits;
        if (s.length() % n == 0) {
            splits = new String[n];
            flag = 1;
        } else {
            splits = new String[n + 1];
        }
        int begin = 0;
        for (i = 0; i < n; i++) {
            splits[i] = s.substring(begin, begin + parts);
            begin += parts;
        }

        for (i = 0; i < n; i++) {
            System.out.println(splits[i]);
        }
        if (flag == 0) {
            splits[n] = s.substring(begin);
            System.out.println(splits[n]);
        }

    }
}
