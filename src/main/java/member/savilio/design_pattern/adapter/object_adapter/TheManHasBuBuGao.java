package member.savilio.design_pattern.adapter.object_adapter;

public class TheManHasBuBuGao extends Worker implements JobNeedSkill {
    @Override
    public void speakEnglish() {
        System.out.println("English");
    }

    @Override
    public void speakJapanese() {
        System.out.println("Japanese");
    }

    @Override
    public void speakFrench() {
        System.out.println("French");
    }
}
