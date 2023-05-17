public class ServiceStation {

    public void check(Transport transport) {
        System.out.println("Обслуживаем" + transport.getClass().getName());
        transport.doService(transport);
    }
}