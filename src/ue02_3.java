import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
      
double x = In.readDouble();
double y = In.readDouble();

double hyp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

int r=4; 

if (hyp > r && (x < 4 && y < 4)){
    Out.println ("Der Punkt ist im grünem Bereich");
}
else {
    Out.println ("Der Punkt ist nicht im grünen Bereich");
}



    }
}
