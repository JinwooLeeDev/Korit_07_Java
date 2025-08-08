package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        TvRemoteController tvRemoteController = new TvRemoteController(powerButton, channelDownButton, channelUpButton);
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );


        tvRemoteController.onPressedPowerButton();
        System.out.println();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println();

        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onDownChannelUpButton();
        /*
            VolumeDownButton / VolumeUpButton 클래스를 생성하고
            얘를 TvRemoteController의 필드에 추가하고
            OnPressedVolumeDownButton() / onDownVolumeDownButton()
            onPredssedVolumeUpButton() / onUpVolumeUpButton() 메서드를 ㅓㅈㅇ의하시고
            Main에서
            음량을 한 칸 내립니다.
            음량을 계속 내립니다.
            음량을 한 칸 올립니다.
            음량을 계속 올립니다.
        */
        System.out.println("=====================================");
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        System.out.println();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onDownVolumeUpButton();

        System.out.println("=====================================");

        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton(),
                new ModeChangeButton()
        );

        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        airConditionerController.onDownTemperatureUpButton();

        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedPowerButton();
    }
}
