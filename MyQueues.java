package EjerciciosTareaQueuesStacks;

public class MyQueues {
	
	char[] queues;
	char r;
	int max;
	int tail;
	int head;
	
	public  MyQueues (int size) {
		this.max = size;
		this.queues = new char [size];
		}

	public char EliminaryRecorrer() {
		if (tail == 0) {
			System.out.println("Queue is empty");
			return ('#');
		}
		else {
			tail--;
			char temp = queues[0];
			for(int i = 0;i < tail ;i++ ) {
			queues [i] =  queues[i+1];
			}
			queues[tail] = ' ';
			return temp;
			}
		}
	public void AgregarValor(char data ) {
		if(tail == max) {
			System.out.println("Queue is full");
		}
		else {
			queues[tail] = data;
			tail++;
		}
	}	
}
