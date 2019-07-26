package member.savilio.design_pattern.producer_consumer.demo6;


public class Producer implements Runnable {

    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while(true){
//            while (resource.isOn_off()) {
//                resource.put();
//            }
            resource.put();
        }

    }

}