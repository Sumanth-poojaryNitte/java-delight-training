import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("batchb");
        System.out.println(s1);
        StringBuilder s2=new StringBuilder("batchb3");
        System.out.println(s2);
        s2.append("sam");
        System.out.println(s2);
        s2.insert(3,"sumanth");
        System.out.println(s2);
        s2.replace(2,4,"vk");
        System.out.println(s2);
        s2.delete(0,4);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);
        String s3="java";
        String s4=new String("java");
        String x="java";
        String y="java";
        System.out.println(x==y);

        String p= new String("java");
        String q=new String("java");
        System.out.println(p==q);
        String z="RajRamMohanRoy";
        System.out.println(z.charAt(5));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf('R'));
        System.out.println(z.lastIndexOf('R'));
        String a="nsam";
        String b="Nsam";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equals(b));
        char arr[]=z.toCharArray();
        System.out.println(Arrays.toString(arr));


    }
}
