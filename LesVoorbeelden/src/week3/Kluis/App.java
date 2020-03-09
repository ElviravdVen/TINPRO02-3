package week3.Kluis;

public class App {
        public static void main( String args[] ) {
             Kluis k = new Kluis();
             for(int i=0;i<12350;i++)
             {
                  String code=Integer.toString(i);
                  if((k.open(code))==true)
                  {
                       System.out.println("Code: "+i);
                       break;
                  }
             }

             for(int i=0;i<47;i++)
             {
                  System.out.println(k.haalop(i));
             }


//        // Maak een static main() method aan die een object van de SavingsAccount class aanmaakt,
//         // account number kan toevoegen, geld kan storten, saldo kan geven en data kan printen.
//         //
//             SavingsAccount spaarRekening = new SavingsAccount();
//             spaarRekening.setAccountNumber("12345");
//             spaarRekening.deposit(500.0);
//             System.out.println("Saldo: " + spaarRekening.getBalance());
//             spaarRekening.printData();
//             //Hoe print ik data van de spaarrekening account netjes?
//
//        //Maak een tweede class die deze interface
//        //implementeert genaamd CheckingAccount
//             CheckingAccount betaalRekening = new CheckingAccount();
//             betaalRekening.setAccountNumber("12345");
//             betaalRekening.deposit(200.0);
//             System.out.println("Saldo: " + betaalRekening.getBalance());
//             betaalRekening.printData();
//             //Hoe print ik data van de betaalrekening account netjes?

        }




//     public static void main (String [] args) {
//          for (int groupIndex = 0; groupIndex < 2; groupIndex++) {
//               if (debug) {
//                    canvas
//                            .add (new Circle    (-5, -10, 20))
//                            .add (new Ellipse   (0, 0, 30, 15))
//                            .add (new Square    (5, 10, 40))
//                            .add (new Rectangle (0, 0, 60, 30))
//                            .add (new Line (0, 7, 50, false))
//                            .add (new Line (7, 0, 50, true));
//               }
//               else {
//                    canvas
//                            .add (new Circle    (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./16, 1./8)))
//                            .add (new Ellipse   (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./16, 1./8), randomDelta (1./32, 1./16)))
//                            .add (new Square    (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./8, 1./4)))
//                            .add (new Rectangle (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./8, 1./4), randomDelta (1./16, 1./8)))
//                            .add (new Line (randomDelta (-1./8, 1./8), randomDelta (-1./8, 1./8), randomDelta (1./4, 1./2), false))
//                            .add (new Line (randomDelta (-1./8, 1./8), randomDelta (-1./8, 1./8), randomDelta (1./4, 1./2), true));
//               }
//          }
//
//          for (char [] pixelCharPair: pixelCharPairs) {
//               console.input ("Press [Enter] to render with " + pixelCharPair [0] + " and " + pixelCharPair [1] + "\n");
//               canvas.render (pixelCharPair [0], pixelCharPair [1]);
//               console.print ("");
//          }
//
//          console.print ("Surface areas:");
//          console.print ("==============");
//          canvas.sortSurfaceList (true);
//          for (Surface surface: canvas.getSurfaceList ()) {
//               console.print (surface.getClass () .getSimpleName () + ": " + surface.getArea ());
//          }
//          console.print ("");
//     }
//
//
//
//     private static final Boolean debug = false;
//     private static final int canvasSide = 64;
//     private static final char [][] pixelCharPairs = {{'*', '.'}, {'M', '-'}};
//     private static final Random random = new Random ();
//     private static final Canvas canvas = new Canvas (canvasSide, canvasSide);
//     private static final Console console = new Console ();
//
//
//     private static float randomDelta (double lowerBound, double upperBound) {
//          return (float) (lowerBound * canvasSide + random.nextInt ((int) Math.max (1., (upperBound - lowerBound) * canvasSide)));
//     }


}