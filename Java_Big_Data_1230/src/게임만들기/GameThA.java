package 게임만들기;

public class GameThA extends Thread {
    private Character warrior;  // 외부에서 접근 허용을 막기 위해 private 설정
    private Character wizard;   // Character 클래스 참조 변수를 생성


    // 생성자 호출 시 매개변수로 생성된 캐릭터의 객체를 넘겨받음
    public GameThA(Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    @Override
    public void run() {
        int normal;     // 일반 공격에 대한 확률 구하기
        int special;    // 특수 공격에 대한 확률 구하기
        boolean endGame = false;    // 게임의 진행 여부 판단하는 플래그

        while(true) {
            try {
                sleep(3000);
                normal = (int)(Math.random() * 2); // 50% 확률을 구한다.
                special = (int)(Math.random() * 20); // 5% 확률을 구한다.
                if (normal == 1) { // normal = {0, 1};
                    System.out.println("물리 공격 : " + wizard.name + "에게 " + warrior.pAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                } else {
                    System.out.println("마법 공격 : " + wizard.name + "에게 " + warrior.mAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if (special == 10) { // 10 이라는 값이 나올 확률은 1/20 이다.
                    System.out.println(warrior.name + "궁극기 발동 !!!, " + wizard.name + "에게" + warrior.ultimate() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if (endGame) {
                    System.exit(0);
                }
            }catch (InterruptedException e) {
            }
        }
    }
}
