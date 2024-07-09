import static javax.swing.JOptionPane.*;

class BankAcc{
    double rate;
    Person fellow;

    public BankAcc(String name, double money, int time, double r) {
        rate = r;
        fellow = new Person(name, money, time);
    }
    void show(){
        showMessageDialog(null, fellow, "Депозит", INFORMATION_MESSAGE);
    }
    class Person{
        String name;
        double money;
        int time;

        double getMoney(){
            double s = money;
            for(int k = 1; k <= time; k++){
                s*=(1+rate/100);
            }
            s = Math.round(s*100)/100.0;
            return s;
        }
        public String toString(){
            String txt = "Имя: " + name + "\n";
            txt += "Начальная сумма: " + money + "\n";
            txt += "Проценты: " + rate + "\n";
            txt += "Время (лет): " + time + "\n";
            txt += "Итоговая сумма: " + getMoney();
            return txt;
        }

        public Person(String txt, double m, int t) {
            name = txt;
            money = m;
            time = t;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        BankAcc ivanov = new BankAcc("Иванов Иван", 1000.0, 5, 8.0);
        ivanov.show();
    }
}
