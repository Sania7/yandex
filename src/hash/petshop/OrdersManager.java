package hash.petshop;

import java.util.ArrayList;
import java.util.HashMap;

public class OrdersManager {
    HashMap<String, ArrayList<Double>> customersOrders;

    public OrdersManager() {
        customersOrders = new HashMap<>();
        ArrayList<Double> orders = new ArrayList<>();
        orders.add(154.43);
        orders.add(5453.98);
        orders.add(8776.65);
        customersOrders.put("Иван И.", orders);

        orders = new ArrayList<>();
        orders.add(25343.54);
        orders.add(420.50);
        customersOrders.put("Ольга С.", orders);

        orders = new ArrayList<>();
        orders.add(325.90);
        customersOrders.put("Александр Т.", orders);

        orders = new ArrayList<>();
        orders.add(253.54);
        orders.add(420.50);
        customersOrders.put("Александр Р.", orders);

        orders = new ArrayList<>();
        orders.add(780.54);
        orders.add(420.50);
        orders.add(36343.54);
        orders.add(2000.50);
        customersOrders.put("Екатерина О.", orders);
    }

    // 1.
    void printAllOrders() { // напечатать все заказы
        for (String name : customersOrders.keySet()) { // Цикл должен пройтись по ключам
            System.out.println("Заказы " + name + ":");
            ArrayList<Double> value = customersOrders.get(name);
            System.out.println(value);
        }
    }

    // 2.
    double getOrdersSum() { // получить сумму заказов
        double sum = 0;
        for (ArrayList<Double> orders : customersOrders.values()) { // Здесь должен быть обход по значениям
            for (double orderPrice : orders) {
                sum += orderPrice;
            }
        }
        return sum;
    }

    // 3.
    void printCustomerOrders(String customerName) { // распечатать заказы клиентов
        if (customersOrders.containsKey(customerName)) { // Проверьте, есть ли указанный ключ в таблице
            System.out.println("Заказы " + customerName + ":");
            System.out.println(customersOrders.get(customerName));
        }
    }
    // 4.
    String getMaxOrderCustomerName() { // получить клиента с максимальными заказами
        double maxOrder = 0; // Допишите логику работы метода
        String customerName = "";

        for (String name : customersOrders.keySet()) {
            ArrayList<Double> orders = customersOrders.get(name);
            double sum = 0;
            for (int i = 0; i < orders.size(); i++) {
                sum += orders.get(i);
                if (sum > maxOrder) {
                    maxOrder = sum;
                    customerName = name;
                }
            }
        }
        return customerName;
    }

    void removeUnprofitableOrders() {
        ArrayList<String> names = new ArrayList<>();  // Создайте список клиентов с заказами меньше 5000
        for (String name : customersOrders.keySet()) {
            ArrayList<Double> orders = customersOrders.get(name);
            double ordersSum = 0;
            for (Double order : orders) {
                ordersSum += order;
            }
            if (ordersSum < 5000) {
                names.add(name);
        }// Наполните список names

    }

        for (String name : names) {
            customersOrders.remove(name);
            // Удалите из хеш-таблицы тех, чьи расходы не превышают 5000

            System.out.println("Клиента " + name + " больше нет в таблице.");
        }
    }
}