public class withoutX {
    public String withoutX(String str) {
        int start = 0;
        int end = str.length();
        if (str.startsWith("x")) {
            start = 1;
        }
        if (str.endsWith("x") && end > start) {
            end -= 1;
        }
        return str.substring(start, end);
}    
}
