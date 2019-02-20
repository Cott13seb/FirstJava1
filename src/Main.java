public class Main {


    public static void main(String[] args) {


        System.out.println("HelloWorld");
        int rezultatScadere = scadere(10, 5);
        System.out.println(rezultatScadere);
        int rezadunare1 = adunare(50, 25);
        System.out.println(rezadunare1);
        int rezultat2 = inmultire(65, 43);
        System.out.println(rezultat2);


        int adunare = 15;
        int scadere = 9;
        int inmultire = 3 * 3;

        System.out.println(adunare - scadere);
        adunare++;    //adunare =adunare +1;
        adunare += 2;   //adunare =adunare + 3;


        Human Girl = new Human();

        Girl.inaltime = 1.69f;
        Girl.numr = "Ana";
        Girl.sex = "feminin";
        Girl.varsta = 14;

        Human Boy = new Human();
        Boy.varsta = 14;
        Boy.sex = "Masculin";
        Boy.numr = "Gigi";
        Boy.inaltime = 1.71f;


        MedicalGroup Medic = new MedicalGroup();
        Medic.nume = "Ionescu";
        Medic.greutate = 97f;
        Medic.sex = "Masculin";
        Medic.varsta = 51;
        Dog Rex = new Dog();

        Rex.culoare = "negru";
        Rex.greutate = 3f;
        Rex.nume = "Rex";
        Rex.rasa = "bichon";
        Rex.varsta = 2;

        Dog Ringo = new Dog();
        Ringo.varsta = 4;
        Ringo.rasa = "Husky";
        Ringo.nume = "Ringo";
        Ringo.greutate = 9f;
        Ringo.culoare = "Alb";


        Dog Max = new Dog();
        Max.culoare = "Gri";
        Max.greutate = 8f;
        Max.nume = "Max";
        Max.varsta = 5;
        Max.rasa = "ciobanesc";

    }



    public static int scadere(int primul, int slDoilea) {
        int rezScadere = primul - slDoilea;
        return rezScadere;
    }

    public static int adunare(int sebastian, int adriana) {
        int rezadunare = sebastian + adriana;
        return rezadunare;


    }

    public static int inmultire(int gggg, int zzzz) {
        int rezultat = (gggg * zzzz);
        return rezultat;
    }


}


