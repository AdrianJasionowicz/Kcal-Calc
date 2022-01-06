package variables;

public class Calculations {

    public static void main(String[] args) {

        // Algorytm obliczania zapotrzebowania kalorycznego według wzoru BMR metodą Mifflin-St Jeor,
        // z uwzględnieniem współczynnika aktywności fizycznej.


        //    Współczynniki aktywności fizycznej:
        //
        //      1.2     - przy pracy siedzącej i braku aktywności fizycznej
        //      1.4     - przy pracy siedzącej i niskiej aktywności fizycznej (1-2 treningi w tygodniu)
        //      1.6     - przy pracy siedzącej i średniej aktywności fizycznej (3-4 treningi w tygodniu)
        //      1.8     - przy pracy fizycznej i średniej aktywnosci fizycznej (3-4 treningi w tygodniu)
        //      2.0     - przy bardzo wysokiej aktywności fizycznej (codzienne treningi, sportowcy)

    double bodyweight = Prompt.promptDouble("Podaj Wage w Kilogramach: ");
    double bodyheight = Prompt.promptDouble("Podaj wzrost w Centymetrach: ");
    double age = Prompt.promptDouble("Podaj Wiek: ");

double Calc1 = bodyweight * 9.99;
double Calc2 = bodyheight * 6.62;
double Calc3 = age * 4.92;
double MaleC = Prompt.promptDouble("Podaj Wspołczynnik Plci Kobieta -161 / Mezszczyzna 5: ");
double Cecx = (Calc1 + Calc2) - Calc3;
double FactorSex = Cecx + MaleC;
        System.out.println("Wzrost w centymetrach: " + bodyheight);
        System.out.println("Waga w kilogramach: " + bodyweight);
        System.out.println("Wiek w latach: " + age);
        System.out.println("Współczynnik płci: " + MaleC);

        System.out.println();
        System.out.println("Rozpoczynamy obliczenia...");
        System.out.println();


        System.out.println("Waga pomnożona przez 9,99: " + Calc1);


        System.out.println("Wzrost pomnożony przez 6,25:" + Calc2 );


        System.out.println("Wiek pomnożony przez 4,92: " + Calc3 );


        System.out.println("Wynik nie uwzględniająćy płci: " + Cecx);


        System.out.println("Wynik z uwzględnieniem płci: " + FactorSex);


        double ActiveRatio = Prompt.promptDouble("Podaj Wspolczynnik aktywnosci fizycznej:  1.2     - przy pracy siedzacej i braku aktywnosci fizycznej 1.4     - przy pracy siedzacej i niskiej aktywnosci fizycznej (1-2 treningi w tygodniu) 1.6     - przy pracy siedzacej i sredniej aktywnosci fizycznej (3-4 treningi w tygodniu) 1.8     - przy pracy fizycznej i sredniej aktywnosci fizycznej (3-4 treningi w tygodniu) 2.0     - przy bardzo wysokiej aktywnosci fizycznej (codzienne treningi, sportowcy)");
        System.out.println();
        System.out.println("Docelowe zapotrzebowanie kaloryczne: " + FactorSex * ActiveRatio);
    }
}