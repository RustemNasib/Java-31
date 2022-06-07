package lesson8;

import java.sql.Date;

public class User {
    private String pathToAvatar= "https://images.wbstatic.net/img/0/medium/PersonalPhoto.png?2?1";
    private String name;
    private String location;
    private Date registration;

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getRegistration(java.util.Date date) {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    @Override
    public boolean equals(Object o) {
        // this - user1
        // o - user2
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
// приведение типа
        User user = (User) o;

        if (pathToAvatar != null ? !pathToAvatar.equals(user.pathToAvatar) : user.pathToAvatar != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (location != null ? !location.equals(user.location) : user.location != null) return false;
        return registration != null ? registration.equals(user.registration) : user.registration == null;

    }

    @Override
    public int hashCode() {
        int result = pathToAvatar != null ? pathToAvatar.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (registration != null ? registration.hashCode() : 0);
        return result;
    }
}
