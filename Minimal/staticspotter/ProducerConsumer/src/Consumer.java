
public class Consumer implements IConsumer {

	private Producer producer;

	public Consumer(){
		this.producer = new Producer( );
	}

	@Override
	public void consumeItem() {
		synchronized (producer) {
			if( producer != null && producer.canProduce( ) ){
				System.out.println("Item Consumed");
			}
		}
	}

	@Override
	public boolean canConsume() {
		synchronized (producer) {
			if( producer != null && producer.canProduce()){
				return true;
			}
			return false;
		}
	}




}
