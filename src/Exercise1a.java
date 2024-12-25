class Exercise1a {
    public static void main(String[] args) {
        int x = 8;
        while (x < 10) {
            System.out.print("x = " + x);
            x = x + 1;

            if(x > 3){
                System.out.println(" Big x");
            }
        }
    }
}