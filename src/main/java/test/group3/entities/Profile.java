package test.group3.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Profile {

    @Id
	@GeneratedValue(generator = "uuid")
    private long id;

    private String rol;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Profile(String rol, User user) {
        this.rol = rol;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
}
