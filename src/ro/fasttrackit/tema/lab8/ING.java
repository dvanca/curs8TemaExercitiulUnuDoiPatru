package ro.fasttrackit.lab8.tema2;

public class ING implements Bank {
    private int credit;

    ING(){

        this.credit=0;
    }

    @Override
    public String printSoldCont() {
        return "" + this.credit;
    }

    @Override
    public int withdrawal(int amount) {
        if(amount>5){
            if(amount<credit){
                credit = credit-amount;

            }else{
                System.out.println("Fonduri insuficiente.");
                amount =0;
            }

        }else{
            System.out.println("Limita inferioara este 5 Leu");
            amount =0;
        }
        return amount;
    }

    @Override
    public void deposit(int amount) {
        if(amount<5){
            System.out.println("Limita inferioara pentru depunere este 5 Leu");
            amount =0;
        }
        credit += amount;
    }
}
