public class Bank {

    private int pin;
    String acc_number = "SBI0001";

    double balance = 2000000.00;

    public void setData(int u_pin) {
        pin = u_pin;
    }

    public int getData() {
        return pin;
    }

    void deposite(int pin, double amount) {
        if (this.pin == pin) {
            balance += amount;
            System.out.println("amt deposited successfully");
        } else {
            System.out.println("invalid pin");
        }
    }

    void withdrawal(int pin, double amount) {
        if (this.pin == pin) {
            if (amount > balance) {
                System.out.println("insufficient balance");
            } else {
                balance -= amount;
                System.out.println("amt withdwarn sucessfully");
            }
        }
    }
        void checkbalance(int pin){
        if(this.pin==pin){
            System.out.println("current balance"+balance);
        }
        else
        {
            System.out.println("invalid pin");
        }
        }
    }
