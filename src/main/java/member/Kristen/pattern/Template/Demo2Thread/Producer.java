package member.Kristen.pattern.Template.Demo2Thread;

public class Producer implements Runnable {

    private Resource resource;
    int choice;

    /**
     *
     * @param resource
     * @param choice, 1是胡萝卜 2是韭菜
     */
    public Producer(Resource resource, int choice) {
        this.resource = resource;
        this.choice=choice;
    }

    @Override
    public void run() {
        while(true){
//            while (resource.isOn_off()) {
//                resource.put();
//            }
            resource.put(this.choice);
        }

    }

}