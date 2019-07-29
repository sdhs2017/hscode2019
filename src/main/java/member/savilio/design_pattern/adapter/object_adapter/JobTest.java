package member.savilio.design_pattern.adapter.object_adapter;

public class JobTest {

    static void hireWorker(JobNeedSkill worker){
        System.out.println("Welcome！Show me your skills");
        System.out.println("===========");
        worker.speakChinese();
        worker.speakEnglish();
        worker.speakFrench();
        worker.speakJapanese();
        worker.goodCoding();
        System.out.println("Congratulations！You are fired!");
    }

    public static void main(String[] args) {
        //只会中文的大神coder
        Worker me = new Worker();

        //JobNeedSkill
//        hireWorker(me);

        /**
         *  带步步高
         *  类的适配模式
         */
        TheManHasBuBuGao bbg =new TheManHasBuBuGao();
        hireWorker(bbg);

        /**
         * 自带翻译
         * 对象适配模式
         */
        WorkerHasAssistant gfs = new WorkerHasAssistant(me);
        hireWorker(gfs);



    }

}
