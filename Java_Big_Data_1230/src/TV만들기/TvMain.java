package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTv = new TV();
        TV lgTv = new TV(true, 50, 15);

        samsungTv.setON(true);
        samsungTv.setChannel(130);
        samsungTv.setVolume(30);
        samsungTv.setChannel(1000);

        samsungTv.getTV();
        lgTv.getTV();

    }
}
