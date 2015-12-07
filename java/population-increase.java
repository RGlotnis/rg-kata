class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        double pp = p0*1.0;
        int nb = 0;
        while (p>pp) {
          pp += pp*(percent/100.0)+aug;
          nb++;
        }
        return nb;
    }
}
