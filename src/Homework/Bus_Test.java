package Homework;

public class Bus_Test {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1);           // 1번 버스
        Bus bus2 = new Bus(2);           // 2번 버스

        System.out.println(bus1.num + "번 버스 객체 생성완료!");
        System.out.println(bus2.num + "번 버스 객체 생성완료!");
        bus1.passengers(2);         // 새로운 탑승 승객 수, 잔여 승객 수, 새로운 탑승자가 지불한 돈
        bus1.bus_fuel(-50);     // 기존 gas = 100 에서 -50 == 50으로 떨굼
        bus1.bus_status_change(false);      // 기존 "운행중" 에서 수동으로 "차고지행" 으로 변경
        bus1.bus_fuel(10);      // 떨궈놨던 gas == 50 에서 +10을 충전 == 60으로 올림
        bus1.passengers(45);        // 승객 수 30명 초과로 "최대 승객 수를 초과했습니다!" 출력
        bus1.passengers(5);         // 승객 수를 쌓지 않아서 5명 입력 시 기존 2를 무시하고 0 => 5으로 변경 후 정보 출력
        bus1.bus_fuel(-55);     // 올려놨던 gas == 60 에서 -55를 떨궈서 주유량 : 5, "주유가 필요합니다" 출력
        bus1.bus_status_change(true);       // 변경했던 "차고지행" 에서 수동으로 "운행중" 으로 변경
    }
}

