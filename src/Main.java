void main() {
    Scanner sc = new Scanner(System.in);

    TurnajovaFronta tf = new TurnajovaFronta();

    tf.prichodHrace(new Hrac("lacoodvedle","Archer",70));
    tf.prichodHrace(new Hrac("ondick","Warior",20));
    tf.prichodHrace(new Hrac("lagacek","Tank",50));

    boolean running = true;

    while(true){
        System.out.println("===============MENU===============");
        System.out.println("1. Novy hrac do fronty");
        System.out.println("2. Registrace dalsiho hrace(odebracni)");
        System.out.println("3. Vypis vsech hracu se vsemi informaceni");
        System.out.println("4. Nakouknuti,kdo je na rade");
        System.out.println("5. Vypsani hracu nad urcitou MMR");
        System.out.println("6. Vyhledani hrace podle prezdivky");
        System.out.println("7. Konec");
        System.out.println("==================================");

        System.out.print("Vyber: ");
        int choice;
        try{
            choice = sc.nextInt();
            sc.nextLine();
            if (choice < 1 || choice > 7) {
                System.err.println("Spatny format vyberu.");
                choice = 8;
            }
        }catch(InputMismatchException e){
            System.err.println("Spatny format vyberu.");
            sc.nextLine();
            choice = 8;
        }

        switch(choice){
            case 1:
                System.out.println("----------NOVY HRAC----------");
                    System.out.print("Prezdivka: ");
                    String prez = sc.next();
                    System.out.print("Herni trida: ");
                    String ht = sc.next();
                    System.out.print("MMR: ");
                try{
                    int mmr = sc.nextInt();
                    sc.nextLine();
                    tf.prichodHrace(new Hrac(prez,ht,mmr));
                }catch(InputMismatchException e){
                    System.err.println("Spatny format MMR (MMR musi byt cele cislo & MMR > 0)");
                    sc.nextLine();
                }
                System.out.println("------------------------------");
                break;
            case 2:
                System.out.println("----------NOVA REGISTRACE----------");
                tf.registraceHrace();
                System.out.println("-----------------------------------");
                break;
            case 3:
                System.out.println("----------VYPIS FRONTY----------");
                tf.vypisHracuVeFronte();
                System.out.println("--------------------------------");
                break;
            case 4:
                System.out.println("----------NAKOUKNUTI NA DALSIHO----------");
                tf.nakoukniKdoJeNaRade();
                System.out.println("-----------------------------------------");
                break;
            case 5:
                System.out.println("----------VYPIS HRACU PODLE MMR----------");
                System.out.print("MMR: ");
                try{
                    int mmr = sc.nextInt();
                    sc.nextLine();
                    tf.vypisHracuVeFrontePodleMMR(mmr);
                }catch(InputMismatchException e){
                    System.err.println("Spatny format MMR (MMR musi byt cele cislo & MMR > 0)");
                    sc.nextLine();
                }
                System.out.println("-----------------------------------------");
                break;
            case 6:
                System.out.println("----------VYHLEDANI HRACE PODLE PREZDIVKY----------");
                System.out.print("Prezdivka: ");
                String p = sc.nextLine();
                tf.vyhledaniHraceVeFronte(p);
                System.out.println("---------------------------------------------------");
                break;
            case 7:
                running = false;
                System.out.print("Aplikace byla ukoncena.");
                break;
            case 8:
                break;
        }
    }
}
