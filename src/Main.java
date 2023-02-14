public class Main {
    public static void main(String[] args) {

        Python python = new Python();
        Java java = new Java();
        CSharp cSharp = new CSharp();
        Backend[] backends = {python, cSharp, java};
        for (Backend a : backends
        ) {
            System.out.println(a.getClass());
            if (a instanceof Java) {
                ((Java) a).spring();
            } else if (a instanceof Python) {
                ((Python) a).django();
            } else if (a instanceof CSharp) {
                ((CSharp) a).dotNet();
            }
        }

    }
}