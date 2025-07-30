public class FOR {
    public static void main(String[] args) throws Exception {
    for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == j) break;                                      //la estructura del for son engranajes, EL ENGRANAJE GRANDE CORRE PARA DARLE ENERGIA AL ENGRANAJE PEQUEÑO
        System.out.print(i + ", " + j + " ");                   //EL PEQUEÑO CORRE Y CUANDO FINALICE SE REINICIA Y LE DA EL SIGUIENTE PASO AL ENGRANAJE GRANDE NHASTA SU FIN MUTUO
    }
}

    }
}
