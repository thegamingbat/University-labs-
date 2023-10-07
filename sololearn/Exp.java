class Exp{
    public int i=0;
    public Exp increment () {
        i++;
        return this; // return current object
    }

        public static void main(String[] args) {
            Exp e = new Exp();
            int v = e.increment().i;
            System.out.println("v = " + v);

        }

}

