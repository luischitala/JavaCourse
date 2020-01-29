public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){

            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");
            int i = 0;
            i++;
        } else {
            fileSended--;
            System.out.println("Por favor encienda el Bluethooth");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);


    }
}
