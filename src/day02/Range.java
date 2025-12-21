package day02;

public class Range {
    private long start;
    private long end;
    private long invalidID = 0;

    public Range(String startSTR, String endSTR) {
        start = Long.parseLong(startSTR.trim());
        end = Long.parseLong(endSTR.trim());
    }

    //--
    public void processRange() {
        for (long i = start; i <= end; i++) {
            if (isRepetitive(i)) {
                invalidID += i;
            }
        }
    }

    //--
    private boolean isRepetitive(long number) {
        String s = String.valueOf(number);
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String pattern = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                int repeticoes = len / i;
                for (int j = 0; j < repeticoes; j++) {
                    sb.append(pattern);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    //--
    public long getInvalidID() {
        return invalidID;
    }
}
