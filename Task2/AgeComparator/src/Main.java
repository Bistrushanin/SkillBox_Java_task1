//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 14;
        int katyaAge = 60;
        int mishaAge = 23;

        int min = -1;
        int middle = -1;
        int max =-1;

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else {
            min = mishaAge;
        }

        if (vasyaAge != min && (vasyaAge <= katyaAge || vasyaAge <= mishaAge)) {
            middle = vasyaAge;
        } else if (katyaAge != min && (katyaAge <= vasyaAge || katyaAge <= mishaAge)) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }

        if (vasyaAge != min && vasyaAge != middle) {
            max = vasyaAge;
        } else if (katyaAge != min && katyaAge != middle) {
            max = katyaAge;
        } else {
            max = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);

    }
}