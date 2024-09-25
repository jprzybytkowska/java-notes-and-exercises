public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        //pierwszy operator && = to i - sprawdzenie wartosci pierwszego i drugiego wyrazenia

        System.out.println(firstValue && secondValue); //false
        System.out.println(secondValue && thirdValue); //false

        //operator logiczny lub = || gdy jedno wyrazenie jest = true.

        System.out.println(firstValue || secondValue); //true
        System.out.println(thirdValue || fourthValue); //true
        System.out.println(secondValue || thirdValue); //false

        //operator negacja, zaprzeczenie - ! - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje

        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); // true


    }
}
