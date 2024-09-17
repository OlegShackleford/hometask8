package ht8_1;

public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone();
        Phone phoneThree = new Phone();
        System.out.println("PhoneOne " + phoneOne.getModel()+ " " + phoneOne.getNumber()+ " " + phoneOne.getWeight());
        System.out.println("PhoneTwo " + phoneTwo.getModel()+ " " + phoneTwo.getNumber()+ " " + phoneTwo.getWeight());
        System.out.println("PhoneThree " + phoneThree.getModel()+ " " + phoneThree.getNumber()+ " " + phoneThree.getWeight());
        phoneOne.receiveCall("Андрей");
        phoneTwo.receiveCall("Пётр");
        phoneThree.receiveCall("Сергей");
        phoneOne = new Phone("89093903245","LG-1",500);
        phoneTwo = new Phone("89193953344","Motorolla-2",450);
        phoneThree = new Phone("89554923023","Iphone-10",200);

        phoneOne = new Phone("89093903245","LG-1");
        phoneTwo = new Phone("89193953344","Motorolla-2");
        phoneThree = new Phone("89554923023","Iphone-10");
        phoneOne.receiveCall("Федор","+7-910-666-12-21");
        phoneTwo.receiveCall("Балбес","+1-123-321-34-24");
        phoneThree.receiveCall("Кот","У меня лапки");
        System.out.println();
        String[] numbers = {"123456789","987654321"};
        phoneOne.sendMessage(numbers);
    }
}
