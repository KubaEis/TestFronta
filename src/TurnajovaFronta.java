import java.util.InputMismatchException;

public class TurnajovaFronta {
    private Node rear;
    private Node front;

    public void prichodHrace(Hrac hrac){
        Node n = new Node(hrac);
        if (rear == null){
            rear = n;
            front = n;
        }else{
            rear.setNext(n);
            rear = rear.getNext();
        }
        System.out.println("Hrac byl pridan [Hrac: " + hrac.toString() + "]");
    }

    public void registraceHrace(){
        if (front == null){System.out.println("Fronta je prazdna.");return;}
        System.out.println("Registrace byla uspesna [Hrac: " + front.getData().toString()+ "]");
        front = front.getNext();
        if (front == null){
            rear = null;
            System.out.println("Po obslouzenni fronta je prazdna.");
        }
        nakoukniKdoJeNaRade();
    }

    public void vypisHracuVeFronte(){
        if (front == null){System.out.println("Fronta je prazdna.");return;}
        Node curr = front;
        while (curr != null){
            System.out.println(" - " + curr.getData().toString());
            curr = curr.getNext();
        }
    }

    public void nakoukniKdoJeNaRade(){
        if (front == null){System.out.println("Fronta je prazdna.");return;}
        System.out.println("Dalsi na rade je hrac [" + front.getData().toString() + "]");
    }

    public void vypisHracuVeFrontePodleMMR(int mmr){
        if (mmr < 0){System.out.println("MMR nesmi byt mensi nez 0.");throw new InputMismatchException();}
        if (front == null){System.out.println("Fronta je prazdna.");return;}
        Node curr = front;
        while (curr != null){
            if (curr.getData().getMMR() > mmr){
                System.out.println(" - " + curr.getData().toString());
            }
            curr = curr.getNext();
        }
    }

    public void vyhledaniHraceVeFronte(String prezdivka){
        if (front == null){System.out.println("Fronta je prazdna.");return;}
        Node curr = front;
        boolean nalezen = false;
        while (curr != null){
            if (curr.getData().getPrezdivka().equals(prezdivka)){
                System.out.println(" - " + curr.getData().toString());
                nalezen = true;
            }
            curr = curr.getNext();
        }
        if (!nalezen){System.out.println("Zadny hrac s touto prezdivkou nebyl nalezen.     :(");}
    }
}
