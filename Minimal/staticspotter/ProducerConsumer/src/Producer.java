
public class Producer implements IProducer {

	private Consumer consumer;

	public Producer(){
		this.consumer = new Consumer( );
	}

	@Override
	public void produceItem() {
		synchronized (consumer) {
			if( consumer != null && consumer.canConsume( )){
				System.out.println("Item Produced");
			}
		}
	}

	@Override
	public boolean canProduce() {
		synchronized (consumer) {
			if( consumer != null && consumer.canConsume( )){
				return true;
			}
			return false;
		}
	}

	
}
