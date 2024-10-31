import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
       int zahl1 = In.readInt();
       int zahl2 = In.readInt();
       int zahl3 = In.readInt();

    int max;
    if (zahl1 > zahl2 && zahl1 > zahl3){
        max = zahl1;
        Out.println("Das Maximum ist " + max);}

        else if (zahl2 > zahl1 && zahl2 > zahl3){
            max = zahl2;
            Out.println("Das Maximum ist "+ max);
        }
        else if (zahl3 > zahl2 && zahl3 > zahl1){
            max = zahl3;
            Out.println("Das Maximum ist "+ max);
        }
    












    }
    
       
    }

