public class EmailObfuscator {
    
    public static String obfuscate(String email) {
        return email.replace("@"," [at] ").replace(".", " [dot] ");
    }
}
