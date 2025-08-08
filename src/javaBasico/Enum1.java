public enum Enum1 {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;


// enum é uma classe especial que define um conjunto fixo de constantes
// é usado para representar um conjunto de valores pré-definidos, como dias da semana,
public static void main(String[] args) {
    Enum1 obj= Enum1.SEGUNDA;
    if (obj==Enum1.SEGUNDA) {
        System.out.println("segundou");
    }
}
}
