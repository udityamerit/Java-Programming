package OppsProgramming;

public class _7_StringBuilder_stringFormating {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        sb.append("hello my name is uditya");
        sb.append("i am a student at vit");
        System.out.println(sb.toString());

        // another way to converting the sting
        StringBuilder s = new StringBuilder();
        s.append("My name is uditya Narayan Tiwari")
                .append("currentaly i am learning java programming language")
                .append("for our tee exam");
        System.out.println(s.toString());

    }
}
