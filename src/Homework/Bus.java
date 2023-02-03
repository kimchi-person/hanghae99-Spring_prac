package Homework;

public class Bus extends Transport {
    int max_pass = 30;          // 버스의 최대 승객 수
    int curt_pass = 0;          // 현재 탑승 승객 수
    int cost = 1500;
    String status = "운행중";      // 처음 객체 생성시 운행중 부터 시작

    public Bus(int num) {
        this.num = num;         // 상위 클래스에 있는 Transport Bus로 상속 받아와서 생성자를 통해 초기화
    }

    // 승객 변화에 따른 정보
    public void passengers(int pass) {
        curt_pass = pass;
        if (max_pass > curt_pass){
            System.out.println("탑승 승객 수 : " + curt_pass);
            System.out.println("잔여 승객 수 : " + (max_pass - curt_pass));
            System.out.println("요금 확인 : " + cost);
        }else {
            System.out.println("최대 승객 수를 초과했습니다!");
        }

    }

    // 기름에 따른 상태변화 정보
    public void bus_fuel(int gas) {
        curt_gas += gas;
        if (curt_gas <= 10) {
            status = "차고지행";
            System.out.println("주유량 : " + curt_gas);
            System.out.println("주유가 필요합니다.");

        }else {
            System.out.println("주유량 : " + curt_gas);
            status = "운행중";
        }
    }


    //ture : "운행중", false : "차고지행"
    boolean bus_status_change(boolean change) {
        if (change == true){
            status = "운행중";
            System.out.println("상태 : " + status);
        }else {
            status = "차고지행";
            System.out.println("상태 : " + status);
        }
        return change;
    }
}