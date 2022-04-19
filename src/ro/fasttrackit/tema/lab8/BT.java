package ro.fasttrackit.tema.lab8;

public class BT implements Bank {
    private int credit;

    BT(){
        this.credit=0;
    }

    @Override
    public String printSoldCont() {
        return "Bine v-am gasit la BT, soldul dumneavoastra este de" + this.credit + " RON";
    }

    @Override
    public int withdrawal(int amount) {
        if(amount<10){
            System.out.println("Ne pare rau, nu puteti efectua retrageri, soldul este sub limita minima.");
            amount =0;
        }
        return this.credit-amount;
    }

    @Override
    public void deposit(int amount) {
        if(amount>3000){
            System.out.println("Ne pare rau, limita de depundere maxima pe zi este de 3000 RON");
        }else if(amount>9){
            this.credit=this.credit+amount;
        }else{
            System.out.println("Ne pare rau dar suma de depozitare este prea mica.");
        }
    }
}
