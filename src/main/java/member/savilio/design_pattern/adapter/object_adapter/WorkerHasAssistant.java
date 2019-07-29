package member.savilio.design_pattern.adapter.object_adapter;

public class WorkerHasAssistant implements JobNeedSkill {
    //自带翻译，组合
    private Worker worker;
    public WorkerHasAssistant(Worker worker){
        this.worker=worker;
    }

    @Override
    public void speakChinese() {
        worker.speakChinese();
    }

    @Override
    public void speakEnglish() {
        System.out.println("Chinese to English");
    }

    @Override
    public void speakJapanese() {
        System.out.println("Japanese to English");
    }

    @Override
    public void speakFrench() {
        System.out.println("French to English");
    }

    @Override
    public void goodCoding() {
        worker.goodCoding();
    }
}
