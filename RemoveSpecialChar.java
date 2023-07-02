public class RemoveSpecialChar {
    public static void main(String[] args){
        String str = "$jav!a";
        String plain = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plain);
    }
    
}
