public class Main {
    public static long textString(int soLan) {
        String text = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < soLan; i++) {
            text += "hello";
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long textBuffer(int soLan) {
        StringBuffer textBuffer = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < soLan; i++) {
            textBuffer.append("hello");
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long textBuilder(int soLan) {
        StringBuilder textBuilder = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < soLan; i++) {
            textBuilder.append("hello");
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        System.out.println("time string: " + textString(100000));
        System.out.println("time buffer: " + textBuffer( 100000));
        System.out.println("time builder: " + textBuilder(100000));
    }
}