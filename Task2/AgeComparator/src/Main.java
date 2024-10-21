//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 2;
        int katyaAge = 10;
        int mishaAge = 17;

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

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else {
            max = mishaAge;
        }

        if (vasyaAge == katyaAge && mishaAge > vasyaAge) {
            middle = katyaAge;
        } else if (vasyaAge == mishaAge && katyaAge > vasyaAge) {
            middle = mishaAge;
        } else if (katyaAge == mishaAge && vasyaAge > katyaAge) {
            middle = mishaAge;
        }else if (vasyaAge != min && vasyaAge != max) {
            middle = vasyaAge;
        } else if (katyaAge != min && katyaAge != max) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }


        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);

    }
}