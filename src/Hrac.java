public class Hrac {
    private String prezdivka;
    private String hreniTrida;
    private int MMR;

    public Hrac(String prezdivka, String hreniTrida, int MMR) {
        this.prezdivka = prezdivka;
        this.hreniTrida = hreniTrida;
        this.MMR = MMR;
    }

    public String getPrezdivka() {
        return prezdivka;
    }

    public void setPrezdivka(String prezdivka) {
        this.prezdivka = prezdivka;
    }

    public String getHreniTrida() {
        return hreniTrida;
    }

    public void setHreniTrida(String hreniTrida) {
        this.hreniTrida = hreniTrida;
    }

    public int getMMR() {
        return MMR;
    }

    public void setMMR(int MMR) {
        this.MMR = MMR;
    }

    @Override
    public String toString() {
        return "prezdivka: " + prezdivka +
                "| hreniTrida: " + hreniTrida +
                "| MMR: " + MMR;
    }
}
