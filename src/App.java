public class App {
    public static void main(String[] args) throws Exception {
        var cuenta = new CuentaBancaria("123456789", "Juan Vacca");

        System.out.print(cuenta.showInfoAccount());

        cuenta.setDeposit(100.000);

        System.out.print(cuenta.showInfoAccount());

        cuenta.setWithDraw(50.000);
        System.out.print(cuenta.showInfoAccount());

        cuenta.setWithDraw(0.0);

    }
}
