package oppsLLD.introOOP.task;

import lombok.Getter;
import lombok.Setter;

public class BankAccount {

    String oWnerName;
    @Getter
    @Setter
    double balance;

    void  deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }

    }

    void withDraw(double amount){

        if (amount > 0 && balance > amount){
             balance -= amount;
        }


    }
}
