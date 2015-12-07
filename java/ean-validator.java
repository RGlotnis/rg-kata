public class EANValidator {    
    public static boolean validate(final String eanCode) {
       long compare = 131313131313L;
       long ean = Long.parseLong(eanCode);
       long checksum = ean%10;
       long total = 0;
       ean/=10;
       while (ean >0) {
         total += (ean%10)*(compare%10);
         ean/=10;
         compare/=10;
       }
       return (total+checksum)%10==0;
    }
}
