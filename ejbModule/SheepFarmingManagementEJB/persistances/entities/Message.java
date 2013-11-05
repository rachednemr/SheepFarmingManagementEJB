package SheepFarmingManagementEJB.persistances.entities;
import java.io.Serializable;

import javax.persistence.*;
@Entity

@Table(name = "message")
public class Message  implements Serializable {

private String topic;
private String Type;//alert or notification
private String text;
private User sender;
private User receiver;
private MessageFk messagefk;

	private static final long serialVersionUID = 1L;
public Message() {
		super();
	}
public Message(String topic, String type, String text) {
		super();
		this.topic = topic;
		Type = type;
		this.text = text;
	}


public String getTopic() {
	return topic;
}
public void setTopic(String topic) {
	this.topic = topic;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}

@ManyToOne
@JoinColumn(name = "idsender", referencedColumnName = "idUser", insertable = false, updatable = false)
public User getSender() {
	return sender;
}
public void setSender(User sender) {
	this.sender = sender;
}

@ManyToOne
@JoinColumn(name = "idreceiver", referencedColumnName = "idUser", insertable = false, updatable = false)
public User getReceiver() {
	return receiver;
}
public void setReceiver(User receiver) {
	this.receiver = receiver;
}
@EmbeddedId
public MessageFk getMessagefk() {
	return messagefk;
}
public void setMessagefk(MessageFk messagefk) {
	this.messagefk = messagefk;
}

}
