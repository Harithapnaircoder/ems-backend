package ems.example.ems.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Events")
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Event_id")
    private long event_id;

    @Column(name = "Event_name")
    private String event_name;

    @Column(name = "Event_logo")
    private String logo;

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
