import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {

    int jahr = In.readInt();
    int Monat = In.readInt();

if (jahr < 0){
    Out.println("Wähle ein gültiges Jahr, dass größer als 0 ist");
}

if (Monat > 12 || Monat < 1) {
   Out.println("Wähle einen gültigen Monat ");
}
switch (Monat){
    case 1,3,5,7,8,10,12 ->
    Out.println ("Dieser Monat hat 31 Tage");
    
    case 4,6,9,11 ->
    Out.println ("Dieser Monat hat 30 Tage");

    case 2 ->{
    if ((jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0) {
    Out.println("Dieses Monat hat 29 Tage");
        
    } 

    else {
        Out.println("Dieses Monat hat 28 Tage");
    }

}
}













    }
}
