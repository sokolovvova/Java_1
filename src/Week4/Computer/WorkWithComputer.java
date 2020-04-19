package Week4.Computer;

import java.util.*;

public class WorkWithComputer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String,Drive> map = new HashMap();


        Computer computer = new Computer();
        boolean st;
        int status;
        boolean state=true;
        int nPort=0;
        ArrayList<Computer.USBPort<Drive>> portlist = new ArrayList<>();
        portlist.add(computer.new USBPort<>("port1"));
        portlist.add(computer.new USBPort<>("port2"));
        portlist.add(computer.new USBPort<>("port3"));
        portlist.add(computer.new USBPort<>("port4"));


        map.put("test1",new HDD("data1","audio".toUpperCase()));
        map.put("test2",new USBDrive("data2","file".toUpperCase()));

        while(state){

            System.out.print("\n1.Создать устройство 2.Вывести список устройств 3.Узнать статус портов \n4.Подключить устройство 5.Отключить устройство \n6.Считать данные с устройства 7.Записать данные на устройство \n8.Выход\n>");
            status = sc.nextInt();
            switch(status){
                case 1:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.print("Введите имя устройства: ");
                    String name = sc2.nextLine();
                    System.out.print("Введите данные: ");
                    String d = sc2.nextLine();
                    System.out.print("Введите тип данных (movie,audio,file): ");
                    String t = sc2.nextLine();
                    System.out.print("Введите тип устройства (1.HDD 2.USBDrive): ");
                    int n = sc2.nextInt();
                    if(n==1){
                        map.put(name,new HDD(d,t.toUpperCase()));
                        System.out.println("HDD создан, имя= "+name);
                        break;
                    }
                    else if(n==2){
                        map.put(name,new USBDrive(d,t.toUpperCase()));
                        System.out.println("USBDrive создан, имя= "+name);
                        break;
                    }
                    else{
                        System.out.println("Выбран неправильный тип устройства.");
                        break;
                    }
                case 2:
                    Set<Map.Entry<String,Drive>> set = map.entrySet();
                    String type="Not defined";
                    for(Map.Entry<String,Drive> entry : set){
                        if(entry.getValue().getClass()==HDD.class){
                            type="HDD";
                        }
                        else if(entry.getValue().getClass()==USBDrive.class){
                            type="USBDrive";
                        }
                        System.out.println("имя="+entry.getKey() +" тип="+type);
                    }
                    break;
                case 3:
                    for(Computer.USBPort<Drive> pr: portlist){
                        String s ="USB устройтсво не подключено";
                        if(pr.isUSBPut==true){
                            s ="USB устройтсво подключено";
                        }
                        System.out.println(pr.name+" "+s+" "+pr.driveName);
                    }
                    break;

                case 4:
                    Scanner sc4 = new Scanner(System.in);
                    boolean i=true;
                    System.out.println("Введите имя устройства:");

                    String nUSB = sc4.nextLine();
                    if(map.containsKey(nUSB)==false){
                        System.out.println("Устройства с таким именем не найдено");
                        break;
                    }

                    for(Computer.USBPort<Drive> pr: portlist){
                        if (pr.driveName==nUSB) i=false;
                    }
                    if(!i) {
                        System.out.println("Данное устройство уже подключено в другой порт");
                        break;
                    }

                    System.out.println("Введите номер порта (1..4):");
                    nPort = sc4.nextInt();
                    if(nPort<1||nPort>4){
                        System.out.println("Введен неправильный порт.");
                        break;
                    }
                    st=portlist.get(nPort-1).PutInUSBDrive(nUSB);
                    if(st) System.out.println("Устройство успешно подключено");
                    else System.out.println("Во время подключения произошла ошибка");
                    break;

                case 5:
                    Scanner sc5 = new Scanner(System.in);
                    System.out.println("Введите номер порта(1..4):");
                    nPort = sc5.nextInt();
                    if(nPort<1||nPort>4){
                        System.out.println("Введен неправильный порт.");
                        break;
                    }
                    st=portlist.get(nPort-1).putOutUSBDrive();
                    if(st) System.out.println("Устройство успешно отключено");
                    else System.out.println("Во время отключения произошла ошибка");
                    break;
                case 6:
                    Scanner sc6 = new Scanner(System.in);
                    System.out.println("Введите номер порта(1..4):");
                    nPort = sc6.nextInt();
                    if(nPort<1||nPort>4){
                        System.out.println("Введен неправильный порт.");
                        break;
                    }
                    nPort-=1;
                    st=portlist.get(nPort).printFromUSBDrive(map.get(portlist.get(nPort).driveName));
                    if(!st) System.out.println("Произошла ошибка.");
                    break;
                case 7:
                    Scanner sc7 = new Scanner(System.in);
                    System.out.println("Введите номер порта(1..4):");
                    nPort = sc7.nextInt();
                    if(nPort<1||nPort>4){
                        System.out.println("Введен неправильный порт.");
                        break;
                    }
                    nPort-=1;
                    st=portlist.get(nPort).writeToUSBDrive(map.get(portlist.get(nPort).driveName));
                    if(!st) System.out.println("Произошла ошибка.");
                    break;

                case 8:
                    System.out.println("Завершение работы программы.");
                    state=false;
                    break;
                default:
                    System.out.println("Выбран неправильный пункт меню.");
            }
        }
    }
}
