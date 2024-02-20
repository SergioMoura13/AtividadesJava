package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	
	private Client client;
	
	public Order() {
		 this.moment = new Date();
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = new Date();
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public List<OrderItem> getItems() {
		return items;
	}


	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}


	@Override
	public String toString() {
	    double total = 0.0;

	    StringBuilder sb = new StringBuilder();

	    sb.append("\nOrder Summary:\n");
	    sb.append("Order Moment: ").append(moment);
	    sb.append("\nOrder Status: ").append(status);
	    sb.append("\nClient: ").append(client);

	    for (OrderItem item : items) {
	        sb.append("\n").append(item);
	        total += item.subTotal();
	    }

	    sb.append("\nTotal: ").append(total);

	    return sb.toString();
	}
	
	
	
}
